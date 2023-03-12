package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesudoElementsConcept {
	
	// Pesudo elements are elements that are not written with the tag( ex: *) whose property is not present in the dom.
	// These elements can't be interacted using Selenium. we need to use Java Script for this.

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(4000);

	}

}
