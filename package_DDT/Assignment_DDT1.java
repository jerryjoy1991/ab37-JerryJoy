package package_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//  Test if a new user can successfully register.
public class Assignment_DDT1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new 	FileInputStream("C:\\Users\\jerry\\eclipse-workspace\\ProjectMKT_Selenium\\ExcelSheet\\Jerry.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String un1=			wb.getSheet("DDT1").getRow(0).getCell(0).getStringCellValue();
		String phno = NumberToTextConverter.toText(wb.getSheet("DDT1").getRow(0).getCell(1).getNumericCellValue());
		String pwd=			wb.getSheet("DDT1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(un1);
		System.out.println(phno);
		System.out.println(pwd);
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Start here."));
		e1.click();
		WebElement e2 = driver.findElement(By.id("ap_customer_name"));
		e2.sendKeys(un1);
		WebElement e3 = driver.findElement(By.id("ap_phone_number"));
		e3.sendKeys(phno);
		WebElement e4 = driver.findElement(By.id("ap_password"));
		e4.sendKeys(pwd);
		
	}

}
