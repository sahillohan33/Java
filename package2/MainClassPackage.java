package package2;

// import packageAndEncapsulation.Teacher;
import packageAndEncapsulation.Person;
// public class MainClassPackage extends Teacher 
public class MainClassPackage
{

	public static void main(String[] args) {
		// Teacher obj=new Teacher();
	//	obj.teachingClass=123;
		
		Person obj=new Person();
		obj.setAge(12);
		obj.getAge();
		
	}

}
