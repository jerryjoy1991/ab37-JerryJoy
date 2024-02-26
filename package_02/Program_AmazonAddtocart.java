package package_02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//128 - Launch amazon india search for shoes,select 30th shoe and add it to the cart
//      inspect shoes using xpath
public class Program_AmazonAddtocart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("shoes");
		w1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//WebElement w2= driver.findElement(By.xpath("//div[@data-index='30']"));
		WebElement w2= driver.findElement(By.xpath("//div[@data-component-id='43']"));
		w2.click();
		Thread.sleep(1000);
		Set<String> shoe_selected=driver.getWindowHandles();
		System.out.println(shoe_selected);
		
		Iterator<String> pcid=shoe_selected.iterator();
		String pid=pcid.next();
		String cid=pcid.next();
		System.out.println(pid);
		System.out.println(cid);
		
		driver.switchTo().window(cid);
		WebElement w3= driver.findElement(By.id("add-to-cart-button"));
		w3.click();
		
	}

}
