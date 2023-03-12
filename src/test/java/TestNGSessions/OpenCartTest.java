package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
	
	// BaseTest is the super parent class of all the test classes,
	//  because all the common methods(setUp and tearDown) are included in the BaseTest class.
	// That's why all the test classes extend the 'BaseTest' class to inherit these methods.

	@Test(priority = 1) // Test methods will be executed in the alphabetical order unless priority is specified.
	public void titleTest() {
		String title = driver.getTitle();// Test step
		System.out.println("Page title is: "+ title); // Test step
		Assert.assertEquals(title, "Your Store"); // Validation logic
		// Assert class is already there in TestNG which has many methods that can help us write the validation logic.
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);		
	}
	
	@Test(priority = 3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url is: "+ url);
		Assert.assertEquals(url, "https://naveenautomationlabs.com/opencart/");	
	}
	
	

}
