package SeleniumWebScraping;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> images_list = driver.findElements(By.tagName("img"));
		int total_images = images_list.size();
		System.out.println("Total number of images are: " + total_images);
		
		for(WebElement e: images_list) {
			String imageSrc = e.getAttribute("src");
			System.out.println(imageSrc);
		}
		
		
	}

}
