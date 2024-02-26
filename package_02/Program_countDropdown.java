package package_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_countDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.id("Relegion"));
		Select s1=new Select(w1);
		s1.selectByIndex(1);
		
		List<WebElement> s2=s1.getOptions();
		int count=s2.size();
		System.out.println(count);
		
		for(int i=0;i<=count-1;i++)
		{
			WebElement w2=s2.get(i);
			String s3=w2.getText();
			System.out.println(s3);
		}
	}

}
