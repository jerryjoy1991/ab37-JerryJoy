package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("fname"));
		boolean check_fname=w1.isDisplayed();
		
		if(check_fname==true)
		{
			w1.sendKeys("jerry");
		}
		else
		{
			System.out.println("no action performed");
		}

	}

}
