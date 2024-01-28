package sony;

import org.testng.annotations.Test;

public class Merge2Array {
	
	
	@Test
	public void ghg()
	{
		int [] a= {4,5,6,7,9};
		int b[]= {1,2,3,4};
		
		int k=0;
		int []c=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		for(int g:c)
		{
			System.out.print(g+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-a.length];
			}
		}
		for(int f:c)
		{
			System.out.print(f+" ");
		}
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int r:c)
		{
			System.out.print(r+" ");
		}
		
		
		
		
		
		
		
	}

}
