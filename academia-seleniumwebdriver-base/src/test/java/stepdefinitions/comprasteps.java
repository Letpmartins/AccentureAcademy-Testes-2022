package stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.PruchaseFlowActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverManager;

public class comprasteps {
	
	DriverManager manager = new DriverManager();
	WebDriver driver = manager.AbrirUrl();
	PruchaseFlowActions action = PageFactory.initElements(driver, PruchaseFlowActions.class);
	
	public comprasteps(){}
	
	@Given("usuario esta logado na aplicacao")
	public void usuario_esta_logado_na_aplicacao() {
		String urlEsperada = "http://automationpractice.com/index.php?controller=my-account";
		boolean verificaUrl = driver.getCurrentUrl().equals(urlEsperada);
		assertTrue(verificaUrl);
	}

	@Given("busca por um produto")
	public void busca_por_um_produto() {
		action.searchSummerDresses();
		action.applyFilter();
	}

	@Given("adiciona o produto ao carrinho")
	public void adiciona_o_produto_ao_carrinho() {
		action.chooseItem();
	}

	@When("o usuario clica no botao ProceedToCheckout")
	public void o_usuario_clica_no_botao_proceed_to_checkout() {
		action.checkoutLink();
	}

	@When("completa as verificacoes de compra")
	public void completa_as_verificacoes_de_compra() {
		action.checkoutLink();
		action.btnCheckoutAddressClick();
		action.shippingClick();
		action.paymentClick();
		action.confirmOrderClick();
	}

	@Then("aparece na tela um resumo da compra")
	public void aparece_na_tela_um_resumo_da_compra() {
		String tituloEsperado = "Order confirmation - My Store";
		boolean verificaTitulo = driver.getTitle().equals(tituloEsperado);
		assertTrue(verificaTitulo);
	}
}
