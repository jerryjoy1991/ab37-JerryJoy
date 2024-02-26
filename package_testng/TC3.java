package package_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TC3 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("Shoes");
		w1.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}

}
