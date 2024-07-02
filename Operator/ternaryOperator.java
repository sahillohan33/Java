package Operator;

public class ternaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=23;
		int c=25;
		int max=0;
		/*
		if(a>b) {
			max=a;
		}
		else {
			max=b;
		}
		System.out.println("value of max is "+max);
		
		*/
		// ternary operator use
		
		// max=a>b ? a : b;
		
		// nested 
		
		max = a > b ? a > c ? a : c : b > c ? b : c; 
		System.out.println("value of max is "+max);
	}

}
