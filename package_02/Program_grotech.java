package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_grotech {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("fname"));
		w1.sendKeys("Jerry");
		WebElement w2= driver.findElement(By.id("lname"));
		w2.sendKeys("Joy");
		WebElement w3= driver.findElement(By.id("Username"));
		w3.sendKeys("jerryjoy");
		WebElement w4= driver.findElement(By.id("password"));
		w4.sendKeys("jerryjoy123");
		WebElement w5= driver.findElement(By.id("FeMale"));
		w5.click();
		WebElement w6= driver.findElement(By.id("w3review"));
		w6.sendKeys("Thrissur, Kerala");
		WebElement w7= driver.findElement(By.id("Address"));
		w7.sendKeys("Thrissur, Kerala");
		WebElement w8= driver.findElement(By.id("Agree"));
		w8.click();
		WebElement w9= driver.findElement(By.id("Skills"));
		Select s1=new Select(w9);
		s1.selectByIndex(1);
		WebElement w10= driver.findElement(By.id("Country"));
		Select s2=new Select(w10);
		s2.selectByValue("India");
		WebElement w11= driver.findElement(By.id("Relegion"));
		Select s3=new Select(w11);
		s3.selectByVisibleText("Muslim");
		
		
		
		
	}

}
