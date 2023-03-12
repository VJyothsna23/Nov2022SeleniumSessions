package SeleniumActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
		
		// Some elements in the web page are hidden(child menu elements which are hidden under parent menu element). 
		// To interact with these hidden elements we need to use Actions class to display these elements.
		
		Actions act = new Actions(driver);
		act.moveToElement(menu).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();
	}

}
