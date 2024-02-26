package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_webelement {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("English")).click();
		WebElement g1= driver.findElement(By.name("q"));
		g1.sendKeys("India");
		g1.sendKeys(Keys.ENTER);
		}

}
