package interfacePackage;

public class LearnInterfaces {
	public static void main(String[] args) {
		Monkey obj=new Monkey();
		obj.eats();
	}
}

interface Animal{
	// default abstract and public class 
	void eats();
}
	
class Monkey implements Animal{
	
	public void eats() {
		System.out.println("Monkey is eating");
	}
}