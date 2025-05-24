package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assg183 {
	
	WebDriver driver;
	@Test(priority=1,enabled=true,invocationCount=5)
	public void registration()
	{
		driver = new ChromeDriver();
	}
	
	@Test(priority=3)
	public void logout()
	{
		
	}
	
	@Test(priority=2)
	public void login()
	{
		
	}
}
