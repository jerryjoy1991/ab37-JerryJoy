package package_assignments;

import org.openqa.selenium.chrome.ChromeDriver;

//120 - Launch GrowTechminds registration form,
//for firstname textfield enter name as Manish Kumar Tiwari,
//remove Tiwari from it using Keys option
public class Assignment_120 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
	}

}
