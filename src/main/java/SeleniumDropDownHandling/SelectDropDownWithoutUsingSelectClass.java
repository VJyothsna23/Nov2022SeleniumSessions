package SeleniumDropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country_options = By.xpath("//select[@id='Form_getForm_Country']/option");	
		doSelectDropDownWithoutSelectClass(country_options, "Brazil");
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void doSelectDropDownWithoutSelectClass(By locator, String value){
		List<WebElement> options_list = getElements(locator);
		System.out.println("The total number of options available are: " + options_list.size());
		for(WebElement e: options_list) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}

}
