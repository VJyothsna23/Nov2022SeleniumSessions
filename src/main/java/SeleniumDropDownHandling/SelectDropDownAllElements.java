package SeleniumDropDownHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_getForm_Country");		
		doSelectDropDownValue(country, "India");
				
		if(getTotalDropDownOptions(country)==233) {
			System.out.println("Total Options Count Check is PASS");
		}
		
		List<String> expCountry_list = Arrays.asList("India", "Brazil", "Belgium", "Bahamas");		
		if(getDropDownOptionsTextList(country).containsAll(expCountry_list)) {
			System.out.println("Expected country options are available in the list" );			
		}
		
		List<String> optionsText_list = getDropDownOptionsTextList(country);
		Collections.sort(optionsText_list);//If we want to sort the options list

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public static List<WebElement> getDropDownOptionsList(By locator) {
		WebElement dropDown_ele = getElement(locator);
		Select select = new Select(dropDown_ele);
		return select.getOptions();
		
	}
	
	public static int getTotalDropDownOptions(By locator) {
		int options_count = getDropDownOptionsList(locator).size();
		System.out.println("The number of options available are: " + options_count);
		return options_count;
	}

	public static List<String> getDropDownOptionsTextList(By locator) {		
		List<WebElement> options_list = getDropDownOptionsList(locator);		
		List<String> optionsText_list = new ArrayList<String>();
		for (WebElement e : options_list) {			
			String text = e.getText();
			System.out.println(text);
			optionsText_list.add(text);
		}		
		return optionsText_list;

	}
	
	public static void doSelectDropDownValue(By locator, String value) {				
		List<WebElement> options_list = getDropDownOptionsList(locator);
		for (WebElement e : options_list) {			
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
			
		}		
		
	}

}


