package Operator;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if else statement
		/*
		int age=4;
		if(age>=18) {
			System.out.println("You can vote");	
			System.out.println("Good Morning");
		}
		else {
			System.out.println("You cannot note");
		}
		int day=1;
		if(day==1) {
			System.out.println("Go to home");
		}
		else {
			System.out.println("Go to office");
		}
		*/
		
		
		// if else if else statment
		/*
		int day=4;
		if(day==1) {
			System.out.println("Go to Home");
		}
		else if(day==2){
			System.out.println("Go to Village");
		}
		else if(day==3) {
			System.out.println("Go to City");
		}
		else if(day==4) {
			System.out.println("Go to Party");
		}
		else {
			System.out.println("Go to Office");
		}
		*/
		
		// Nested if-else statement
		
		// Your are given three numbers , find the maximum number
		
		int a=4;
		int b=8;
		int c=10;
		
		if(a>b) {
			System.out.println("a is bigger than b ");
			if(a>c) {
				System.out.println("a is bigger than c ");
				System.out.println("a is largest "+a);
			}
			else {
				System.out.println("c is bigger than a ");
				System.out.println("c is largest "+c);
			}
			
		}
		else {
			System.out.println("b is bigger than a ");
			if(b>c) {
				System.out.println("b is bigger than c ");
				System.out.println("b is largest "+b);
			}
			else {
				System.out.println("c is bigger than b");
				System.out.println("c is largest "+c);
			}
		}
		
		
	}

}
