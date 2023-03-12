package SeleniumSessions;

public class CustomXpathConcept {

	public static void main(String[] args) {
		// xpath is not an attribute. It is the address of an element in the html dom.
		//1. Absolute xpath : This, you can directly copy from the dom. The complete path starting from hierarchy.  Ex:
		//  This xpath is not recommended. The problem with this kind of xpath is that it is risky to use. 
		// Because with any changes in the page, this xpath won't work.
		
		//2. Relative xpath: This is custom xpath and is the most recommended way.
		//2a. Formula to create relative xpath with 1 attribute: 
		//tag[@attr='value']
		
		//2b. Formula to create relative xpath with 2 attributes: Here both the conditions(attribute values) must be satisfied.
		//tag[@attr1='value' and @attr2='value']
		
		//2c. Formula to create relative xpath with 3 attributes: 
		//tag[@attr1='value' and @attr2='value' and @attr3='value']
		
		//Like this we can use n number of attributes while creating the xpath.
		
		//2d. Formula to create relative xpath with 2 attributes using 'or': Here either one of the conditions(attribute values) must be satisfied.
		//tag[@attr1='value' or @attr2='value']
		
		//2e. Formula to create relative xpath with just tag name: //tagname 
		
		//2f. Formula to create relative xpath with text(): text is not an attribute. 
		//tag[text()='value']
		
		//It is the text content of the element. so Don't use @text, we need to use text() function.
		
		//2g. Formula to create relative xpath with text() and an attribute: Here sequence doesn't matter.
		//tag[@attr='value' and text()='value']  or,
		//tag[text()='value' and @attr='value']
		
		//2h. Formula to create relative xpath with text() and multiple attributes: Here sequence doesn't matter
		//tag[@attr1='value' and text()='value' and @attr2='value']  or,
		//tag[text()='value'and @attr1='value'and @attr2='value']
		
		//2i. Formula to create relative xpath with contains() with attribute: We use this approach for dynamic attributes(dynamic elements) in real time.
		//Here we don't need to pass the entire value when we are using contains function. 
		//tag[contains(@attr,'value')]
		
		//2j. Formula to create relative xpath with contains() with one attribute, another attribute without contains():
		//tag[contains(@attr1,'value') and @attr2='value']
		
		//2k. Formula to create relative xpath with contains() with one attribute, 2 other attributes without contains():
		//tag[contains(@attr1,'value') and @attr2='value' and @attr3='value']
		
		//2l. Formula to create relative xpath with contains() with text():
		//tag[contains(text(),'value')]
		
		//2m. Formula to create relative xpath with contains() with text() and contains with attribute:
		//tag[contains(text(),'value') and contains(@attr1,'value')]
		
		//2n. Formula to create relative xpath with contains() with text() and attribute without contains:
		//tag[contains(text(),'value') and @attr='value']
		
		//2o. Formula to create relative xpath with 'starts-with() with attribute' or 'starts-with() with text()':
		//Here we don't need to pass the entire value. We are locating element with an attribute that starts with a specific value.
		//tag[strats-with(@attr,'value')] or
		//tag[strats-with(text(),'value')]
		// There is no function that says ends-with(). This used to be there but now it is deprecated and no longer available.
		
		//****** Position/ index in xpath******//
		//2p. formulas: 
		// 1. (//tag[@attr='value'])[index] - using index of the element in DOM
		// 2. (//tag[@attr='value'])[position()=1] - using position of the element in DOM
		// 3. (//tag[@attr='value'])[last()]- Getting the last element highlighted in DOM
		// 4. (//tag[@attr='value'])[last()-1]- Getting the last but one element highlighted in DOM
		
		//****** xpath using className ******//
		//tag[@class='complete value'] - Here we need to include all the classes available for class attribute value in Dom.
		// if we use contains() method in xpath, we can use just one class from the class attribute value.
		
		// but, if we use By.className, we can include one specific class name from the class attribute value.
		
		//****** Parent to child approach in xpath: ******//
		
		// formula for direct child : //tag[@attr='value']/childTag -- parent/child ----> direct child elements
		// formula for direct and indirect child : //tag[@attr='value']//childTag -- parent//child ----> direct and indirect child elements
		
		//****** child to Parent approach in xpath: Backward traversing ******//
		
		// formula for reaching immediate parent:         //tag[@attr='value']/..  ----> immediate parent
		// Another formula for reaching immediate parent: //tag[@attr='value']/parent::ParentTagname ----> immediate parent
		
		// formula for reaching immediate grand parent : //tag[@attr='value']/../..  ----> immediate grand parent		
		// formula for reaching grand parents level by level : //tag[@attr='value']/../../../..  ----> great grand parents level by level backward traversing
		
		// Another formula for reaching any grand parent: //tag[@attr='value']/ancestor::GrandParentTagname ----> Grand parent in any level
		
		//****** sibling to sibling approach in xpath: ******//
		// formula for reaching following sibling : //tag[@attr='value']/following-sibling::SiblingTagname ---->immediately next sibling
		// formula for reaching preceding sibling : //tag[@attr='value']/preceding-sibling::SiblingTagname ---->immediately before sibling
		
		
		
	}

}
