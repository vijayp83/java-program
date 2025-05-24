package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assg184_Parameter {
	
	WebDriver driver;
	@Parameters("browser")
	@Test(invocationCount=5)
	
	public void method1(String nameofbrowser)
	{
		if(nameofbrowser.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
