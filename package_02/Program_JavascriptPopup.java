package package_02;

import org.openqa.selenium.chrome.ChromeDriver;
//129 - Handle javascript popup of growtechminds application and get the title of the page
public class Program_JavascriptPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jerry/Downloads/learningHTML1.html");
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
