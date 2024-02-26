package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_windowpopup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("Resume"));
		w1.sendKeys("C:\\Users\\jerry\\OneDrive\\Desktop\\MAnish Kumar Tiwari.pdf");

	}

}
