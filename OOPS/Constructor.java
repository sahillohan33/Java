package OOPS;

class Complex1{
	int a,b;
	public Complex1(int real,int img) {
		a=real;
		b=img;
	}
	void print() {
		System.out.println(+a+" + "+" i"+b);
	}
}
public class Constructor {

	public static void main(String[] args) {
		Complex1 obj=new Complex1(5,6);
		// obj.print();
		
		obj.print();
	}

}
