package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//132 - Launch growtechminds drag and drop page,do drag a image and drop it in target place
//      do the reverse of it.
public class Program_Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag=	driver.findElement(By.id("drag7"));
		
		WebElement drop=	driver.findElement(By.id("div2"));
				
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		WebElement drop1=	driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		//WebElement drop1=	driver.findElement(By.id("(div1)[7]"));
		Thread.sleep(2000);
		//Actions a2=new Actions(driver);
		a1.dragAndDrop(drag,drop1).perform();
		

	}

}
