package pageobjects;

import generic.SeleniumClass;

public class DropdownPage extends SeleniumClass {
	
	String idDropdown = "dropdown";
	
	public void selectFromDropdown(String type, String value) {
		super.element = super.identifyElements(idDropdown, locatorType.id);
		super.performAction(super.element, type, value);
		
	}
}
