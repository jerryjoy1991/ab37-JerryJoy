package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_Hoverover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("nav-link-accountList"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).perform();
		Thread.sleep(2000);
		//WebElement w2= driver.findElement(By.id("//span[.='Sign in']"));
		WebElement w2= driver.findElement(By.id("//a[@class='nav-action-signin-button']"));
		w2.click();
	}

}
