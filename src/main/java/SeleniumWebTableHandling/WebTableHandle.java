package SeleniumWebTableHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html?e=1");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");		
		driver.findElement(By.xpath("//input[@value = 'Login']")).click();
		
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");// We need to switch to this frame because the element we are interacting with is inside this frame not in html directly.
		driver.findElement(By.linkText("CONTACTS")).click();// Here we have to use the link Text that we see on the page, not in the DOM.
		
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[text() = 'Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		doSelectUser("Ali khan");
		String companyName = doGetCompanyName("Ali khan");
		System.out.println("Company name is: " + companyName);
		
		String phoneNumber = doGetUserPhoneNumber("Ali khan");
		System.out.println("User phone number is: " + phoneNumber);
		
		String HomephoneNumber = doGetUserHomephoneNumber("Ali khan");
		System.out.println("User home-phone number is: " + HomephoneNumber);
		
		String mobileNumber = doGetUserMobileNUmber("Ali khan");
		System.out.println("User Mobile number is: " + mobileNumber);
		
		String email = doGetUserEmail("Ali khan");
		System.out.println("User email is: " + email);
		
		doSelectUser("deepti gupta");
		String cName = doGetCompanyName("deepti gupta");
		System.out.println("Company name is: " + cName);
	}
	
	public static void doSelectUser(String userName) {
		driver.findElement(By.xpath("//a[text() = '"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//This is called dynamic xpath because we are dynamically passing the username part of the xpath.
	}
	
	public static String doGetCompanyName(String userName) {
		return driver.findElement(By.xpath("//a[text() = '"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}
	
	public static String doGetUserPhoneNumber(String username) {
		return driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/following-sibling::td/span")).getText();
		//By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[2]/span") - This will also work.
	}
	
	public static String doGetUserHomephoneNumber(String username) {
		return driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[3]/span")).getText();
		
	}
	
	public static String doGetUserMobileNUmber(String username) {
		return driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[4]/span")).getText();
		
	}
	
	public static String doGetUserEmail(String username) {
		return driver.findElement(By.xpath("(//a[text()='"+username+"']/parent::td/following-sibling::td)[5]/a")).getText();
		
	}
	

}
