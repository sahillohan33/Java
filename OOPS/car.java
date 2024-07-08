package OOPS;

 class Vehicle{
	 int wheelsCount;
	 void start() {
		 System.out.println("Vehcile is starting");
		 }
	 Vehicle(){
		 System.out.println("Vehicle is creation instance");
	 }
 }
public class car  extends Vehicle{

	void start() {
		super.start();
		System.out.println(+this.wheelsCount+" "+"Car is starting");
	}
	 car(){
		 System.out.println("Car is creation instance");
	 }
	public static void main(String[] args) {
		car obj=new car();
		Vehicle obj1=new Vehicle();
		obj.wheelsCount=5;
		obj.start();
		obj1.start();

	}

}
