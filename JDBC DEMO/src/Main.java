import java.sql.*;
public class Main {
   private static final String url="jdbc:mysql://127.0.0.1:3306/?user=root";
   private static final String username="root";
   private static final String password="";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            // e.printStackTrace();
            System.out.println(e.getMessage());

        }
        // connection
try{
 Connection connection=DriverManager.getConnection(url,username,password);
 Statement statement=connection.createStatement();
}
catch(SQLException e){
    System.out.println(e.getMessage()); // e.printStackTrace();


        }
    }
}