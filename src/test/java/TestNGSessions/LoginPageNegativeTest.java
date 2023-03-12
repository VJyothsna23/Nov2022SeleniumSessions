package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	
	public WebDriver driver;
	
	public boolean doLogin(String userName, String pwd) {
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		if(errorMsg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;
	}
	
	@DataProvider
	public Object[][] loginPageNegativeTestData() {
		return new Object[][] {
			{"jyo@gmail.com","test123"},
			{"jyo@gmail","testing"},
			{"jyo","testttt"},
			{" ","test123456@#$"},
			{"jyo@gmail.com",""}
		};
	}
	
	@Test(dataProvider = "loginPageNegativeTestData" )
	public void loginPageTest(String userName, String passWord) {
		boolean flag = doLogin(userName,passWord);
		Assert.assertTrue(flag);
	}
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
