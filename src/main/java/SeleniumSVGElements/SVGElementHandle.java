package SeleniumSVGElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandle {

//	SVG stands for: Scalable Vector Graphics.
// For interacting with the SVG elements, the normal xpath will not work. We have to create a special xpath to interact with SVG elements.	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
//		driver.findElement(By.xpath("//svg[@id='map-svg']")); - This normal xpath doesn't work for SVG elements.
		
// Here, we need to use special xpath syntax for SVG elements:
// syntax: //*[local-name()='svg' and @attribute = 'value']//*[name()='g' and @attribute ='value']
// For the svg element, we always need to use the pre-defined function 'local-name()' and for child elements, we need to use 'name()' methods in the xpath syntax.		
		
		List<WebElement> statesSvgList = driver.findElements(By.xpath("//*[local-name() = 'svg' and @id='map-svg']//*[name()='g' and @class='region']//*[name()='path']"));

		System.out.println(statesSvgList.size());
		System.out.println("The names of the states in USA are: ");
		
		for(WebElement e: statesSvgList) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
		}
		
		for(WebElement e: statesSvgList) {
			String stateName = e.getAttribute("name");			
			if(stateName.equals("Maryland")) {
				e.click();
				break;
			}
		}
		
		List<WebElement> MarylandRegionSvgList = driver.findElements(By.xpath("//*[name()='g' and @class = 'subregion']//*[name()='path']"));
		System.out.println(MarylandRegionSvgList.size());
		System.out.println("The names of the regions in Maryland are: ");
		
		for(WebElement e: MarylandRegionSvgList) {
			String regionName = e.getAttribute("name");
			System.out.println(regionName);
		}
		
	}

}
