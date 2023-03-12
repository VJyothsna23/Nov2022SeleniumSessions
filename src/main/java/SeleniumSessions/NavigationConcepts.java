package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcepts {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        System.out.println(driver.getTitle());

        driver.navigate().forward();
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        
        driver.navigate().refresh();// To refresh the current page.
        
//This is called back and forward simulation.
//The comparison between .get() Vs .to() methods:
// 1. Both help us to launch the Url.
// 2. Using both methods we can maintain the history, which means using either of these methods, we will be able to perform .back() and .forward().
// 3.Both are exactly synonyms to each other because when we call .to() method, it internally calls .get() method.
// 4. The only difference b/w these two methods is that, .to() method is overloaded.It can take either String type or URL type parameter. 
// But, .get() method is not overloaded. It only accepts String type Url.
// See below example:
        driver.navigate().to("https://www.amazon.com"); // Here we are passing String type url.
        driver.navigate().to(new URL("https://www.amazon.com"));// Here we are passing URL type url.
        // Both of the above perform the same action. This is the only added feature of .to() method. 
        //.get() method only accepts String type URL only.
        
        
	}

}
