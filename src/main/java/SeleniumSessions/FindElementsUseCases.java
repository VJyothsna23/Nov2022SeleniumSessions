package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By links = By.tagName("a");
		if (getTotalElementsCount(links) > 250) {// some validation can be performed. Here we are checking if the no.of links are more than 250
			System.out.println("Test Passed");
		}

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getTotalElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("Total number of elements in the list are: " + eleCount );
		return eleCount;
	}

}
