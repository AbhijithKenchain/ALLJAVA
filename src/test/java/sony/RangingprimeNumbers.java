package sony;

import org.testng.annotations.Test;

public class RangingprimeNumbers {
	
	@Test
	public void prime()
	{
		int n=100;
		
		
		for(int i=1;i<n;i++)
		{
			boolean flag=false;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
				if(!flag && i!=1)
				{
					
					System.out.println(i);
				}
			
		}
		
		
	}

}
