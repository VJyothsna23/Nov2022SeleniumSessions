package SeleniumActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By continueBtn = By.cssSelector("input[type='submit']");
		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys(driver.findElement(fn), "Jyothsna").build().perform();
//		act.sendKeys(driver.findElement(ln), "Ventrapati").build().perform();
//		act.click(driver.findElement(continueBtn)).build().perform();
		
		doActionsSendKeys(fn, "Jyothsna");
		doActionsSendKeys(ln, "Ventrapati");
		doActionsClick(continueBtn);

	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
