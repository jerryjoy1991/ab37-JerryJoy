package package_assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddtoWishlist {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		WebElement e = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		
		WebElement e1 = driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys("jerryjoy1991@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Savio2018@");
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(5000);
		WebElement elem= driver.findElement(By.id("twotabsearchtextbox"));
		elem.sendKeys("pen");
		elem.sendKeys(Keys.ENTER);
		WebElement w2= driver.findElement(By.xpath("//div[@data-component-id='24']"));
		w2.click();
		Set<String> shoe_selected=driver.getWindowHandles();
		System.out.println(shoe_selected);
		
		Iterator<String> pcid=shoe_selected.iterator();
		String pid=pcid.next();
		String cid=pcid.next();
		System.out.println(pid);
		System.out.println(cid);
		
		driver.switchTo().window(cid);
		WebElement w3= driver.findElement(By.id("add-to-wishlist-button-submit"));
		w3.click();
	}

	}


