package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginLink extends AbstractComponent {

	public LoginLink(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	public WebElement loginLink;

	public void clickLoginLink() {
		loginLink.click();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.loginLink));
		return this.loginLink.isDisplayed();
	}

}
