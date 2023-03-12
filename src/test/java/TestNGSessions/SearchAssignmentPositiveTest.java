package TestNGSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchAssignmentPositiveTest {
	
public WebDriver driver;
	
	public boolean doSearch(String searchKey, String productName) {
		
		driver.findElement(By.xpath("//input[@name='search']")).clear();		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(searchKey);		
		driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText(productName)).click();
		
		String selectedProduct = driver.findElement(By.xpath("//h1[text()='"+ productName +"']")).getText();
		if(selectedProduct.equals(productName)) {
			return true;
		}
		return false;
	}
	
	@DataProvider
	public Object[][] searchTestData() {
		return new Object[][] {
			{"macbook","MacBook Air"},
			{"macbook","MacBook Pro"},
			{"samsung","Samsung SyncMaster 941BW"},
			{"samsung","Samsung Galaxy Tab 10.1"},
			{"nokio","Nokio N345"}// -ve test data
			// Is this how we write negative test cases n real time projects? 
			// Do we maintain -ve tests and +ve tests in different classes for the same feature? 
			// Do we make the tests fail for -ve tests or write the steps in such a way that the -ve tests pass?
		};
	}
	
	@Test(dataProvider = "searchTestData" )
	public void searchTest(String searchKey, String productName) {
		boolean flag = doSearch(searchKey,productName);
		Assert.assertTrue(flag);
	}
	
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");		
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

}
