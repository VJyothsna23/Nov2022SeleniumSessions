package SeleniumWebScraping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksAmazon {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links_list = driver.findElements(By.tagName("a"));
		//List is an order based collection. It's an interface in Java. 
		//It's just link Array List( Array List is child of List)
		int totalLinks = links_list.size();
		System.out.println("Total number of links: " + totalLinks);
		
//		int blank_counter = 0;
//		for(int i=0;i<totalLinks;i++ ) {			
//			String link_text = links_list.get(i).getText();	
//			System.out.println(i + ": " +link_text);// This prints all the links' texts including the blank texts(links without any text).
//			
//			//'links_list.get(i)' returns a web element because links_list is a list of web elements.
//			//That's why we can perform action on 'links_list.get(i)' - links_list.get(i).getText()
//			
//			if(link_text.length() >0 ){// To avoid all the blank texts
//				System.out.println(i + ": " +link_text);				
//			}
//			else if(link_text.length() == 0) {
//				blank_counter++;
//			}	
//				
//			}
//		System.out.println("The number of links with blank text are: " + blank_counter);
		
		// Same using for each loop: - Better and easy way
		int counter = 0;
		for( WebElement e: links_list) {
			String link_text = e.getText();
				if(link_text.length() > 0) {
					counter ++;
					System.out.println(counter + ": "+link_text);
				}
		}
		
		int blankLinks_count = totalLinks - counter;
		System.out.println("The number of links with blank text are: " + blankLinks_count);

	}

}
