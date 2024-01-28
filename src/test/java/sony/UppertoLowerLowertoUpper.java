package sony;

import org.testng.annotations.Test;

public class UppertoLowerLowertoUpper {
	
	@Test
	public void fjkfk()
	{
		String s="AbCdEfGhjIkL";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
{
			char c=ch[i];
			if(Character.isUpperCase(c))
			{
				ch[i]=Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c))
			{
				ch[i]=Character.toUpperCase(c);
			}
			System.out.print(ch[i]);
			
}
	}

}
