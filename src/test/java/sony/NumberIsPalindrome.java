package sony;

import org.testng.annotations.Test;

public class NumberIsPalindrome {
	
	
	@Test
	public void jhghjghj()
	{
		int h=78987;
		int sum=0;
		int temp=0;
		temp=h;
		while(h>0)
		{
			int a=h%10;
			sum=(sum*10)+a;
			h=h/10;
		}
		if(sum==temp)
		{
			System.out.println("palindrome"+temp);
		}
		else
		{
			System.out.println("not palindrome"+temp);
		}
	}

}
