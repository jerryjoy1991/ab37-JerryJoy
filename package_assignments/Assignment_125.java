package package_assignments;
//125 - Perform any action on the disabled component and find out which exception we are getting
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_125 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jerry/Downloads/learningHTML1.html");
		driver.manage().window().maximize(); 
		WebElement w1=driver.findElement(By.id("121"));
		w1.sendKeys("jerry");
	}

}
