package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageAssignmentNegativeTest {
	
	public WebDriver driver;
	
	public boolean doRegistration(String fn, String ln, String email, String phn, String pwd, String cnfrm) {
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.clear();
		firstName.sendKeys(fn);
		
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.clear();
		lastName.sendKeys(ln);
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.clear();
		emailId.sendKeys(email);
				
		WebElement phone = driver.findElement(By.id("input-telephone"));
		phone.clear();
		phone.sendKeys(phn);
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys(pwd);
		
		WebElement confirmPwd = driver.findElement(By.id("input-confirm"));
		confirmPwd.clear();
		confirmPwd.sendKeys(cnfrm);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement headerEle = driver.findElement(By.xpath("//div[@id='content']/h1"));
		if(headerEle.isDisplayed()){
			
			String headerText = headerEle.getText();
			if(headerText.contains("Your Account Has Been Created!")) {
				return false;
			}
		}
		return true;
		// How to check the -ve test cases in this scenario?
		// Why all my test cases are passing in this example? The test with the first set of data must fail.
	}
	
	@DataProvider
	public Object[][] registrationTestData() {
		return new Object[][] {
			{"Jyo","G","jyoth@gmail.com","9090909090","test123"},
			{"Jyoth","@#45","jyoth@","909090967","testtt123"},
			{" ","G78!","jyoth","909090","test3"},
			{"Jyo"," ","jyoth@gmailcom","#$90909090"," "}
		};		
	}
	
	@Test(dataProvider = "registrationTestData")
	public void registrationTest(String fn, String ln, String email, String phn, String pwd) {
		boolean flag = doRegistration(fn,ln,email,phn,pwd,pwd);
		Assert.assertTrue(flag);		
	}
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

}
