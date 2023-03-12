package SeleniumPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentWindowId = driver.getWindowHandle();
		
		//To open a new tab using selenium, we use .TAB, If we use .WINDOW, it opens a new window. The way we handle is the same for both.
		driver.switchTo().newWindow(WindowType.WINDOW);// New (method)feature from Selenium 4.x
		
		//Now driver goes to the new tab
		driver.get("https://google.com");
		System.out.println("New tab title is: "+ driver.getTitle());
		driver.close();// Closes only the new window(current window).
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title is: "+ driver.getTitle());
		
		driver.quit();// closes all windows (both parent and any child windows present ).

	}

}
