import java.sql.*;
public class preStatement {
    private static final String url="jdbc:mysql://127.0.0.1:3306/mydb";
    private static final String username="root";
    private  static final String password="sahil930";
    public static void main(String[] args) {
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    }
    catch(ClassNotFoundException e){
        e.printStackTrace();
    }
    try{
    Connection connection=DriverManager.getConnection(url,username,password);
    String query="insert into student(name,age,marks) values(?,?,?)";
    PreparedStatement preparedStatement=connection.prepareStatement(query);
    preparedStatement.setString(1,"Ankita");
    preparedStatement.setInt(2,26);
    preparedStatement.setDouble(3,80.1);
    int rowAffected=preparedStatement.executeUpdate();
    if(rowAffected>0){
        System.out.println("Data inserted successfully");
    }
    else{
        System.out.println("Data not inserted");
    }
    }
    catch(SQLException e){
        e.printStackTrace();
    }
    }
}
