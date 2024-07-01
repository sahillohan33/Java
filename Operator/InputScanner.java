package Operator;
import java.util.Scanner;
public class InputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the your age : ");
	        int age= sc.nextInt();
	        System.out.println("Your age is "+age);
	        
	        Scanner username=new Scanner(System.in);
	        System.out.println("Enter the name :");
	        String name=username.nextLine();
	        System.out.println("Your name is "+name);
	        sc.close();
	        username.close();
	}

}
