package com.tiaa.srktesting.app;

import org.openqa.selenium.WebDriver;

import ApplicationPage.LoginPage;

public class BaseClass {

	WebDriver driver;
	// static WebDriverWait wait;
	// ReadPropertyFile readPropFile = new ReadPropertyFile();

	public void setUp() throws Exception {
		// System.out.println(HelperClass.getPropertyFileData().getBrowserName());
		driver = InvokeBrowser.invokeBrowser(HelperClass.getPropertyFileData().getBrowserName());
		driver.get(HelperClass.getPropertyFileData().getURL());

		// invBrow = new InvokeBrowser();
		// readPropFile = new ReadPropertyFile();
		// String browser = readPropFile.prop.getProperty("browser");
		// driver = invBrow.invokeBrowser(browser);
		// driver.get(readPropFile.prop.getProperty("url"));
	}

	public void entercredentials() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getLogin().clickLoginLink();
		loginPage.getLEmail().enterEmail();
		loginPage.getPassword().enterPassword();
		loginPage.getLoginButton().clickLoginButton();
		// wait = new WebDriverWait(driver, 60);
		// login.login.click();
		// Thread.sleep(9000);
		// wait.until(ExpectedConditions.elementToBeClickable(login.login)).click();
		// wait.until(ExpectedConditions.visibilityOf(login.email))
		// .sendKeys(HelperClass.getPropertyFileData().getUsername());
		// wait.until(ExpectedConditions.visibilityOf(login.password))
		// .sendKeys(HelperClass.getPropertyFileData().getPassword());
		// wait.until(ExpectedConditions.elementToBeClickable(login.loginsubmitbutton)).click();
		// ElementToBeClicable(login.login).click();
		// VisibilityOfElement(login.email).sendKeys(readPropFile.prop.getProperty("username"));
		// VisibilityOfElement(login.password).sendKeys(readPropFile.prop.getProperty("password"));
		// ElementToBeClicable(login.loginsubmitbutton).click();
	}

	public void teardown() {
		driver.quit();
	}

	// public WebElement ElementToBeClicable(WebElement element) {
	// wait = new WebDriverWait(driver, 60);
	// return wait.until(ExpectedConditions.elementToBeClickable(element));
	// }
	//
	// public WebElement VisibilityOfElement(WebElement element) {
	// wait = new WebDriverWait(driver, 60);
	// return wait.until(ExpectedConditions.visibilityOf(element));
	// }
}
