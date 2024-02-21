package stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import actions.LoginActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Constants;
import utils.DriverManager;

public class loginsteps {
	
	DriverManager manager = new DriverManager();
	WebDriver driver = manager.AbrirUrl();
	LoginActions action = PageFactory.initElements(driver, LoginActions.class);
	
	public loginsteps(){
		}
	
	@Given("Usuario abrir site {string}")
	public void usuario_abrir_site(String string) {
		driver.get(Constants.PATH_URL);

	}

	@Given("clicar no link SignIn")
	public void clicar_no_link_sign_in() {
	    action.clickSignIn();
	}
	
	@When("o usuario preencher com {string} o campo email")
	public void o_usuario_preencher_com_o_campo_email(String email) {
	    action.enterEmail(email);
	}

	@When("preencher com {string} o campo senha")
	public void preencher_com_o_campo_senha(String password) {
	    action.enterPassword(password);
	}

	@When("clica no botao SignIn")
	public void clica_no_botao_sign_in() {
	    action.clickLogin();
	}

	@Then("a aplicacao abre a area do usuario")
	public void a_aplicacao_abre_a_area_do_usuario() {
		String urlEsperada = "http://automationpractice.com/index.php?controller=my-account";
		boolean verificaUrl = driver.getCurrentUrl().equals(urlEsperada);
		assertTrue(verificaUrl);
	}
}
