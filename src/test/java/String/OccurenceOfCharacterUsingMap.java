package String;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccurenceOfCharacterUsingMap {
	@Test
	public void occurence() {
		String s="Tester";
		s=s.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
