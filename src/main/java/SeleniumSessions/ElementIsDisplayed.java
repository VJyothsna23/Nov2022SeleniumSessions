package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
//		boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
//		if(flagImg) System.out.println("Image is present!");
//	
//		
//        boolean flagSearch = driver.findElement(By.name("search")).isDisplayed();
//		if(flagSearch) {
//			System.out.println("Search is present!");
//			driver.findElement(By.name("search")).sendKeys("macbook");
//		}
		
		// Another approach:
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon = By.xpath("//*[@id=\"search\"]/span/button");
		
		if(doElementIsDisplayed(logoImage)) {
			System.out.println("Image is present!");
		}
		if(doElementIsDisplayed(search)) {
			System.out.println("Search is present!");
			doSendKeys(search, "Macbook");
			doClick(searchIcon);			
		}

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}	
	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	

}
