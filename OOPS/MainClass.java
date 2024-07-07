package OOPS;

class Dog{
	String name;
	int age;
	String color;
	void walk() {
		System.out.println(name+" is walking");
	}
	void bark() {
		System.out.println(name+" is barking");
	}
}

class Complex{
	int a,b;
	void print() {
		System.out.println(a+" + "+" i"+b);
	}
}
public class MainClass {

	public static void main(String[] args) {
	/*	Dog d1=new Dog();
		d1.name="Tommy";
		d1.walk();
		d1.bark();
		
		Dog d2= new Dog();
		d2.name="Leo";
		d2.walk();
		d2.bark();
		*/
		
		Complex num1=new Complex();
		num1.a=5;
		num1.b=7;
		num1.print();

	}

}
