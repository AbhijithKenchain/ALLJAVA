package sony;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeOptionshandling {
	
	@Test
	public void gfhjhg()
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		co.addArguments("--disable-notification");
		co.addArguments("--disable-geolocation");
		
	}

}
