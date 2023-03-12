package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{	
	
	@Test(priority = 1) // Test methods will be executed in the alphabetical order unless priority is specified.
	public void titleTest() {
		String title = driver.getTitle();// Test step
		System.out.println("Google page title is: "+ title); // Test step
		Assert.assertEquals(title, "Google"); // Validation logic
		// Assert class is already there in TestNG which has many methods that can help us write the validation logic.
	}
	
	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);		
	}
	
	@Test(priority = 3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Google page url is: "+ url);
		Assert.assertEquals(url, "https://www.google.com/");	
	}
	
	@Test(priority = 4)
	public void isAboutLinkExistTest() {
		boolean flag = driver.findElement(By.linkText("About")).isDisplayed();
		Assert.assertTrue(flag);		
	}
		
}
