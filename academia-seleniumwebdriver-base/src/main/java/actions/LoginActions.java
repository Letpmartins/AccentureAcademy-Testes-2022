package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import utils.DriverContext;

public class LoginActions extends LoginPage {
	
	protected WebDriverWait wait;
	
	public LoginActions() {
		wait = new WebDriverWait(DriverContext.getDriver(), 10);
	}
	
	public void clickSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSignIn)).click();
	}
	
	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);
	}
	
	public void clickLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
	}

}
