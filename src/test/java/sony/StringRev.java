package sony;

import org.testng.annotations.Test;

public class StringRev {

	
	@Test
	public void fgh()
	{
		String s="testyantra";
		//1
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		//2
		System.out.println();
		char[] ch = s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		//3
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
	
		
		System.out.println();
		
		//4
	int count=0;
	for( char c:ch)
	{
		count++;
	}
	for(int i=count-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	
	System.out.println();
	//5
	StringBuilder sb=new StringBuilder(s);
	sb.reverse();
	System.out.println(sb);
	
	System.out.println();
	System.out.println();
//6
	String rev="";
	for(int i=0;i<s.length();i++)
	{
		rev=rev+s.charAt(s.length()-1-i);
	}
	System.out.print(s1);
	}
}
