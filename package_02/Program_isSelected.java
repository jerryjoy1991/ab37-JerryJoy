package package_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_isSelected {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jerry/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement w1= driver.findElement(By.xpath("(/html/body/input)[6]"));
		//w1.click();
		
		if(w1.isSelected()==true) 
		{
			System.out.println("click signup");
		}
		else
		{
			System.out.println("click checkbox");
			w1.click();
		}
	}

}
