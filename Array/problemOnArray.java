package Array;

public class problemOnArray {

	public static void main(String[] args) {
		int numbers[]= {45,56,67,89,39,2,50,78,89,68,74};
		// sum
		/*
		int sum=0;
		for( int number:numbers) {
			// sum=sum+number;
			sum+=number;
		}
		System.out.println("Sum is "+sum);
*/
		
		// int min=100;
		int min=Integer.MAX_VALUE;
		for(int number:numbers) {
			if(number<min) {
				min=number;
			}
		}
		System.out.println("Minium is "+min);
	}

}
