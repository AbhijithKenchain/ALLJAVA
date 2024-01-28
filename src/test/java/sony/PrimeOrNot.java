package sony;

import org.testng.annotations.Test;

public class PrimeOrNot {

	@Test
	public static void j()
	{
		int a=31;
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime  "+a);
		}
		else
		{
			System.out.println("not a prime  "+a);
		}
	}

}
