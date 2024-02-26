package package_01;

//115 - Launch Google.com and click on gmail using linkText.
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_05 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.partialLinkText("Gma")).click();
		
	}

}
