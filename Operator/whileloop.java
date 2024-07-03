package Operator;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=0;
		while(a<5) {
			System.out.println(a);
			a++;
		}
		*/
		
		Scanner sc=new Scanner(System.in);
		boolean hasLearnt=false;
		
		while(!hasLearnt) {
			System.out.println("Went to School, tried to learn");
			
			System.out.println("Have you understood");
			hasLearnt=sc.nextBoolean();
		}
		
		int i=10;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=15);
		
		
	}

}
