package Operator;

public class nestedloops {

	public static void main(String[] args) {
		/*
		for(int count=0;count<10;count++) {
		for(int i=1;i<=7;i++) {
			System.out.print(i+" ");
		}
		System.out.println("Printed "+count);
		}
		*/
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
