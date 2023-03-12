package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPgTestAssignment {
		
	public static void main(String[] args) {
		
		String browser = "chrome";
		
		BrowserUtility brUtil = new BrowserUtility();
		WebDriver driver = brUtil.initDriver(browser);
	//	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//Ask if ther's any diff b/w two ways
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtility eleUtil = new ElementUtility(driver);
		
		By register = By.linkText("Register");
		eleUtil.doClick(register);
		
		By first_name = By.id("input-firstname");// We could only use id, name, xpath, css selector as locators for these?
		By last_name = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By cnfm_pwd = By.id("input-confirm");
		
		eleUtil.doSendkeys(first_name, "Jyoth");
		eleUtil.doSendkeys(last_name,"Ventra" );
		eleUtil.doSendkeys(email,"Jyo123@gmail.com" );
		eleUtil.doSendkeys(telephone,"3214567890" );
		eleUtil.doSendkeys(password,"Jyo@123" );
		eleUtil.doSendkeys(cnfm_pwd,"Jyo@123" );
		
		By agree = By.name("agree");
		eleUtil.doClick(agree);
		
		By continue_btn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		eleUtil.doClick(continue_btn);
		
		By header = By.tagName("h1");
		String header_text = eleUtil.doGetText(header);
		System.out.println("The header text says: " + header_text );

	}

}
