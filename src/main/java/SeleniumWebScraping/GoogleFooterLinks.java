package SeleniumWebScraping;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By footer_elements = By.xpath("//div[@class='KxwPGc AghGtd']/a"); //div[@class='o3j99 c93Gbe']//a
		List<String> footerTexts_list= getElementText(footer_elements);
		if(footerTexts_list.contains("Business")) {
			System.out.println("PASS");
		}
		doClickSpecificLink(footer_elements, "Business");	

	}
	
	public static List<WebElement> getElemets(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementText(By locator) {
		List<WebElement> ele_list = getElemets(locator);
		List<String> eleTexts_list = new ArrayList<String>();
		for(WebElement e: ele_list) {
			String text = e.getText();
			System.out.println(text);
			eleTexts_list.add(text);			
		}
		System.out.println("size is:" + eleTexts_list.size());
		return eleTexts_list;
		
	}
	public static void doClickSpecificLink(By locator, String value) {
		List<WebElement> ele_list = getElemets(locator);
		
		for(WebElement e: ele_list) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}		
		
	}

}
