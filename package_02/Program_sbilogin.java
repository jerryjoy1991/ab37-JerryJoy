package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//130 - Launch online sbi link,click on login button, and inspect username,password and captcha
public class Program_sbilogin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		w1.click();
		WebElement w2= driver.findElement(By.id("username"));
		w2.sendKeys("jerry123");
		WebElement w3= driver.findElement(By.id("label2"));
		w3.sendKeys("jerry123");
		WebElement w4= driver.findElement(By.id("chkbox"));
		w4.click();
		WebElement w5= driver.findElement(By.id("loginCaptchaValue"));
		w5.click();

	}

}
