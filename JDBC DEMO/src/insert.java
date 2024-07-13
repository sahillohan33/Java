import java.sql.*;
public class insert {
    private  static final String url="jdbc:mysql://127.0.0.1:3306/mydb";
    private  static final String username="root";
    private  static final String password="sahil930";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String query=String.format("insert into student(name,age,marks) values('%s',%o,%f)","Rahul",25,68.9);
            int rowAffected=statement.executeUpdate(query);
if(rowAffected>0){
    System.out.println("Data Inserted Successfully");
}
else{
    System.out.println("Data not Insterted");
}
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
