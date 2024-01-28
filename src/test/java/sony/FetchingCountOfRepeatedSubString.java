package sony;

import org.testng.annotations.Test;

public class FetchingCountOfRepeatedSubString {
	
	
	@Test
	public void ffh()
	{
		String s="javaseleniumeclipsejavatestingjava";
		
		int count=0;
		
		for(int i=0;i<s.length()-3;i++)
		{
			if(s.substring(i, i+4).matches("java"))
			{
			count++;
			
			}
		}
		System.out.println(count);
	}

}
