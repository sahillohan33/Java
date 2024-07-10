package learnInnerClass;

public class InnerClass {
	class Toy{
		int price;
	}
	static class PlayStation{
		int price;
	}
	public static void main(String[] args) {
	//	Toy obj=new InnerClass().new Toy();
		InnerClass Inner=new InnerClass();
		Toy obj=Inner.new Toy();
		obj.price=45;
		
		PlayStation play=new InnerClass.PlayStation();

	}

}
