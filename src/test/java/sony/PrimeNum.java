package sony;

import org.testng.annotations.Test;

public class PrimeNum {
	
	
	@Test
	public void prime()
	{
		int n=31;
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not a prime");
		}
	
	int a=97;
	int b=1;
	int cou=0;
	while(a>b)
	{
		if(a%b==0)
		{
			cou++;
		}
		b++;
	}
	if(cou==1)
		System.out.println("prime");
	else
		System.out.println("not a prime");

}
}