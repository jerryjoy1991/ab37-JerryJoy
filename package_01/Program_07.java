package package_01;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_07 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String country[]= {"United Arab Emirates","United Kingdom","United States"};
		for(int i=0;i<3;i++)
		{
			if(country[i]=="United Arab Emirates") {
			driver.findElement(By.partialLinkText("Arab Emirates")).click();
			}
			else if(country[1]==1)
				driver.findElement(By.partialLinkText("Kingdom")).click();
			else
				driver.findElement(By.partialLinkText("States")).click();
		}
	

}
