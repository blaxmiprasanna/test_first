package stepdefinations;

import org.apache.commons.logging.impl.Log4JLogger;

import com.tiaa.srktesting.app.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination extends BaseClass {

	Log4JLogger log = new Log4JLogger();

	@Given("^User is in home page$")
	public void user_is_in_home_page() throws Throwable {

		log.info("testing 1");

		setUp();
	}

	@When("^Enter username and password and click on login button$")
	public void enter_username_and_password_and_click_on_login_button() throws Throwable {
		entercredentials();
		Thread.sleep(6000);
		log.info("testing 2");
	}

	@Then("^user login page should be displayed$")
	public void user_login_page_should_be_displayed() throws Throwable {
		teardown();
		log.info("testing 3");

	}

}
