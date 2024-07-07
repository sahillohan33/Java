package OOPS;

class Greet{
	void greetings(){
		System.out.println("Hello, Good Morning");
	}
	void greetings(String name) {
		System.out.println("Hello "+name+", Good Morning ");
	}
	void greetings(String name,int count) {
		for(int i=0;i<count;i++) {
			System.out.println("Hello "+name+", Good Morning ");
		}
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Greet Obj=new Greet();
		// Obj.greetings();
		// Obj.greetings("Sahil");
		Obj.greetings("Rohit",6);
	}

}
