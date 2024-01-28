package sony;

import org.testng.annotations.Test;

public class AbbrevationOfString {
	
	
	@Test
	public void hj()
	{
		String s="Mahendra Singh Dhoni";
		String[] s1 = s.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++)
		{
			s2=s2+s1[i].substring(0,1);
			
		}
		System.out.println(s2);
	}

}
