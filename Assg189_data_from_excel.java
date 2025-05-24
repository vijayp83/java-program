package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assg189_data_from_excel {
	
	@DataProvider(name="Search")
	public Object searchoption_flipcart() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Java Introduction\\src\\Excel\\Facebook_data.xlsx");
		Workbook w =	WorkbookFactory.create(f1);
		
		Sheet s = w.getSheet("Facebook_data");
		Row r = s.getRow(1);
		Cell c = r.getCell(0) ;
		
		String un = c.getStringCellValue();
		String pwd = w.getSheet("Facebook_data").getRow(1).getCell(1).getStringCellValue();
		
		Object data[][] = new Object[1][2];
		data[0][0]= un;
		data[0][1]=pwd;
		
		return data;
		
	}
	
	@Test(dataProvider="Search")
	public void loginfacebook(String input,String input1)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(input);
		driver.findElement(By.id("pass")).sendKeys(input1);
		driver.findElement(By.xpath("//button")).click();
		
		
	}

}
