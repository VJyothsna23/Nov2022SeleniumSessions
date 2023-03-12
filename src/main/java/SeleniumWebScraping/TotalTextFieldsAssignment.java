package SeleniumWebScraping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFieldsAssignment {
	
// WAP to find the total number of text fields on the page and to get the 'name' attribute of all of them.
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> textFields_list = driver.findElements(By.className("form-control"));
		int total_textFields = textFields_list.size();
		System.out.println("Total number of text fields are: " +total_textFields );
				
		for(WebElement e:textFields_list ) {
			String alltribue_name = e.getAttribute("name");
			System.out.println(alltribue_name);
		}
		
	}

}
