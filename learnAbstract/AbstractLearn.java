package learnAbstract;

abstract class Vehicle{
	abstract void accelerate();
	abstract int brakes(int wheels);
	
}
class Car extends Vehicle{
	@Override
	void accelerate() {
		System.out.println("Car is Accelerating");
	}
	@Override
	int brakes(int wheels) {
		
		return wheels;
	}
}
public class AbstractLearn {

	public static void main(String[] args) {

		// Vehicle obj=new Vehicle();
		
		Car obj=new Car();
		obj.accelerate();
		System.out.println("car is wheels "+obj.brakes(4));
	}

}
