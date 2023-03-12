package SeleniumShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(2000);
		
//		driver.findElement(By.id("pizza")).sendKeys("Veg Pizza");
		
		//Here is the hierarchy for shadow DOM :  browser --> page --> shadow DOM --> element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizzaEle = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		// The JS Path that we have copied in DOM returns a browser element. We need to convert it into web element so we can interact with it using selenium.
		pizzaEle.sendKeys("Cheese Pizza");
		

	}

}
