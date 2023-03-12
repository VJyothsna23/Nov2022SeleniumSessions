package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String ph = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(ph);
//		
//		String srcVal = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		String titleVal = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		
//		System.out.println("Src value is:" + srcVal);
//		System.out.println("Title value is:" + titleVal);
		
		By imageLogo  = By.className("img-responsive");
		String src = doGetAttribute(imageLogo, "src");
		String title = doGetAttribute(imageLogo, "title");
		System.out.println("Src value of the image logo is: " + src);
		System.out.println("Title value of the image logo is: " + title);

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttribute(By locator, String atribute) {
		return getElement(locator).getAttribute(atribute);		
	}

}
