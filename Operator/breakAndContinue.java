package Operator;

public class breakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break statement
		/*
		for(int i=0;i<=20;i+=2) {
			System.out.println(i);
			if(i>=10) break;
	}
	*/
		/*
		int i=0;
		while(i<=7) {
			System.out.println(i);
			i++;
			if(i==3) break;
		}
		*/
		
		// continue 
		for(int i=0;i<=20;i+=2) {
			
			if(i==10 || i==16) continue;
			System.out.println("gave tea to "+i);
	}
		
}
}
