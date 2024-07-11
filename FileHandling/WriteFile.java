package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
	
	public static void main(String[] args) {
		try {
		FileWriter myFile=new FileWriter("filename.txt");
		myFile.write("Files in java ");
		myFile.close();
		System.out.println("Successfully Write");

	}
		catch(IOException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		finally {
			System.out.println("This block Always");
		}

	}
	}
