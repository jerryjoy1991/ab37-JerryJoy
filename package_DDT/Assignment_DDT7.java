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

public class Assignment_DDT7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
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
		WebElement w2= driver.findElement(By.linkText("Men's Walking Shoes"));
		w2.click();
		Thread.sleep(4000);
		WebElement w3= driver.findElement(By.name("low-price"));
		w3.sendKeys(price1);
		WebElement w4= driver.findElement(By.name("high-price"));
		w4.sendKeys(price2);
		WebElement w5= driver.findElement(By.id("a-autoid-1"));
		w5.click();
		WebElement w6= driver.findElement(By.xpath("//div[@data-index='5']"));
		w6.click();

	}

}
