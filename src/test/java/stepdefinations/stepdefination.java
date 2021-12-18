package stepdefinations;

import com.relevantcodes.extentreports.LogStatus;
import com.tiaa.srktesting.app.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefination extends BaseClass {

	com.relevantcodes.extentreports.ExtentReports report;
	com.relevantcodes.extentreports.ExtentTest logger;

	@Given("^User is in home page$")
	public void user_is_in_home_page() throws Throwable {
		report = new com.relevantcodes.extentreports.ExtentReports("./repors/login.html");
		logger = report.startTest("start the test");
		setUp();
	}

	@When("^Enter username and password and click on login button$")
	public void enter_username_and_password_and_click_on_login_button() throws Throwable {
		entercredentials();
		logger.log(LogStatus.INFO, "enter username and password");
		Thread.sleep(6000);
	}

	@Then("^user login page should be displayed$")
	public void user_login_page_should_be_displayed() throws Throwable {
		teardown();
		logger.log(LogStatus.INFO, "close the browser");
		report.endTest(logger);
		report.flush();
	}

}
