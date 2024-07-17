import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class createTable {
    private static final String url="jdbc:mysql://localhost/college";
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
            String query="create table student(id int auto_increment primary key,name varchar(255) not null,class varchar(255) not null,roll_no int(20) not null)";
            statement.executeUpdate(query);
            System.out.println("Created Table successfully");



        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
