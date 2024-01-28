package sony;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class _2listsarepalindromeOrNpot {
	
	
	@Test
	public void ghjkl()
	{
		ArrayList<String>al=new ArrayList<String>();
		al.add("dog");
		al.add("cat");
		al.add("puchhe");
		
		
		ArrayList<String>al1=new ArrayList<String>();
		
		for(int i=al.size()-1;i>=0;i--)
		{
			String e = al.get(i);
			al1.add(e);
		}
		
		if(al.equals(al1))
		{
			System.out.println("lists are palindrome");
		}
		else
		{
			System.out.println("not a palindrome lists");
		}
	}

}
