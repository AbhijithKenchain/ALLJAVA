package sony;

import org.testng.annotations.Test;

public class UseRegextoReplace {
	
	@Test
	public void fhfj()
	{
		String s="java[12]test";
		String reg="\\[12]";
		System.out.println(s.replaceAll(reg, ""));
	}

}
