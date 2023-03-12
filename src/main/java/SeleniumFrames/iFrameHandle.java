package SeleniumFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle {
	static WebDriver driver;

	// Frame is part of webElement. Frame is not a popUp.
		// There are two types of frames: 1.frame 2.iframe (inline Frame element)
		// Though they are different in Developer's point of view,In automation point of view, both are handled the same way.
		// Frames are used mainly for providing security for the webElements. (Ex: Banking applications)
		
		public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
			
// Sometimes frame will be hidden in the dom. It appears after clicking on an element.
			driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
			//after clicking on the image, now we can see that the registration page is in an iFrame.
			
//			driver.switchTo().frame("frame-one748593425"); - This we are not using because the id cntains number which may change in future.
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));// Here we are switching to frame by passing the frame webElement.
			
// Filling registration form which is in an iFrame, which was hidden in an image inside the Dom.
			By year = By.id("RESULT_TextField-2");
			By make = By.id("RESULT_TextField-3");
			By model = By.id("RESULT_TextField-4");
			By color = By.id("RESULT_TextField-5");
			By milage = By.id("RESULT_TextField-6");
			By vin = By.id("RESULT_TextField-7");
			By name = By.id("RESULT_TextField-8");
			By address1 = By.id("RESULT_TextField-9");
			By address2 = By.id("RESULT_TextField-10");
			By city = By.id("RESULT_TextField-11");
			By zip = By.id("RESULT_TextField-13");
			By phone = By.id("RESULT_TextField-14");
			By email = By.id("RESULT_TextField-15");
			
			doSendKeys(year, "2023");
			doSendKeys(make, "Nissan");
			doSendKeys(model, "N-150");
			doSendKeys(color, "Black");
			doSendKeys(milage, "4k");
			doSendKeys(vin, "21025");
			doSendKeys(name, "Jyo");
			doSendKeys(address1, "abc colony, xyz nagar");
			doSendKeys(address2, "Efg state");
			doSendKeys(city, "Cherries");
			doSendKeys(zip, "89765");
			doSendKeys(phone, "2023202320");
			doSendKeys(email, "test@123.com");
			
			WebElement state = driver.findElement(By.id("RESULT_RadioButton-12"));
			Select select = new Select(state);
			select.selectByVisibleText("Washington");
			
			driver.findElement(By.name("Submit")).click();
			
			driver.switchTo().defaultContent();
			
	  }
		
		public static void doSendKeys(By locator, String value) {
			
			driver.findElement(locator).sendKeys(value);
			
		}
		
		
		
		

}
