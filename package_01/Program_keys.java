package package_01;

//118 - Login to facebook.com - write email and copy paste same in password
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_keys {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("email"));
		w1.sendKeys("jerryjoy");
		w1.sendKeys(Keys.CONTROL+"a");
		w1.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
		
	}

}
