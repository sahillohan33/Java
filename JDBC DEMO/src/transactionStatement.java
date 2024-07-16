import java.sql.*;
import java.util.Scanner;

public class transactionStatement {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/lenden";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "sahil930";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
            return;
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            String debitQuery = "UPDATE account SET balance = balance - ? WHERE account_number = ?";
            String creditQuery = "UPDATE account SET balance = balance + ? WHERE account_number = ?";

            System.out.print("Enter the amount to transfer: ");
            double amount = scanner.nextDouble();

            if (isSufficient(connection, 102, amount)) {
                try (PreparedStatement debitPreparedStatement = connection.prepareStatement(debitQuery);
                     PreparedStatement creditPreparedStatement = connection.prepareStatement(creditQuery)) {

                    connection.setAutoCommit(false);

                    debitPreparedStatement.setDouble(1, amount);
                    debitPreparedStatement.setInt(2, 102);
                    int rowsAffectedDebit = debitPreparedStatement.executeUpdate();

                    creditPreparedStatement.setDouble(1, amount);
                    creditPreparedStatement.setInt(2, 101);
                    int rowsAffectedCredit = creditPreparedStatement.executeUpdate();

                    if (rowsAffectedDebit > 0 && rowsAffectedCredit > 0) {
                        connection.commit();
                        System.out.println("Transaction successful!");
                    } else {
                        connection.rollback();
                        System.out.println("Transaction failed. Rolled back.");
                    }
                } catch (SQLException e) {
                    connection.rollback();
                    System.out.println("Transaction failed: " + e.getMessage());
                }
            } else {
                System.out.println("Insufficient balance.");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
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



