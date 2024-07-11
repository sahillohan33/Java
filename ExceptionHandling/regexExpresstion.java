package ExceptionHandling;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexExpresstion {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("GJUST",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Vist to GJUST");
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Match Found");
		}
		else {
		System.out.println("Match Found");
		}

	}

}
