package SeleniumFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	// Frame is part of webElement. Frame is not a popUp.
	// There are two types of frames: 1.frame 2.iframe (inline Frame element)
	// Though they are different in Developer's point of view,In automation point of view, both are handled the same way.
	// Frames are used mainly for providing security for the webElements. (Ex: Banking applications)
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//To see the number of frames available on the page:
        int framesCount = driver.findElements(By.tagName("frame")).size();
        System.out.println(framesCount);
		
		driver.switchTo().frame("main");// switching to frame using its name or Id.
//		driver.switchTo().frame(2); - switching to frame using index.( In Java, frame indexing starts from 0) ( In html dom, indexing starts with 1 when we use capture group)
//		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));// switching to frame by passing the frame webElement.
		
		String text = driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);
        
        //Once the work in the frame is completed, we need to come back to the main page.
        driver.switchTo().defaultContent();//In order to get the driver back to the main page from the frame.
      //For popUps,driver automatically comes back once the popUp is handled. But,frame is not a popUp. It is part of WebElement.
	}

}
