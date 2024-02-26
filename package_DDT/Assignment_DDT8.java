package package_DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_DDT8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f1=new 	FileInputStream("C:\\Users\\jerry\\eclipse-workspace\\ProjectMKT_Selenium\\ExcelSheet\\Jerry.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		String item=			wb.getSheet("DDT5").getRow(0).getCell(0).getStringCellValue();
		String price1 = NumberToTextConverter.toText(wb.getSheet("DDT5").getRow(0).getCell(1).getNumericCellValue());
		String price2 = NumberToTextConverter.toText(wb.getSheet("DDT5").getRow(0).getCell(2).getNumericCellValue());
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys(item);
		w1.sendKeys(Keys.ENTER);
		/*WebElement w2= driver.findElement(By.linkText("Men's Walking Shoes"));
		w2.click();*/
		Thread.sleep(2000);
		//WebElement w2= driver.findElement(By.id("a-autoid-0-announce"));
		WebElement w2= driver.findElement(By.xpath("//span[@class='a-dropdown-label']"));
		w2.click();
		//Select s1=new Select(w2);
		//s1.selectByIndex(1);
		WebElement w3= driver.findElement(By.id("s-result-sort-select_1"));
		w3.click();
		Thread.sleep(2000);
		WebElement w4= driver.findElement(By.xpath("//span[@class='a-dropdown-label']"));
		w4.click();
		Thread.sleep(3000);
		//w4.sendKeys(Keys.ARROW_DOWN);
		//w4.sendKeys(Keys.ARROW_DOWN);
		//w4.sendKeys(Keys.ENTER);
		WebElement w5= driver.findElement(By.linkText("Avg. Customer Review"));
		w5.click();
		Thread.sleep(2000);
		WebElement w6= driver.findElement(By.xpath("//span[@class='a-dropdown-label']"));
		w6.click();
		Thread.sleep(2000);
		WebElement w7= driver.findElement(By.linkText("Price: High to Low"));
		w7.click();
		//Thread.sleep(2000);
	//	WebElement w4= driver.findElement(By.id("s-result-sort-select_2"));
		//w4.click();
		/*w2.sendKeys(Keys.ARROW_DOWN);
		w2.sendKeys(Keys.ARROW_DOWN);
		w2.sendKeys(Keys.ENTER);*/
		
	}

}
