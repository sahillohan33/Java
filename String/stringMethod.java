package String;

public class stringMethod {

	public static void main(String[] args) {
		String name="  saHiL123  ";
		
		// lower case
		System.out.println(name.toLowerCase());
		
		// trim methods
		System.out.println(name.trim());
		
		// startsWith method
		
		System.out.println("Cardboard".startsWith("Card"));
		
		// endsWith method
		
		System.out.println("Cardboard".endsWith("rd"));
		
		// charAt method
		
		System.out.println("Cardboard".charAt(4));
		
		// valueOf method
		
		int age=123;
		String newAge=String.valueOf(age);
		
		System.out.println(age+2); // 125
		
		System.out.println(newAge+2);  // 1232
		
		// replace method
		
		String sentence="I love Java, Java is a good language";
		String newSentence=sentence.replace("Java", "Cpp");
		System.out.println(newSentence);
		
	}

}
