package stepdef;

import cucumber.api.java.en.Then;
import pageobjects.DropdownPage;

public class DropdownStepdef {
	
	DropdownPage ddp = new DropdownPage();
	
	@Then("^select \"([^\"]*)\" by \"([^\"]*)\"$")
	public void select_by(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    ddp.selectFromDropdown(arg2, arg1);
	}

}
