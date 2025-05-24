package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assg186_retry_failed_TC {
	
	WebDriver driver;
	@Test(retryAnalyzer=retrylogic.class)
	public void testcase1()
	{
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("vijay")).click();
	}

}
