package package_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//133 - Launch amazon.in and print all the option names present in " All" dropdowns 
public class Assignment_133 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		WebElement w1= driver.findElement(By.id("searchDropdownBox"));
		w1.click();
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
