package package_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("English")).click();
		WebElement w1= driver.findElement(By.name("q"));
		w1.sendKeys("India");
		Thread.sleep(1000);
		
		List<WebElement> result = driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
		int count_auto=result.size();
		System.out.println(count_auto);
		
		result.get(count_auto-10).click();
		
		List<WebElement> w2=driver.findElements(By.xpath("//a[@href]"));
		int count_a=w2.size();
		System.out.println(count_a);
		
	}

}
