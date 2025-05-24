package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ex {


	    @DataProvider(name = "Search")
	    public Object[][] searchoption_flipcart() throws EncryptedDocumentException, IOException {
	        FileInputStream f1 = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Java Introduction\\src\\Excel\\Facebook.xlsx");
	        Workbook w = WorkbookFactory.create(f1);
	        Sheet s = w.getSheet("Facebook_data");

	        String un = s.getRow(0).getCell(0).getStringCellValue();
	        String pwd = s.getRow(1).getCell(1).getStringCellValue();

	        Object[][] data = new Object[2][1];  // 1 row, 2 columns
	        data[0][0] = un;
	        data[0][1] = pwd;

	        return data;
	    }

	    @Test(dataProvider = "Search")
	    public void loginfacebook(String input, String input1) {
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");

	        driver.findElement(By.id("email")).sendKeys(input);
	        driver.findElement(By.id("pass")).sendKeys(input1);
	        driver.findElement(By.name("login")).click(); // Better locator than "//button"
	    }
	}



