import java.sql.*;
import java.util.Scanner;

public class Batchp {
    private static final String url="jdbc:mysql://127.0.0.1:3306/mydb";
    private static final String username="root";
    private static final String password="sahil930";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            Scanner scanner=new Scanner(System.in);
            while(true){
                System.out.print("Enter Name: ");
                String name=scanner.next();
                System.out.print("Enter Age: ");
                int age=scanner.nextInt();
                System.out.print("Enter marks: ");
                double marks=scanner.nextDouble();
                System.out.print("Enter more data Y/N: ");
                String choice=scanner.next();
                String query=String.format("insert into student(name,age,marks) values('%s',%o,%f)",name,age,marks);
                statement.addBatch(query);
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] rowAffected=statement.executeBatch();
            for(int i=0;i<rowAffected.length;i++){
                if(rowAffected[i]==0) {
                    System.out.println("Query: " + i + " not executed successfully");
                }
            }

        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
