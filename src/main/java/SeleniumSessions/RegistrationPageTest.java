package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
	
	public static void main(String[] args) {
		
		String browser_name = "chrome";
		
		BrowserUtility brUtil = new BrowserUtility();
		
		WebDriver driver = brUtil.initDriver(browser_name);
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println("Page title is: " + title);
		
		By first_name = By.id("input-firstname");
		By last_name = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirm_password = By.id("input-confirm");
		
		ElementUtility eleUtil = new ElementUtility(driver);
		eleUtil.doSendkeys(first_name, "Jyothsna");
		eleUtil.doSendkeys(last_name, "Ventrapati");
		eleUtil.doSendkeys(email, "jyo@gmail.com");
		eleUtil.doSendkeys(phone, "1234567890");
		eleUtil.doSendkeys(password, "jyo@123");
		eleUtil.doSendkeys(confirm_password, "jyo@123");
		
	}

}
