package package_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_xpath1 {

	
	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://grotechminds.com/x-path/#1");
			driver.manage().window().maximize();
			WebElement w1= driver.findElement(By.xpath("//span[@class='folder']"));
			w1.click();
			Thread.sleep(2000);
			WebElement w2= driver.findElement(By.xpath("(//span[@class='folder'])[34]"));
			w2.click();
	}

}
