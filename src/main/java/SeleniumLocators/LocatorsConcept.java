package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//8 locators:
		// id, name, classname, xpath, css selector, link text, partial link text, tag name.
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// 1. By.id: This is always preferred because Id will always be unique for each element of the page.
//		driver.findElement(By.id("input-email")).sendKeys("jyo@gmail.com");
//		
//		// 2. By.name: Name can be duplicate for two different elements of a page
//		driver.findElement(By.name("password")).sendKeys("jyo@123");
//		
//		//3. By.classname: not recommended because Class name is NOT the unique attribute for an element. Multiple elements can have the same class name.
//		driver.findElement(By.className("form-control"));
//		
//		//4. By.xpath: xpath is not an attribute. It's the address of the element in the html DOM.
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("jyo@gmail.com");// right click on any element and just copy the xpath for now.
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("jyo@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By loginbtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		doSendKeys(email, "jyo@gmail.com");
//		doSendKeys(password, "jyo@123");
//		doClick(loginbtn);
		
		//5. By.css selector: This is also not an attribute. It is just a locator.
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("jyo@gmail.com");// right click on any element and just copy the xpath for now.
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("jyo@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
		//6. By.linkText: This is only applicable for links. Links will always have 'a'(anchor) tag as html tag. Link text can be duplicate.
//		driver.findElement(By.linkText("Register")).click();
//		
//		By registaerLink = By.linkText("Register");
//		doClick(registaerLink);
//		
		//7. By.partialLinkText: This is also only applicable for links. This is also not an attribute. It is just the text of the link.
//		By forgotten_password = By.partialLinkText("Forgotten");
//		doClick(forgotten_password);
		
		//8. By.tagName: html tag of an element. It is also duplicate not unique.
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
//		// .getText method works for: links, footer, headers, paragraphs or any element that has text.
		By payment = By.linkText("Recurring payments");
		String value = doGetText(payment);
		System.out.println(value);
		
		// .click method works for: buttons, links, images, check boxes, radio buttons etc.
		// .sendKeys method works for: text box/text field, drop down, file upload etc.
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

}
