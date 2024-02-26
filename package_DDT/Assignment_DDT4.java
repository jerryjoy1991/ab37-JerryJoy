package package_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Check if a user can successfully edit their profile information
public class Assignment_DDT4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1=new 	FileInputStream("C:\\Users\\jerry\\eclipse-workspace\\ProjectMKT_Selenium\\ExcelSheet\\Jerry.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String un1=			wb.getSheet("DDT4").getRow(1).getCell(0).getStringCellValue();
		String pwd=			wb.getSheet("DDT4").getRow(1).getCell(1).getStringCellValue();
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		//System.out.println(un1);
		//System.out.println(pwd);
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Sign in"));
		e1.click();
		WebElement w1=driver.findElement(By.id("ap_email"));
		w1.sendKeys(un1);
		WebElement w2=driver.findElement(By.id("continue"));
		w2.click();
		
		WebElement w3=driver.findElement(By.id("ap_password"));
		w3.sendKeys(pwd);
		
		WebElement w4=driver.findElement(By.id("signInSubmit"));
		w4.click();
		Thread.sleep(4000);
		
		WebElement e2 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		e2.click();
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.xpath("//span[.='Edit login, name, and mobile number']"));
		e3.click();
		Thread.sleep(4000);
		WebElement e4 = driver.findElement(By.xpath("(//a[.='a-button-text'])[1]"));
		e4.click();
		WebElement e5 = driver.findElement(By.id("auth-change-phone-cancel"));
		e5.click();
		/*Actions a1 = new Actions(driver);
		a1.moveToElement(e2).perform();
		WebElement w5=driver.findElement(By.linkText("Your Account[2]"));
		w5.click();*/
		
		
		
		
	}

}
