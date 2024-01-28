package sony;

import org.testng.annotations.Test;

public class VowelsInAString {
	
	
	@Test
	public void hj()
	{
		String s="education";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("no of vowels  "+count);
	}

}
