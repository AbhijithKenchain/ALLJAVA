package sony;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithoutSendKeys {
	
	
	@Test
	public void fhhgfh()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='abhijithkenchain@gmail.com';", email);
		js.executeScript("arguments[0].value='Abhijiggfsh7!';", password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
