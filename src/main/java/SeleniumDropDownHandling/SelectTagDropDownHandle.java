package SeleniumDropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//Some dropDowns are Select based dropDowns and some are not.
		//We can easily identify the type of dropDown by checking the tag name of the element.
		//Select based dropDowns will always have the html tag ---  <Select>
		//We need to use Select class ( which is already available in Selenium) in order to access these select based dropDowns.
		
		// *** This below approach works only and only for dropDown elements with Select html tag.
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By country = By.id("Form_getForm_Country");
//		WebElement countryEle = driver.findElement(country);
		
//		Select select = new Select(countryEle);// Select class has it's own class constructor that requires us to pass the 'WebElement' while creating it's object.
//		select.selectByIndex(5);// This selects the element at the 5th index(6th element available in the dropdown).
//		select.selectByValue("Canada");// This selects the element in the dropdown with the given value attribute
//		select.selectByVisibleText("Costa Rica");// This selects the element in the dropdown with the given text(text of the element).

		doSelectDropDownByIndex(country,5);
		Thread.sleep(3000);// This method takes milli seconds as parameter. Here we are passing 3000 milli secs = 3secs
		
		doSelectDropDownByValue(country,"Canada");
		// If there's no element in the options with the given value, Selenium throws 'No Such Element Exception'.
		Thread.sleep(3000);
		
		doSelectDropDownByVisibleText(country,"Costa Rica");
		
				
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		WebElement dropDownEle = getElement(locator);
		Select select = new Select(dropDownEle);
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		WebElement dropDownEle = getElement(locator);
		Select select = new Select(dropDownEle);
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		WebElement dropDownEle = getElement(locator);
		Select select = new Select(dropDownEle);
		select.selectByVisibleText(text);
	}

}
