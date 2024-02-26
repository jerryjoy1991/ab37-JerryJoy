package package_02;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_ScrollYoutube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		JavascriptExecutor jse=		driver;
		
	for(int i=0;i<10;i--)
	{
			jse.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			//jse.executeScript("window.scrollBy(0,-3000)");
			

	}

}}
