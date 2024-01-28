package sony;

import org.testng.annotations.Test;

public class Comapring2stringsUsingHashCode {
	
	
	@Test
	public void hgjjh()
	{
		String s="welcome";
		String t="welcoem";
		
		if(s.hashCode()==t.hashCode())
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
