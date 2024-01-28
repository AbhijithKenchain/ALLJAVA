package sony;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class EvenOddUsingIterator {
	
	@Test
	public void fgh()
	{
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(32);
		al.add(33);
		al.add(77);
		al.add(88);
		al.add(55);
		System.out.println(al);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			Integer i=(Integer) obj;
			
			if(i%2==0)
			{
				System.out.println("even-------->"+i);
			}
			else
			{
				System.out.println("odd-------->"+i);
			}
		}
	
	}

}
