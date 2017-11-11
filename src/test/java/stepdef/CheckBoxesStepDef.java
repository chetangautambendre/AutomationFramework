package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.CheckBoxPage;

public class CheckBoxesStepDef {
	
	CheckBoxPage cbp = new CheckBoxPage();
	
	@Then("^click checkbox (\\d+)$")
	public void click_checkbox(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    cbp.clickCheckbox(arg1);
	}

}
