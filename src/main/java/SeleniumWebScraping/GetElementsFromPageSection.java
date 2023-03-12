package SeleniumWebScraping;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	
		static WebDriver driver;

		public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); 
			
//			List<WebElement> panelLinks_list = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
//			System.out.println(panelLinks_list.size());
//			
//			for(WebElement e: panelLinks_list) {
//				String text = e.getText();
//				System.out.println(text);
//			}
			// get text of all the right panel links:
			By panelLinks_list = By.xpath("//aside[@id='column-right']//a");
			List<String> paneltext_list = getElementsTextList(panelLinks_list);
			System.out.println(paneltext_list);// Prints like an array of text list -> [ , , , ]
			if (paneltext_list.contains("Returns")) {// Validation to check if a specific link (with given text) is present														
				System.out.println("Test PASS");
			}

			// get text of all the footer links:
			By footerLinks = By.xpath("//div[@class='row']//li");
			List<String> footertext_list = getElementsTextList(footerLinks);
			System.out.println(footertext_list);
			if (footertext_list.contains("Brands")) {
				System.out.println("TEST PASS");
			}

		}
		
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}

		public static List<String> getElementsTextList(By locator) {
			List<String> textList = new ArrayList<String>();// ArrayList class is the child of List interface. So we did top casting here.															//
			// Child class(ArrayList) object is being referred by parent interface(List) reference variable(textList).			/ 
			List<WebElement> eleList = getElements(locator);

			for (WebElement e : eleList) {
				String text = e.getText();
				System.out.println(text);
				textList.add(text);
			}
			return textList;
		}
		

}
