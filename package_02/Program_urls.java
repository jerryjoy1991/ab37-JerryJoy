package package_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program_urls {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("English")).click();
		List<WebElement> w2=driver.findElements(By.tagName("a"));
		for(int i=0;i<=w2.size()-1;i++)
		{
			WebElement w=w2.get(i);
			String s1=w.getAttribute("href");
			String s2=w.getText();
			System.out.println(s1);
			//System.out.println(s2);
		}
		
	}

}
