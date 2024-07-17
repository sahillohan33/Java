import java.sql.*;
import java.io.*;
public class imageRetrieve {
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
            String query="select * from imageTable";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                String name=resultSet.getString("name");
                InputStream inputStream=resultSet.getBinaryStream("image");
                try(FileOutputStream outputStream=new FileOutputStream("output_image.jpg")){
                        byte[] buffer=new byte[1024];
                        while(inputStream.read(buffer)>0){
                            outputStream.write(buffer);
                        }
                    System.out.println("Image retrieving and saved ");
                }
                catch (IOException e){
                    System.out.println(e.getMessage());
                }

            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
