package sony;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class OccurenceOfSubstringUsingRegex {
	
	
	
	@Test
	public void ghk()
	{
		String s="javaseleniumjavatestingjava";
		
		String sub = "java";
		Pattern patt = Pattern.compile(sub);
		Matcher matches = patt.matcher(s);
		
		int count=0;
		while(matches.find())
		{
			count++;
		}
		System.out.println(sub+"  occuring   "+count+"  times");
	}

}
