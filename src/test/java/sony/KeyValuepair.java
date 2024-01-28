package sony;

import java.util.HashMap;
import java.util.Map.Entry;

public class KeyValuepair {
	
	
	public static void main(String[] args) {
		
		HashMap<String , Integer>hm=new HashMap<String, Integer>();
		
		hm.put("mobile", 7879870);
		hm.put("teamSize", 10);
		hm.put("totalsize", 50);
		hm.put("staff", 13);
		
		
		for(Entry<String, Integer> list:hm.entrySet())
		{
			System.out.println("Key is "+list.getKey()+"----->  "+" value "+list.getValue());
		}
	}

}
