package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowserTest {
	@Test
	public void googleTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void facebookTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}
	
	//@Test
	public void chooseTest() {
		String app = System.getProperty("website");
		if (app.equalsIgnoreCase("facebook")) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			System.out.println(driver.getTitle());
		} else if (app.equalsIgnoreCase("google")) {
			WebDriver driver=new ChromeDriver();
			driver.get("https:www.google.com");
			System.out.println(driver.getTitle());
		}
	}
}
