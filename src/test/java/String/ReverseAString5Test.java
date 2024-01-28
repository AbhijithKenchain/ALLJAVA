package String;

import org.testng.annotations.Test;

public class ReverseAString5Test {
	@Test
	public void reverse() {
		
		String s="india is the loved nation";
		String[] s2 = s.split(" ");
		for(int i=0;i<s2.length/2;i++)
		{
			String a=s2[i];
			s2[i]=s2[s2.length-(i+1)];
			s2[s2.length-(i+1)]=a;
		}
		for(String a:s2)
		{
			System.out.print(a+" ");
		}
	}
	
	@Test
	public void word()
	{
		String s="india is loved nation";
		String[] s2 = s.split(" ");
		int count=0;
		for(String s1:s2)
		{
			count++;
		}
		System.out.println(count);
		
	}
	
	@Test
	public void assig()
	{
		String s="aabbaa";
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+1)+" ");
		}
		
	}
	
	@Test
	public void sel()
	{
		String s="selenium";
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
	}
		@Test
		public void kol()
		{
			String[] s={"abhijith","ashish","rakesh"};
			
			for(int i=0;i<s.length;i++)
			{
				String s1=s[i].toLowerCase();
				int count=0;
				for(int j=0;j<s1.length();j++)
				{
					if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u')
					{
						count++;
					}
					
				}
				System.out.println(s1+"-"+count);
			}
			
			
			
		}
	@Test
	public void ff()
	{
		String s="update.decline.accept.include";
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='.')
			{
			System.out.print(" ");	
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			if(s.charAt(i)=='c')
			{
				count++;
			}
		}
		System.out.println();
		System.out.println("c  :"+count);
	}
	
	
	
	
	
	
	
	
	
	
	
}
