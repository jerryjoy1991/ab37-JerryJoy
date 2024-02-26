package package_DDT;
 // Ensure login fails with incorrect email or password
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_DDT3 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream f1=new 	FileInputStream("C:\\Users\\jerry\\eclipse-workspace\\ProjectMKT_Selenium\\ExcelSheet\\Jerry.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String un1=			wb.getSheet("DDT3").getRow(1).getCell(0).getStringCellValue();
		String pwd=			wb.getSheet("DDT3").getRow(1).getCell(1).getStringCellValue();
		//String pwd = NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		System.out.println(un1);
		System.out.println(pwd);
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys(un1);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys(pwd);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		//Thread.sleep(5000);

	}

}
