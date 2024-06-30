
public class datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=26;
		float marks=34.45f;
		boolean isPassed=true;
		byte rollno=23;
		double pi=3.14d; // double
		char myLetter='A'; // only one letter insert 
		System.out.println(age);
		System.out.println(marks);
		System.out.println(isPassed);
		System.out.println(pi);
		System.out.println(myLetter);
		
		// data types implicit coversion or direct widening : conversion into low level to high level data types
		
		long countAge=age;
		System.out.println(countAge);
		// Narrowing or Explicit Conversion
		// If we want to assign a value of a larger data type to a smaller data type we perform explicit type casting or narrowing.
		int countAge1=(int)countAge;
		System.out.println(countAge1);
		int newAge=190;
		byte newAgeByte=(byte)newAge;
		
		System.out.println(newAgeByte);  // -66
		
	}

}
