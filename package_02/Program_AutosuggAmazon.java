package package_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
// 126 - Count the number of links we have in amazon webpage,locate using tagname
public class Program_AutosuggAmazon {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	/*	WebElement w1= driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("mouse");
		Thread.sleep(1000);
		List<WebElement> result = driver.findElements(By.xpath("(//div[@class='two-pane-results-container']/div/div)"));
		int count_auto=result.size();
		System.out.println(count_auto);
		result.get(count_auto-6).click();*/
		//List<WebElement> w2=driver.findElements(By.xpath("//a[@href]"));
		List<WebElement> w2=driver.findElements(By.tagName("a"));
		int count_a=w2.size();
		System.out.println(count_a);
		
	}

}
