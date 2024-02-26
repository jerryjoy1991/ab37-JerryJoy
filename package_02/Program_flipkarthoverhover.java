package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//131 - Launch Flipkart hover over fashion and click on men's T-shirt
public class Program_flipkarthoverhover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement w1= driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		WebElement w1= driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));
		Thread.sleep(3000);
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		WebElement w2= driver.findElement(By.linkText("Men's T-Shirts"));	
		w2.click();
		
	/*	WebElement w1= driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[4]"));
		Thread.sleep(3000);
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		WebElement w2= driver.findElement(By.linkText("Soundbars"));	
		w2.click();*/

	}

}
