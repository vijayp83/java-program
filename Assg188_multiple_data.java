package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assg188_multiple_data {
	
	@DataProvider(name="Search")
	public Object[] [] searchoption()
	{
		Object[][] data = new Object[5][1];
		
		data [0][0]="mobile";
		data [1][0]="tablet";
		data [2][0]="sunscreen";
		data [3][0]="belts";
		data[4][0]="helmet";
		
		return data;		
	}
	
	@Test(dataProvider="Search",retryAnalyzer=retrylogic.class)
	public void testcase(String input)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input+Keys.ENTER);
	}

}
