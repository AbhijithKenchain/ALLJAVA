package sony;

import org.testng.annotations.Test;

public class NoOfEvenNumbers {
	
	
	@Test
	public void hj()
	{
		int start=1;
		int end=40;
		int count=0;
		
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("even numbers  "+count);
	}

}
