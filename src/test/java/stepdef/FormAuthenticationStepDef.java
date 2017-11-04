package stepdef;

import cucumber.api.java.After;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import pageobject.FormAuthenticationPage;
import cucumber.api.java.After;


public class FormAuthenticationStepDef {

	FormAuthenticationPage dp = new FormAuthenticationPage();
	
	@Given("^\"([^\"]*)\" browser is selected$")
	public void browser_is_selected(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dp.launchBrowser(arg1);
	}

	@Then("^\"([^\"]*)\" is launched$")
	public void is_launched(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	dp.launchApp(arg1);
	}

	@Then("^verify \"([^\"]*)\" is launched$")
	public void verify_is_launched(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dp.verifyPageUrl(arg1);
	   
	}

	@When("^\"([^\"]*)\" link is clicked$")
	public void link_is_clicked(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dp.identifyAndClickLink(arg1);
	}

	@Then("^pass username as \"([^\"]*)\"$")
	public void pass_username_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dp.passUserName(arg1);
	}

	@Then("^pass password\"([^\"]*)\"$")
	public void pass_password(String arg1) throws Throwable {
	   
	   dp.passPassword(arg1);
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	   
	    dp.clickLogin();
	}
	

	@Then("^verify message \"([^\"]*)\"$")
	public void verify_message(String arg1) throws Throwable {
		dp.verifyMessageOnPage(arg1);
    
	}

	@Then("^click logout button$")
	public void click_logout_button() throws Throwable {
		dp.closeApp();
   	}


	@Then("^click on dropdown option$")
	public void click_on_dropdown_option() throws Throwable {
    dp.clickDropdown();
    
	}
	
	@After
	public void closeApplication() {
		dp.closeApp();
		//driver.quit();
		
		
	}
	
	
}
