package SeleniumWaitConcept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Selenium 3.x method, which is now deprecated.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// selenium 4.x feature
	//  Here we applied global wait of 10secs on all the elements when searching. 
	//	   That means every single time we write 'driver.findElement' in the code, it applies wait.
	// If element is found within 2 secs, then the remaining 8 secs will be ignored.

// Implicitly wait disadvantages:
		
// 1. Implicitly wait unnecessarily applies wait on each and every element when finding(searching) which is not needed.
//     Because once the page is fully loaded, we don't need to wait every single time while finding the element.
// 2. If we want to change the wait, we need to re-write the entire line of implicitly wait multiple times. 
//     Since this is time taking, that's why we don't use it much in the frame work. Not recommended wait at all.
// 3. Implicitly wait is only for the WebElements like svg, i Frame, WebElements. It doesn't support non-webElements. like JS pop ups, title, url, etc	
//		This wait doesn't work for 'driver.findElements'
		
	}

}
