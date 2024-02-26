package package_02;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_ParentChildWindow {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		WebElement google_link= driver.findElement(By.xpath("//span[.='Google']"));
		google_link.click();
		
		//String id1=driver.getWindowHandle();
		Set<String> id2=driver.getWindowHandles();
		//System.out.println(id1);
		System.out.println(id2);
		
		Iterator<String> pcid=id2.iterator();
		String pid1=pcid.next();
		String cid1=pcid.next();
		System.out.println(pid1);
		System.out.println(cid1);
		
		driver.switchTo().window(cid1);
		//driver.close();
		
		
	}

}
