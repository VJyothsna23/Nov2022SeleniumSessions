package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CramPageAssignment {
	// WAP to count the total number of paragraphs on the page and print their texts.

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		List<WebElement> paraList = driver.findElements(By.tagName("p"));
		int paraSize = paraList.size();
		System.out.println("Total number of paragraphs are: "+ paraSize);
		int counter = 1;
		
		for (WebElement e: paraList) {
			String text = e.getText();
			System.out.println(counter + ": "+text);
			counter++;
		}

	}

}
