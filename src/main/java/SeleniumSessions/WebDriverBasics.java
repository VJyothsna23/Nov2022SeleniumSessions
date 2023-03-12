package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1. Open browser: Chrome, FF, Safari, Edge etc
		
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();- Using top casting with Parent interface(WebDriver)
		
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please enter the right browser: " + browser);
		}
		
		
		
		//2.Enter url: Without http or https we can't open any url, it throws exception, but www is not mandatory.
		
		driver.get("https://www.google.com");// This is the right way. 
		//driver.get("www.google.com"); - Without http or https we can't open any url, it throws exception.
		//driver.get("https://google.com"); - This works fine because, www is not mandatory according to Selenium protocol.
		
		//3. Get the title:
		
		String actTitle = driver.getTitle();
		System.out.println("Actual page title is: " + actTitle);
		
		//4.Validation point/Checkpoint:
		
		if(actTitle.equals("Google")) {
			System.out.println("  PASS");
		}
		else {
			System.out.println("FAIL");
		}
        // Automation steps + validation/assertions = Automation Testing
		
		//5.Close the browser:
		
		driver.quit();
	}

}
