package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistratioPageAssignment {
	
	static WebDriver driver;
		
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1st approach:
//		driver.findElement(By.id("input-firstname")).sendKeys("Jyothsna");
//		driver.findElement(By.id("input-lastname")).sendKeys("Ventrapati");
//		driver.findElement(By.id("input-email")).sendKeys("Jyo@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
//		driver.findElement(By.id("input-password")).sendKeys("Jyo@123");
//		driver.findElement(By.id("input-confirm")).sendKeys("Jyo@123");
		
		//2nd approach:
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		WebElement emial = driver.findElement(By.id("input-email"));
//		WebElement telephone = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement confirmPwd = driver.findElement(By.id("input-confirm"));
//		
//		firstName.sendKeys("Jyothsna");
//		lastName.sendKeys("Ventrapati");
//		emial.sendKeys("Jyo@gmail.com");
//		telephone.sendKeys("1234567890");
//		password.sendKeys("Jyo@123");
//		confirmPwd.sendKeys("Jyo@123");
		
		//3rd approach:
//		By f_name = By.id("input-firstname");
//		By l_name = By.id("input-lastname");
//		By mail = By.id("input-email");
//		By phone = By.id("input-telephone");
//		By pwd = By.id("input-password");
//		By c_pwd = By.id("input-confirm");
//				
//		WebElement firstName = driver.findElement(f_name);
//		WebElement lastName = driver.findElement(l_name);
//		WebElement emial = driver.findElement(mail);
//		WebElement telephone = driver.findElement(phone);
//		WebElement password = driver.findElement(pwd);
//		WebElement confirmPwd = driver.findElement(c_pwd);
//		
//		firstName.sendKeys("Jyothsna");
//		lastName.sendKeys("Ventrapati");
//		emial.sendKeys("Jyo@gmail.com");
//		telephone.sendKeys("1234567890");
//		password.sendKeys("Jyo@123");
//		confirmPwd.sendKeys("Jyo@123");
		
		//4th approach:
//		By f_name = By.id("input-firstname");
//		By l_name = By.id("input-lastname");
//		By mail = By.id("input-email");
//		By phone = By.id("input-telephone");
//		By pwd = By.id("input-password");
//		By c_pwd = By.id("input-confirm");
//		
//		send_Keys(f_name,"Jyothsna" );
//		send_Keys(l_name,"Ventrapati" );
//		send_Keys(mail,"Jyo@gmail.com" );
//		send_Keys(phone,"1234567890" );
//		send_Keys(pwd,"Jyo@123" );
//		send_Keys(c_pwd,"Jyo@123" );
		
		//5th approach:
		By f_name = By.id("input-firstname");
		By l_name = By.id("input-lastname");
		By mail = By.id("input-email");
		By phone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By c_pwd = By.id("input-confirm");
		
		ElementUtility eleUtil = new ElementUtility(driver);
		
		eleUtil.doSendkeys(f_name,"Jyothsna" );
		eleUtil.doSendkeys(l_name,"Ventrapati" );
		eleUtil.doSendkeys(mail,"Jyo@gmail.com" );
		eleUtil.doSendkeys(phone,"1234567890" );
		eleUtil.doSendkeys(pwd,"Jyo@123" );
		eleUtil.doSendkeys(c_pwd,"Jyo@123" );
				
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void send_Keys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
		
}
