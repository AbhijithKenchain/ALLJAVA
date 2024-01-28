package sony;

import org.testng.annotations.Test;

public class ContainsVowelOrNot {
	
	@Test
	public void jghjfhj()
	{
		String s="aeiou";
		String f="education is my right ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<f.length();j++)
			{
				if(s.charAt(i)==f.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
