package package_01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_10 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/jerry/Downloads/learningHTML1.html");
		driver.manage().window().maximize();

	}

}
