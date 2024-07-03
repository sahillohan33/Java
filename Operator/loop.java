package Operator;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i=0;i<7;i++) {
			System.out.println(i);
		}
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	/*	for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+i*n);
		}
		*/
		
		// 1+2+3+4+5=15
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
		
	}

}
