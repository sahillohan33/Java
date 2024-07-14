import java.sql.*;
public class preDelete {
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
        String query ="Delete from student where id =?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,5);
        int rowAffected=preparedStatement.executeUpdate();
        if(rowAffected>0){
            System.out.println("Data Deleted Successfully");
        }
        else{
            System.out.println("Data not Deleted");
        }
    }
    catch(SQLException e){
        e.printStackTrace();
    }
    }
}
