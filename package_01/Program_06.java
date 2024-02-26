package package_01;
//114 - Launch Amazon and click on mobile tab
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_06 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobile Phones")).click();

	}

}
