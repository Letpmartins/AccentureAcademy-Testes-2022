package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class LoginPage {
	
	public LoginPage(){
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(linkText="Sign in")
	protected WebElement linkSignIn;
	
	@FindBy(id = "email")
	protected WebElement txtEmail;
	
	@FindBy(id = "passwd")
	protected WebElement txtPassword;
	
	@FindBy(id="SubmitLogin")
	protected WebElement btnLogin;
	
}
