package package_02;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_goibibo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.goibibo.com/flights/air-BLR-DEL-20240206--1-0-0-E-D/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=EAIaIQobChMIiMnBidKUhAMVIhCDAx1vBQUPEAAYASAAEgKMa_D_BwE");
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		/*String id1=driver.getWindowHandle();
		System.out.println(id1);
		Set<String> id2 = driver.getWindowHandles();
		System.out.println(id2);
		//driver.switchTo().alert().dismiss();*/
		WebElement w1=driver.findElement(By.className("loginCont__input"));
		w1.sendKeys("7736722930");
		Thread.sleep(2000);
		/*List<WebElement> source=driver.findElements(By.xpath("//ul[@class='search-widget-autosuggeststyles__SearchMenuStyles-sc-d4g22y-9 loRkxU']/div/div"));
		int n1=source.size();
		System.out.println(n1);
		//source.get();*/
	}

}
