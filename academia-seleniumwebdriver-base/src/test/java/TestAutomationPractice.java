import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.LoginActions;
import actions.PruchaseFlowActions;
import utils.Constants;
import utils.DriverContext;

public class TestAutomationPractice {
	WebDriver driver;
	LoginActions account;
	PruchaseFlowActions purchase;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		account = new LoginActions();
		purchase = new PruchaseFlowActions();
	}
	
	@Test
	public void projectTest() {
		account.clickSignIn();
		account.enterEmail("leticia@email.com");
		account.enterPassword("12345");
		account.clickLogin();
		purchase.searchSummerDresses();
		purchase.applyFilter();
		purchase.chooseItem();
		
		purchase.checkoutLink();
		purchase.checkoutLink();
		purchase.btnCheckoutAddressClick();
		purchase.shippingClick();
		purchase.paymentClick();
		purchase.confirmOrderClick();
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

}
