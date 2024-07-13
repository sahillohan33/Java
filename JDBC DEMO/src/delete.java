import java.sql.*;
public class delete {
    private static final String url="jdbc:mysql://127.0.0.1:3306/mydb";
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
        String query="Delete from student where id=2";
        int rowAffected=statement.executeUpdate(query);
        if(rowAffected>0){
            System.out.println("Data deleted successfully");
        }
        else{
            System.out.println("Data not deleted");
        }

    }
    catch(SQLException e){
        e.printStackTrace();
    }
    }
}
