package GlueFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class genericLogin {

	@Given("Browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Successfully running glue file of given");

	}

	@And("user has provided the url of login page")
	public void user_has_provided_the_url_of_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Successfully running glue file of and");

	}

	@When("User inputs {string} and {string} # Email can be replaced with username too.")
	public void user_inputs_and_email_can_be_replaced_with_username_too(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Successfully running glue file of when");

	}

	@And("Press the login button")
	public void press_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Successfully running glue file of and");

	}

	@Then("User should navigate to next page")
	public void user_should_navigate_to_next_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Successfully running glue file of then");

	}

}
