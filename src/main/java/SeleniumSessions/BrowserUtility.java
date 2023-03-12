package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {
	
	private WebDriver driver;
//The default value of the variable 'driver' will be "null" because it is of WebDriver type(which is an interface), a non premetive data type.
	
	//Below are some generic/wrapper methods on top of existing Selenium methods:
	//Whenever we create a utility method, it is a good practice to give the documentation about the method right above it.
	
	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * @param browser
	 * @return This returns the specific browser driver.
	 */
	public WebDriver initDriver(String browser) {
		
		System.out.println("Browser name is:" + browser);
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Please enter a valid browser name: " + browser);
			break;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	//Example url : https://www.amazon.com
	public void launchUrl(String url) {
		
		if(url == null) {
			System.out.println("Url can't be null. Please enter the correct url");
		}
		
		if(url.indexOf("https")== 0){//That means, we are checking if the url is starting with https
			driver.get(url);
		}
		
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		return title;
	}
	
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("Page current url is: " + url);
		return url;
	}
	
	public void closeBrowser() {
		if(driver!= null) {
			driver.close();
		}
	}
	
	public void quitBrowser() {
		if(driver!= null) {
			driver.quit();
		}
	}
	
	

}
