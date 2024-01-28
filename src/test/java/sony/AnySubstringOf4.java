package sony;

import org.testng.annotations.Test;

public class AnySubstringOf4 {
	
	
	@Test
	public void djd()
	{
		String s="welcometotyss";
		int count=0;
		for(int i=0;i<s.length()-3;i++)
		{count++;
			String s1 = s.substring(i, i+4);
			System.out.println(s1);
		}
		System.out.println(count);
	}

}
