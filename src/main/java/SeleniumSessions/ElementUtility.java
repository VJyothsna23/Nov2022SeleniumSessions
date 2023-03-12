package SeleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtility {

	private WebDriver driver;

	public ElementUtility(WebDriver driver) {// Class constructor
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String doGetAttribute(By locator, String atribute) {
		return getElement(locator).getAttribute(atribute);
	}

	public void doGetElementAttributes(By locator, String attrName) {
		List<WebElement> ele_list = getElements(locator);

		for (WebElement e : ele_list) {
			String eleAttrValue = e.getAttribute(attrName);
			System.out.println(eleAttrValue);
		}

	}

	public int getTotalElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("Total number of elements in the list are: " + eleCount);
		return eleCount;
	}

	public List<String> getElementsTextList(By locator) {
		List<String> textList = new ArrayList<String>();// ArrayList class is the child of List interface. So we did top
														// casting here.
		List<WebElement> eleList = getElements(locator);

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
			textList.add(text);
		}
		return textList;
	}

	public List<String> getElementsAttribueList(By locator, String attribute) {
		List<String> attributeList = new ArrayList<String>();// ArrayList class is the child of List interface. So we
																// did top casting here.
		List<WebElement> eleList = getElements(locator);

		for (WebElement e : eleList) {
			String attr_value = e.getAttribute(attribute);
			System.out.println(attr_value);
			attributeList.add(attr_value);
		}
		return attributeList;
	}

	public void doSearchSelection(By locator, String value) {
		List<WebElement> SuggestionsList = getElements(locator);
		System.out.println(SuggestionsList.size());

		for (WebElement e : SuggestionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

	// *********** Select based drop down Utilities ************//

	public void doSelectDropDownByIndex(By locator, int index) {
		WebElement dropDownEle = getElement(locator);
		Select select = new Select(dropDownEle);
		select.selectByIndex(index);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		WebElement dropDownEle = getElement(locator);
		Select select = new Select(dropDownEle);
		select.selectByValue(value);
	}

	public void doSelectDropDownByVisibleText(By locator, String text) {
		WebElement dropDownEle = getElement(locator);
		Select select = new Select(dropDownEle);
		select.selectByVisibleText(text);
	}

	public List<WebElement> getDropDownOptionsList(By locator) {
		WebElement dropDown_ele = getElement(locator);
		Select select = new Select(dropDown_ele);
		return select.getOptions();

	}

	public int getTotalDropDownOptions(By locator) {
		int options_count = getDropDownOptionsList(locator).size();
		System.out.println("The number of options available are: " + options_count);
		return options_count;
	}

	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> options_list = getDropDownOptionsList(locator);
		List<String> optionsText_list = new ArrayList<String>();
		for (WebElement e : options_list) {
			String text = e.getText();
			System.out.println(text);
			optionsText_list.add(text);
		}
		return optionsText_list;

	}

	public void doSelectDropDownValue(By locator, String value) {
		List<WebElement> options_list = getDropDownOptionsList(locator);
		for (WebElement e : options_list) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}

	public void doSelectDropDownWithoutSelectClass(By locator, String value) {
		List<WebElement> options_list = getElements(locator);
		System.out.println("The total number of options available are: " + options_list.size());
		for (WebElement e : options_list) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

	// *********** Explicit Wait Utilities ************//

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible
	 * 
	 * @param locator
	 * @param timeOut
	 * @return - the WebElement once it is located
	 */
	public WebElement waitForElementPresence(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and is visible. Visibility means that the element is not only displayed but
	 * also has a height and width that isg reater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return - the WebElement once it is located and visible
	 */
	public WebElement waitForElementVisible(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

}
