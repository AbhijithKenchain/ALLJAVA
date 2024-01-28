package sony;

import java.util.HashMap;
import java.util.Iterator;

import org.testng.annotations.Test;

public class HashmapOccurence {
	
	@Test
	public void fjghhj()
	{
		String s="welcome";
		
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else
			{
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println(hm);
		
	Iterator i=hm.entrySet().iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

}}
