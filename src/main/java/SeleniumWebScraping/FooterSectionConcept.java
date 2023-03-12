package SeleniumWebScraping;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		getFooterSectionList("Information");
	}
	
	public static void getFooterSectionList(String sectionName) {
		List<WebElement> FooterSection_list = 
				driver.findElements(By.xpath("//h5[text()='"+sectionName+"']/following-sibling::ul//a"));
		// (//div[@class='container'])[5]//div[@class='col-sm-3']/h5[text()='Information']/following-sibling::ul/li
		
		System.out.println(FooterSection_list.size());
		List<String> FooterSectionText_list = new ArrayList<String>();
		for(WebElement e:FooterSection_list) {
			
			String text = e.getText();
			System.out.println(text);
			FooterSectionText_list.add(text);
		}

	}

}
