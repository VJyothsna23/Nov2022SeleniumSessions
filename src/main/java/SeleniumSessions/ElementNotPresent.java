package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotPresent {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImage = By.className("img-responsive1111");// wantedly passing wrong locator here so that selenium won't be able to find this element 
				
		boolean flagImage = driver.findElement(logoImage).isDisplayed();// An exception will be thrown on this line
		System.out.println(flagImage);
		
//If the element is not present or, If the wrong locator is passed, "driver.findElement" will throw 'No Such Element' exception.
//Exception will be thrown while creating the webElement, not while performing action. So no exception on line 16 while passing the locator. 
//There is no exception called 'Element Not Found' in Selenium.
		
//But in case of "driver.findElements", it will not throw any exception. It just gives an empty list, that means list count will be 0.
		

	}

}
