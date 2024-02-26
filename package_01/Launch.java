package package_01;

//110 - WAP to launch Google using get in selenium
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.google.com");
		//FirefoxDriver f1=new FirefoxDriver();
		c1.get("https://www.google.com");
		Thread.sleep(1000);
		//c1.quit();
		//c1.close();

	}

}
