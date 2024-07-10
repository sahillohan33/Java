package learnInnerClass;

class OuterClass{
	public void outermethod() {
		System.out.println("Outer Method");
	}
}
public class LearnAnonymousClasses {
	// anonymous class
	OuterClass obj=new OuterClass() {
		void sing() {
			System.out.println("Sing Method");
		}
		@Override
		public void outermethod()
		{
			System.out.println("Outer Method");
		}
	};
	
	
	
}
