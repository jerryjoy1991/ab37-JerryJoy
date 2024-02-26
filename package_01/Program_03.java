package package_01;

// 112 - Login to Facebook using id,name locator
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("jerryjoy1991@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jerryjoy1991@gmail.com");
		driver.findElement(By.name("login")).click();
		}
	

}
