package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtility;

public class LocatorID {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		// Create a web element + perform action( click, send keys, get text, is displayed, etc.)
		
		//To Create a web element: We need a locator
		//DOM(Document object model) - contains html code of any page with html tags and attributes/properties.
		//These attributes are always available in the form of key- value pairs(property names and values).
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1. Locator: id - 1st approach:
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");// .id is a static method, and that's why we can directly access it using class name 'By.id'
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		
		//2nd approach:
//		WebElement emailId = driver.findElement(By.id("input-email"));// .findElement method always returns WebElement(which is an interface that's already available in selenium).
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");
		
		//3rd approach - By locator approach:
//		By emailId = By.id("input-email");// By.id method always returns By(which is a class).
//		By password = By.id("input-password");
//		
//		WebElement eId = driver.findElement(emailId);// findElement method always returns WebElement(which is an interface).
//		WebElement pwd = driver.findElement(password);
//				
//		eId.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");

		//4th approach - By locator + generic method for getting the web element:
//		By emailId = By.id("input-email");// By.id method always returns By(which is a class).
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("naveen@123");
//		
		
		//5th approach - By locator + generic methods for getting the web element and to perform actions:
//		By emailId = By.id("input-email");// By.id method always returns By(which is a class).
//		By password = By.id("input-password");
//		
//		doSendkeys(emailId, "naveen@gmail.com");
//		doSendkeys(password, "naveen@123");
		
		//6th approach: By locator + generic methods for getting the web element and to perform actions in a Element Utility class.

		By emailId = By.id("input-email");// By.id method always returns By(which is a class).
		By password = By.id("input-password");
		
		ElementUtility eleUtil = new ElementUtility(driver);
		
		eleUtil.doSendkeys(emailId, "naveen@gmail.com");
		eleUtil.doSendkeys(password, "naveen@123");
		
		
	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

}
