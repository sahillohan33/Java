package Methods;

public class learnmethod {

	public static void main(String[] args) {
		/*
		System.out.println("1");
		System.out.println("2");
		great();
		System.out.println("3");
		System.out.println("4");
		*/
		average(4,6);
	}
	
	static void great() {
		System.out.println("5");
		System.out.println("Hello world");
		System.out.println("6");
	}

	
	public static void average(int a,int b) {
		int avg=(a+b)/2;
		System.out.println("The average is "+avg);
	}
}
