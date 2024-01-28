package String;

import org.testng.annotations.Test;

public class MyNameisPrakash {
	
	@Test
	public void myNameisPrakash()
	{
		String s="My$ na@me is& $prak%ash";
		String[] s2 = s.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String r=s2[i].replaceAll("[^a-zA-Z]", "");
			int count=r.length()-1;
			
			for(int j=0;j<s2[i].length();j++)
			{
				if(s2[i].charAt(j)>='A' && s2[i].charAt(j)<='Z'|| s2[i].charAt(j)>='a' && s2[i].charAt(j)<='z')
				{
					System.out.print(r.charAt(count--));
				}
				else
				{
					System.out.print(s2[i].charAt(j));
				}
			}
			System.out.print(" ");
		}
		
	}

}
