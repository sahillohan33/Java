package ProblemJavaPractice;
import java.util.Scanner;
public class one1 {

	public static void main(String[] args) {
		/*
		  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
		Test Data:
		Input first number: 125
		Input second number: 24
		Expected Output :
		125 + 24 = 149
		125 - 24 = 101
		125 x 24 = 3000
		125 / 24 = 5
		125 mod 24 = 5
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Input first number :");
		int num1=input.nextInt();
		
		System.out.println("Input second number :");
		int num2=input.nextInt();
		
		System.out.println(num1+" + "+num2+ " = "+(num1+num2));
		
		System.out.println(num1+" * "+num2+ " = "+(num1*num2));
		
		System.out.println(num1+" - "+num2+ " = "+(num1-num2));
		
		System.out.println(num1+" / "+num2+ " = "+(num1/num2));
		
		System.out.println(num1+" mod "+num2+ " = "+(num1%num2));
		

	}

}
