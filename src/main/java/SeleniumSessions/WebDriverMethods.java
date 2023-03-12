package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		String url = driver.getCurrentUrl();
		System.out.println(" Current Url is: " + url);
		if(url.contains("amazon")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		String page_source = driver.getPageSource();
// Inside the page source of any url, you can find the complete java script/ html code.
		System.out.println(page_source);
		if(page_source.contains("NAVYAAN FOOTER END")) {
			System.out.println("PASS");
		}
		
		driver.quit();		
	
	}

}
