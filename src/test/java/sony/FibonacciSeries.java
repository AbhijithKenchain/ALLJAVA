package sony;

import org.testng.annotations.Test;

public class FibonacciSeries {
	
	@Test
	public void jhk()
	{
		int num=10;
		int num1=0;
		int num2=1;
		int count=0;
		
		
		while(count<num)
		{
			System.out.print(num1);
			System.out.print(" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			count++;
		}
	}

}
