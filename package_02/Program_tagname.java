package package_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_tagname {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jerry/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		//driver.findElement(By.tagName("a")).click();

		List<WebElement> w2=driver.findElements(By.xpath("//a[@href]"));
		int count_a=w2.size();
		System.out.println(count_a);
	}

}
