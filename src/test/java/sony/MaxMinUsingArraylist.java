package sony;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class MaxMinUsingArraylist {
	
	
	@Test
	public void ghgj()
	{
		ArrayList ar=new ArrayList();
		ar.add(30);
		ar.add(50);
		ar.add(35);
		ar.add(60);
		
		ar.add(82);
		ar.add(97);
		
		Collections.sort(ar);
		System.out.println(ar);
		
		Collections.sort(ar,Collections.reverseOrder());
		System.out.println(ar);
		
		System.out.println(Collections.max(ar));
		System.out.println(Collections.min(ar));
		
	}

}
