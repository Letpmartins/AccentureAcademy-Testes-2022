package actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.PurchaseFlowPage;
import utils.DriverContext;

public class PruchaseFlowActions extends PurchaseFlowPage {
	
	protected WebDriverWait wait;
	protected Actions action;
	
	public PruchaseFlowActions() {
		wait = new WebDriverWait(DriverContext.getDriver(), 20);
		action = new Actions(DriverContext.getDriver());
	}

	public void searchSummerDresses() {
		action.moveToElement(btnWomen).perform();
		wait.until(ExpectedConditions.visibilityOf(btnSummer)).click();
	}
	
	public void applyFilter() {
		wait.until(ExpectedConditions.elementToBeClickable(fabricChoice)).click();
	}
	
	public void chooseItem() {
		action.moveToElement(purchaseItem).perform();
		wait.until(ExpectedConditions.visibilityOf(addCart)).click();
	}
	
	public void checkoutLink() {
		wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
	}
	
	public void btnCheckoutAddressClick() {
		wait.until(ExpectedConditions.elementToBeClickable(btnCheckoutAddress)).click();
	}
	
	public void shippingClick() {
		wait.until(ExpectedConditions.visibilityOf(termsOfService)).click();
		wait.until(ExpectedConditions.visibilityOf(btnCheckoutShipping)).click();
	}
	public void paymentClick() {
		wait.until(ExpectedConditions.visibilityOf(payment)).click();
	}
	
	public void confirmOrderClick() {
		wait.until(ExpectedConditions.visibilityOf(confirmOrder)).click();
	}
	


}
