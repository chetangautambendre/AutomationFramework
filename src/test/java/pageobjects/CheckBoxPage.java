package pageobjects;

import generic.SeleniumClass;

public class CheckBoxPage extends SeleniumClass{
	
	String xpathCheckBox = "//form/input[%d]";
	
	public void clickCheckbox(int index) {
		
		xpathCheckBox = String.format(xpathCheckBox, index);
		super.element = super.identifyElements(xpathCheckBox, locatorType.xpath);
		super.performAction(super.element, "click", null);
	}
	
}
