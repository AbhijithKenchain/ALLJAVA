
package sony;

import org.testng.annotations.Test;

public class PalindromeInaString {
	
	@Test
	public void hjh()
	{//findBiggestsubstring and find if its palindrome or not
		String s="ayalamalayalamkayak";
int count=0;
		
		for(int i=0;i<s.length()-8;i++)
		{
			if(s.substring(i, i+9).equals("malayalam"))
			{
			count++;
			
			String str = s.substring(i,i+9);
			String str1 = "";
			for(int j=str.length()-1;j>=0;j--)
			{
				str1=str1+str.charAt(j);
				
				
			
			}
			if(str1.equalsIgnoreCase(str))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		}
		}
		System.out.println(count);
	
	}

}
