package sony;

import org.testng.annotations.Test;

public class AllsubstringPossibleInaString {
	
	@Test
	
public void jhj()
{
		String s="welcome";
		
		for(int i=0;i<=s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print(s.charAt(j));
		}
			System.out.println("");
		}
}
	//using substring
	@Test
	public void hg()
	{
		String s="selenium";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.substring(0,i+1));
		}
	}
	@Test
	public void jkhj()
	{int count=0;
		String s="welcome";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				count++;
				
				System.out.println(s.substring(i, j+1));
			}
			//System.out.println();
		}
		System.out.println(count);
	}
	
	
	
	
}
