package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_isEnabled {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jerry/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("121"));
		boolean check_lname=w1.isEnabled();
		
		if(check_lname==true && w1.isDisplayed()==true)
		{
			System.out.println("Enabled");
			w1.sendKeys("joy");
		}
		else
		{
			System.out.println("not enabled");
			w1.sendKeys("joy");
		}
	}

}
