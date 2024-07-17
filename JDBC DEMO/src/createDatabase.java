import java.sql.*;
public class createDatabase {
    private static final String url="jdbc:mysql://localhost/";
    private static final String username="root";
    private static final String password="sahil930";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String query="create database college";
            statement.executeUpdate(query);
            System.out.println("Database created successfully");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
