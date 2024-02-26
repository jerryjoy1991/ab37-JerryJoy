package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement country_canada=	driver.findElement(By.linkText("Canada"));
		Point location=country_canada.getLocation();
		int x=	location.getX();
		int y=	location.getY();
		System.out.println(x);
		System.out.println(y);
		Thread.sleep(3000);
		JavascriptExecutor jse=		driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
	
			jse.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(3000);
			jse.executeScript("window.scrollBy(0,-5000)");

	}

}
