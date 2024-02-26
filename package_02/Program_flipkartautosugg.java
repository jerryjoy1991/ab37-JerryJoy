package package_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//127 - Launch www.flipkart.com page,
//search for books and click on second autosuggestion use xpath to locate autosuggestions.
public class Program_flipkartautosugg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.name("q"));
		w1.sendKeys("books");
		Thread.sleep(3000);
		
		List<WebElement> result = driver.findElements(By.xpath("(//form/ul/li)"));
		int count_auto=result.size();
		System.out.println(count_auto);
		
		result.get(count_auto-7).click();
	}

}
