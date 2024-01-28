package sony;

import org.testng.annotations.Test;

public class PairOfNumbersis11 {
	
	
	
	@Test
	public void fg()
	{
		int []a= {1,2,3,4,5,6,7,8,9};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]>=11)
				{
					count++;
					System.out.println("numbers are "+a[i]+" "+a[j]);
				}
			}
		}
		System.out.println("number of combination we can get 11 is "+count);
	}

}
