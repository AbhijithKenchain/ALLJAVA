package sony;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RemoveallWhiteSpaces {
	
	
	
	public static void main(String[] args) {
		
		String s="java is a programming language";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
	}
	
	@Test
	public void remove()
	{
		String s="java    is  a  programming  language";
		 String reg="\\s+";
		//String s1 = s.replaceAll(reg, " ");
			//System.out.println(s1);
		 Pattern str1 = Pattern.compile(reg);
		 Matcher str2 = str1.matcher(s);
		 String str3 = str2.replaceAll(" ");
		 System.out.println(str3);
		 
		
		
	}

}
