package SeleniumPopUps;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		Set<String> handles = driver.getWindowHandles();// This method returns a set of String. 
// From the above line, 'handles' is a Set that contains window-Ids for both the windows(Parent, child). Window ids change every single time we launch the program.
// Set is an order-less( index-less) collection of data. It doesn't maintain the order and doesn't hold duplicate values (unlike List). 	
// In order to fetch the value from a set, we need to use a special Iterator( because we can't use any loop as it doesn't follow order/indexing)		
		
		Iterator<String> it = handles.iterator();// This method returns Iterator of String. Iterator() is generally used for non-index based collection.
		String parentWindowId = it.next();
		System.out.println("Parent Window Id is: "+ parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child Window Id is: "+ childWindowId);
			
		//Now that we have the window Ids, we need to switch the driver to the specific window. 
		//Here we can't use driver.navigateTo().forward() or .back() because its not opening in the same window. It's opening a new window. 
		driver.switchTo().window(childWindowId);// Passing child window Id so we can switch the browser to child window.
		
		//Validating the child window:
		System.out.println("The child window url is: "+ driver.getCurrentUrl());
		
		driver.close();// This closes only the child window.
		// If we use driver.quit(), it closes both parent window and child window.
// Once the child window is closed, the driver will be lost. We have to switch it back to the parent window. It won't automatically come back to the parent window. 		
		
// Here, driver.switchTo().defaultContent() will not work. It only works for frames or, whenever we are working on the same page. Here we are working between 2 windows.
		driver.switchTo().window(parentWindowId);
		System.out.println("The parent window url is: "+ driver.getCurrentUrl());
		
		driver.quit(); // Here we can use either close() or quit() to close the parent window because there is only one browser left.
	
// This is the same exact way we handle advertisement popUps too. They are link browser window popUps.	
	}

}
