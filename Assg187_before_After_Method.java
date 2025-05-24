package testngpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assg187_before_After_Method {
	WebDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}

	@Test
	public void method1()
	{
		driver.findElement(By.id("APjFqb")).sendKeys("Mobiles"+Keys.ENTER);
		

	}
	
	@AfterMethod
	public void quit() throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\User\\eclipse-workspace\\Java Introduction\\src\\testngpackage\\Screenshot\\S1"+Math.random()+".png");
		
		FileHandler.copy(source, des);
		
		driver.quit();
		
	}

}
