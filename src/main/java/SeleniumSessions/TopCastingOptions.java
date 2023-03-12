package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
  
public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1.browser specific driver: This can't be used for cross browser
//		ChromeDriver driver = new ChromeDriver(); // works only for chrome
//		FirefoxDriver driver = new FirefoxDriver(); // works only for Firefox
		
		//2.Top casting b/w ChromeDriver and webDriver interface: - valid top casting and recommended for local execution.
//		WebDriver driver = new ChromeDriver();
		
		
		//3.Top casting b/w ChromeDriver and SearchContext interface: 
		//- valid but not recommended because We can have access to only two methods that were in the SearchContext interface.
//		SearchContext driver = new ChromeDriver();
		
		//4.Top casting b/w ChromeDriver and Remote WebDriver class: - valid top casting - recommended for local execution.
//		RemoteWebDriver driver = new ChromeDriver();
		
		//5.Top casting b/w WebDriver interface and RemoteWebDriver class: - valid top casting and is recommended for remote Execution.
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//6.Top casting b/w SearchContext interface and RemoteWebDriver class: - valid but not recommended.
//		SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);

//		WebDriver driver = new WebDriver(); 
// This can't be done because WebDriver is an interface and we can't create an object of an interface. 
	}

}
