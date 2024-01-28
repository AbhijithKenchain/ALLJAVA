package sony;

import java.util.HashMap;

public class PrintcountOfcharactersUsingHashMap {
	
	
	public static void main(String[] args) {
		
		String s="Automation";
		int count=0;
		
		
		HashMap hm=new HashMap();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				hm.put("k", count++);
			}
		}
		System.out.println(hm.get("k"));
		
		
	}

}
