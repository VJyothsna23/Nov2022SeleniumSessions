package SeleniumWebScraping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttributeAmazon {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
//		List<WebElement> links_list = getElements(links);
//		System.out.println("Total lnumber of links = " + links_list.size());
//		
//		// Fetch href and link text for each and every link:
//		for(WebElement e: links_list) {
//			String hrefVal = e.getAttribute("href");
//			String linkText = e.getText();
//			
//			System.out.println(hrefVal +" -----> "+ linkText );// This is called Web Scraping, which can be used for analyzing the data.
//		}
//		
//		List<WebElement> images_list = getElements(images);
//		System.out.println("Total number of images = " + images_list.size());
//		
//		for(WebElement e: images_list) {
//			String src = e.getAttribute("src");
//			System.out.println(src);
//		}
		
		doGetElementAttributes(links,"href" );
		doGetElementAttributes(images,"src" );

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static void doGetElementAttributes(By locator, String attrName) {
		List<WebElement> ele_list = getElements(locator);
			
		for(WebElement e: ele_list) {
			String eleAttrValue = e.getAttribute(attrName);
			System.out.println(eleAttrValue);
		}
		
	}
	
	

}
