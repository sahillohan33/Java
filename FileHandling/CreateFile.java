package FileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File myFile=new File("Filename.txt");
			if(myFile.createNewFile()) {
				System.out.println("File created :"+myFile.getName());
			}
			else {
				System.out.println("File already exits...");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		finally {
			System.out.println("This Block always running");
		}
		

	}

}
