package sony;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.Capabilities;
public class BrowserVersion {
	
	
	@Test
	public void brow()
	{
		RemoteWebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Capabilities c=driver.getCapabilities();
		// Capabilities c = ((RemoteWebDriver)driver).getCapabilities();
		String browsername = c.getBrowserName();
		String browserversion = c.getBrowserVersion();
		
		System.out.println(browsername);
		System.out.println(browserversion);
		driver.navigate().to("https://www.facebook.com");
		
	}

	

}
