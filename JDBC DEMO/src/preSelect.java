import java.sql.*;
public class preSelect {
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
            String query="Select marks from student where id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,1);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                double marks=resultSet.getDouble("marks");
                System.out.println("Marks : "+marks);
            }
            else{
                System.out.println("Marks not found");
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
