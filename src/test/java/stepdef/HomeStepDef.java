package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pageobjects.HomePage;

public class HomeStepDef {
	
	HomePage hp = new HomePage();
	
	@Given("^\"([^\"]*)\" browser is selected$")
	public void browser_is_selected(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	@Then("^launch url \"([^\"]*)\"$")
	public void launch_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^verify page by url \"([^\"]*)\"$")
	public void verify_page_by_url(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^navigate back to home page$")
	public void navigate_back_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
