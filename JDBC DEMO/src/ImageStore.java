import java.sql.*;
import java.io.*;

public class ImageStore {
    private static final String url="jdbc:mysql://localhost/imageStore";
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
            // create table imageTable(id int auto_increment primary key,name varchAR(255) not null,image longblob not null);
            String query="insert into imageTable(name,image) values(?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"Sahil");
            String imageUrl="C:\\Users\\Sahil Lohan\\IdeaProjects\\JDBC DEMO\\src\\1.jpg";
            File  imageFile=new File(imageUrl);
            FileInputStream inputStream = new FileInputStream(imageFile);
            preparedStatement.setBlob(2,inputStream);
            int rowAffected=preparedStatement.executeUpdate();

            System.out.println(rowAffected+" row(s) inserted...");


        }
        catch (SQLException |IOException e){
            System.out.println(e.getMessage());
        }
    }
}
