package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
// Above is static import because 'with' is a static method in 'RelativeLocator' class.

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
// Relative Locators: This is a new feature of Selenium 4.x.
//   where you will find a base element and using this element, you will be able to interact with the elements around the base element.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(2000);
		
		WebElement baseEle = driver.findElement(By.linkText("Lancienne Lorette, Canada"));
		
		String rightEleText = driver.findElement(with(By.tagName("p")).toRightOf(baseEle)).getText();// We are asking driver to find the element with 'p' as tag name, which is to the right of the base element.
		System.out.println("Text of the element Right to the base element is: "+rightEleText);
// 'With' is a static method which is from a class called 'RelativeLocator'. In order to use this, we need to do static import.
// If we don't want to import this method, we can use it directly with its class name.
//   driver.findElement(RelativeLocator.with(By)).toRightOf(baseEle));
			
		String lefttEleText = driver.findElement(with(By.tagName("p")).toLeftOf(baseEle)).getText();
		System.out.println("Text of the element Left to the base element is: "+lefttEleText);
		
		String topEleText = driver.findElement(with(By.tagName("p")).above(baseEle)).getText();
		System.out.println("Text of the element Above the base element is: "+topEleText);
		
		String belowEleText = driver.findElement(with(By.tagName("p")).below(baseEle)).getText();
		System.out.println("Text of the element Below the base element is: "+belowEleText);
		
		String nearEleText = driver.findElement(with(By.tagName("p")).near(baseEle)).getText();
		// When we use .near() method, it only searches for the specific element within Pixel Range of 100. This Pixel range is defined in Selenium internally. we can't change it.
		// Here the nearest element to the baseElement with tagName 'p' is it's own parent.
		//If we try to fetch its text, we get the text of the same base element. Because, when we try to fetch text of an element, we can apply .getText on either the element or it's parent. Either way we can obtain the text.
		System.out.println("Text of the element near the base element is: "+nearEleText);
	}

}
