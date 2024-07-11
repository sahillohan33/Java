package ExceptionHandling;

public class ErrorHandling {
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied- You must be atleast 18 year old ");
		}
		else {
			System.out.println("Access granted - You are old enough");
		}
		
	}

	public static void main(String[] args) {
		
		try{
		int myNumber[]= {1,3,4,5,6};
		System.out.println("My Number is "+myNumber[10]); // error
		}
		catch(Exception e) {
			System.out.println("Something went wrong"+e);
		}
		finally {
			System.out.println("This method always run");
		}
				// checkAge(14);
		checkAge(18);
	}

}
