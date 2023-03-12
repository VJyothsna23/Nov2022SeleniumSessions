package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement baseEle = driver.findElement(By.name("email"));
		
		String aboveEleText = driver.findElement(with(By.tagName("label")).above(baseEle)).getText();
		System.out.println("Text of the element Above the base element is: "+aboveEleText);
		
		String belowEleText = driver.findElement(with(By.tagName("a")).below(baseEle)).getText();
		System.out.println("Text of the element below the base element is: "+belowEleText);
		
		String nearHeaderEleText = driver.findElement(with(By.tagName("div")).near(baseEle)).getText();
		System.out.println("Text of the element near the base element is: "+nearHeaderEleText);

	}

}
