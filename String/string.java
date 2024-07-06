package String;

public class string {

	public static void main(String[] args) {
		String name="Sahil";
		String sameName="Sahil";
		String newName=new String("Sahil");
		
		System.out.println(name);
		System.out.println(newName);
		
		/*
		if(name==sameName) {
			System.out.println("Both are same");
		}
		if(name==newName) {
			System.out.println("New Both are same");
		}
		else {
			System.out.println("New Both are not same");
		}
*/
		if(name.equals(newName)) {
			System.out.println("Both are same");
		}
	}

}
