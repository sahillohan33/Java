import java.sql.*;
import java.util.Scanner;

public class transaction1 {
    private static final String url="jdbc:mysql://127.0.0.1:3306/lenden";
    private static final String username="root";
    private static final String password="sahil930";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try(Connection connection=DriverManager.getConnection(url,username,password);){
            Scanner scanner=new Scanner(System.in);
            String debitQuery="update account set balance=balance-? where account_number=?";
            String creditQuery="update account set balance=balance+? where account_number=?";
            System.out.print("Enter the amount to transfer : ");
            double amount=scanner.nextDouble();
            if(isSufficient(connection,102,amount)){
                try(PreparedStatement debitPreparedStatement=connection.prepareStatement(debitQuery);
                PreparedStatement creditPreparedStatement=connection.prepareStatement(creditQuery);
                )
                {
                    connection.setAutoCommit(false);
                    debitPreparedStatement.setDouble(1,amount);
                    debitPreparedStatement.setInt(2,102);
                    creditPreparedStatement.setDouble(1,amount);
                    creditPreparedStatement.setInt(2,101);
                    int rowAffectedDebit=debitPreparedStatement.executeUpdate();
                    int rowAffectedCredit=creditPreparedStatement.executeUpdate();
                    if(rowAffectedDebit>0 && rowAffectedCredit>0){
                        connection.commit();
                        System.out.println("Transaction successfully");
                    }
                    else{
                        connection.rollback();
                        System.out.println("Transaction Failed. Roll Back");
                    }

                }
                catch (SQLException e){
                    connection.rollback();
                    System.out.println("Transaction failed "+e.getMessage());
                }
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
        static boolean isSufficient(Connection connection, int accountNumber, double amount) {
            String query = "SELECT balance FROM account WHERE account_number = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, accountNumber);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        double currentBalance = resultSet.getDouble("balance");
                        return amount <= currentBalance;
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error checking balance: " + e.getMessage());
            }
            return false;
        }
    }
