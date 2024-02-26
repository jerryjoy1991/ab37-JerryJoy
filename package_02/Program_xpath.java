package package_02;

//124 - Launch Growtechminds xpath form do the folllowing  
//1. Write an Xpath for books
//2. Write an Xpath for Mobiles
//3. Write an Xpath for Clothes
//4. Write an Xpath for Chocolates

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program_xpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.xpath("//span[@class='folder']"));
		w1.click();
		Thread.sleep(2000);
		WebElement w2= driver.findElement(By.xpath("//span[@class='folder']"));
		w2.click();
		Thread.sleep(2000);
		WebElement w3= driver.findElement(By.xpath("(//span[@class='folder'])[15]"));
		w3.click();
		Thread.sleep(2000);
		WebElement w4= driver.findElement(By.xpath("(//span[@class='folder'])[24]"));
		w4.click();
		Thread.sleep(2000);
		WebElement w5= driver.findElement(By.xpath("(//span[@class='folder'])[31]"));
		w5.click();
		//Thread.sleep(2000);
	}

}
