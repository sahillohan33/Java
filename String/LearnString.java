package String;
import java.util.Scanner;
public class LearnString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the First Name : ");
		String firstName=input.nextLine();
		
		System.out.println("Enter the Last Name : ");
		String lastName=input.nextLine();
		System.out.println("You are Full Name " +(firstName +" "+ lastName));
	}

}
