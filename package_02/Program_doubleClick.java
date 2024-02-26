package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_doubleClick {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.xpath("//a[.='Mobiles']"));
		Thread.sleep(2000);
		Actions a1=new Actions(driver);
		a1.doubleClick(w1).perform();
	}

}
