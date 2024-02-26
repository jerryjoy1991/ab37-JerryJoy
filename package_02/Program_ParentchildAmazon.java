package package_02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Program_ParentchildAmazon {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("shoes");
		w1.sendKeys(Keys.ENTER);
		
		WebElement shoes= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]"));
		shoes.click();
		
		Set<String> shoe_selected=driver.getWindowHandles();
		System.out.println(shoe_selected);
		
		Iterator<String> pcid=shoe_selected.iterator();
		String pid=pcid.next();
		String cid=pcid.next();
		
		driver.switchTo().window(cid);
		
		
		

	}

}
