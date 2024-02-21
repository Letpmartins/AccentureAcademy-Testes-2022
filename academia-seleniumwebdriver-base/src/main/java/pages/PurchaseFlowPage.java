package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;

public class PurchaseFlowPage {

	public PurchaseFlowPage() {
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	@FindBy(how = How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	protected WebElement btnWomen;
	
	@FindBy(linkText = "Summer Dresses")
	protected WebElement btnSummer;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"ul_layered_id_feature_5\"]/li[2]/label/a")
	protected WebElement fabricChoice;
	
	@FindBy(className = "product-container")
	protected WebElement purchaseItem;
	
	@FindBy(linkText= "Add to cart")
	protected WebElement addCart;
	
	@FindBy(linkText = "Proceed to checkout")
	protected WebElement checkout;
	
	@FindBy(name = "processAddress")
	protected WebElement btnCheckoutAddress;
	
	@FindBy(id = "uniform-cgv")
	protected WebElement termsOfService;
	
	@FindBy(name = "processCarrier")
	protected WebElement btnCheckoutShipping;
	
	@FindBy(className = "bankwire")
	protected WebElement payment;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
	protected WebElement confirmOrder;
	
}