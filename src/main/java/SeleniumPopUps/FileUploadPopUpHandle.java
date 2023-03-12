package SeleniumPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\jyoth\\OneDrive\\Desktop\\Jyothsna\\testpic.png");
		// This is the only scenario where we are using send keys on a button(choose file button).
		// This formula only works for elements that has type = 'file' attribute with any html tag.
		// The reason is, the moment we click on it, pop up window appears to select the file manually. We can't automate this using selenium.
        
		// If this type = 'file' attribute is not there, we do have some alternative solutions like below.
//		   1. autoIT/Robot Class - These only work for windows machines and headless mode. But we will be running test cases for diff machines like Doccer containers, cloud machines etc.
//		   2. Sikuli - This is image based. The moment resolution is changed, this also won't work.
//			That's why none of the above solutions are recommended to use in modern automation. Only option would be asking Developer to add this attribute.		
	}

}
