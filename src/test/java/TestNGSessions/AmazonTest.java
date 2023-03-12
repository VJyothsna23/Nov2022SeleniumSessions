package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
		
	@Test(priority = 1) // Test methods will be executed on the alphabetical order unless priority is specified.
	public void titleTest() {
		String title = driver.getTitle();// Test step
		System.out.println("Amazon page title is: "+ title); // Test step
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more."); // Validation logic
		// Assert class is already there in TestNG which has many methods that can help us write the validation logic.
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);		
	}
	
	@Test(priority = 3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Amazon page url is: "+ url);
		Assert.assertEquals(url, "https://www.amazon.com/");	
	}
	
	@Test(priority = 4)
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.xpath("//a[text()='Help']")).isDisplayed();
		Assert.assertTrue(flag);		
	}
	
}
