package SeleniumPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//      driver.get("https://username:pwd@domain name(remaining part of url)");			
//  Above is the way we need to enter credentials for authentication pop ups. We can't do this using actions class send keys method.
//	Here we are passing user credentials(username and password) along with the url.	
		
// Limitation: The problem with this approach is that, if our username or pwd has '@' within them, then this doesn't work.
// To overcome this limitation, we need to use a simple username and pwd without using @.
		
		String username = "admin";
		String password = "admin";
		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
		
		
		
	}

}
