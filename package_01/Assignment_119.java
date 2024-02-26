package package_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
// 119 - launch amazon.in select category dropdown,select Books using arrow down key 
//then search for software in search text field and press enter using keys function.
public class Assignment_119 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		WebElement w1= driver.findElement(By.id("searchDropdownBox"));
		//Select s1=new Select(w1);
		//s1.selectByVisibleText("Books");
		w1.click();
		for(int i=0;i<11;i++) {
		w1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		}
		Thread.sleep(1000);
		//w1.sendKeys(Keys.ENTER);
		WebElement w2= driver.findElement(By.id("twotabsearchtextbox"));
		w2.sendKeys("software");
		w2.sendKeys(Keys.ENTER);
	}

}
