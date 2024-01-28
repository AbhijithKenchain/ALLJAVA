package sony;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class SegregateUpperandLowerUsingRegexMatchers {
	
	
	@Test
	public void jhgjfh()
	{
		String s="ChatrapathiShivaji@343";
		
		Pattern upper = Pattern.compile("[A-Z]");
		Pattern lower= Pattern.compile("[a-z]");
		
		
		Matcher upcase = upper.matcher(s);
		Matcher lowcase = lower.matcher(s);
		
		System.out.println("uppercases: ");
		while(upcase.find())
		{
			System.out.print(upcase.group()+" ");
		}
		System.out.println();
		System.out.println("lowercases: ");
		while(lowcase.find())
		{
			System.out.print(lowcase.group()+" ");
		}
	}

}
