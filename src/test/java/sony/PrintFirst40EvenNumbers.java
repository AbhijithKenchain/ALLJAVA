package sony;

import org.testng.annotations.Test;

public class PrintFirst40EvenNumbers {
	
	
	@Test
	public void fg()
	{
		int n=1;
		boolean flag=true;
		int count=0;
		
		for(int i=n;flag;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println("even nos--->"+i);
			}
			if(count==40)
			{
				break;
			}
		}
	}

}
