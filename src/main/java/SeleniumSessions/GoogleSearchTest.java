package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen Automationlabs");
		Thread.sleep(3000);
//		List<WebElement> google_suggestionsList= driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
//		//xpath = //div[@class='OBMEnb']//li  -also works.
//		//xpath = //li[@role='presentation']//div[@class='wM6W7d']/span  -also works.
//		for(WebElement e: google_suggestionsList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("reviews")) {
//				e.click();
//				break;// 
//			}
//		}
		By suggestionElements = By.xpath("//div[@class='erkvQe']//li");
		doSearchSelection(suggestionElements, "github");

	}
	public static void doSearchSelection(By locator, String value) {
		List<WebElement> SuggestionsList = driver.findElements(locator);
		System.out.println(SuggestionsList.size());
		
		for(WebElement e: SuggestionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}		
	}

}
