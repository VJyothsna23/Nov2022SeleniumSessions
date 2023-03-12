package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTestingPractice {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser name: " + driver);
			break;
		}
		
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("The title of the given page is: "+ title);
		
//		if (title.equals("Facebook - log in or sign up")) {
		if (title.contains("Facebook")) {
			System.out.println(" PASS ");
		}
		else {
			System.out.println("Fail");
		}
		
		driver.quit();
	
	}

}
