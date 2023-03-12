package SeleniumPopUps;

import org.openqa.selenium.By;

public class AlertJSPopUpNotes {

	public static void main(String[] args) {
		
// Different Alerts/ pop-ups:
// 1) Java script alerts - alert, prompt, confirmation pop up 
//    These 3 pop-ups are coming because of the Java Script written by the developer( Developer generated alerts).
//   1a) JS Alert: Just a message, this only comes with OK button. Ex: alert('Hi, This is my alert')
//   1b) JS Prompt: It's a message that asks you to enter something, this comes with OK, Cancel buttons. 
//           Ex: prompt('Hi Jyothsna, enter your ID')
//       When you enter some value in JS Prompt pop-up, you won't be able to see the text in the text field, when we enter through selenium.
//       You will never see two JS Prompt pop-ups where 2 text fields are there.
		
//   1c) JS confirmation: It's a message that asks you to confirm something, this comes with OK, Cancel buttons. 
//                    Ex: confirm('Are you sure you want to delete this user?')	
//   Two JS pop-ups never appear at the same time. This doesn't happen.
//   When pop ups appear, the entire page will freeze. Until we release the pop-up we won't be able to interact with the page elements.
//   Once the JS pop up is handled, the driver automatically comes back to the main window(browser).		
		
//   How to recognize a JS pop-up: 	
//		JS pop-ups will have no Url, it's not part of the browser, you can't inspect anything on the JS pop-up.
		
// 2) Authentication pop up: Authentication pop ups appear the movement you enter the url. 
//		Authentication pop ups require you to enter the user credentials( user name and password) to be authorized.
//	  These pop ups are also not web elements, which means we can't inspect them to interact with them.	
//
//
		
// 3) Browser window pop up/ advertisement pop up: When we click on a specific link, sometimes it opens in a new browser window,
//		which has a completely different domain and it's own url. This is called Browser window pop up/ advertisement pop up.
//     This happens because of the 'target' property. If it equals '_blank' then link gets opened in a new browser window.(target="_blank")		
// Ex: advertisement links like facebook, instagram, etc.  As a QA engineer, we won't be responsible for testing the new browser window that opens up.
		
		
		
// 4) File upload pop up: 
//		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\jyoth\\OneDrive\\Desktop\\Jyothsna\\testpic.png");
//		 This is the only scenario where we are using send keys on a button(choose file button).
//		 This formula only works for elements that has type = 'file' attribute with any html tag.
//		 The reason is, the moment we click on it, pop up window appears to select the file manually. We can't automate this using selenium.
//        
		
// 5) Random Pop ups: These pop ups appear randomly without any specific click or adds or etc. 
//		These pop ups can't be handled and automated because we have no idea when they will show up.	
//      Better solution is to Block(disable) these random popUps in the QA/Stage/Test Environments because,
//		these are only supposed to appear in the production Environment for advertisement purposes only. 
//      It's not in QA engineer's scope or Functional testing scope to test these.
//
//	The difference b/w advertisement popUps and Random popUps is that, advertisement popUps appear the moment we open a url.
		// Random popups appear randomly, there is no set time for when they appear.
		
// You can never have alerts and browser window pop ups together at the same time. This never happens.
		
	}
	
}