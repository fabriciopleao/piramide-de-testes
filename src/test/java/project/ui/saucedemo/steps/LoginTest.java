package project.ui.saucedemo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.ui.saucedemo.navegadores.Navegadores;
import project.ui.saucedemo.pages.LoginPage;

public class LoginTest {
	
	LoginPage loginPage = new LoginPage();
	
	@Given("acessar aba login")
	public void acessarAbaLogin() {
	    Navegadores.iniciarTest();
	}
	@When("enviar dados validos de login")
	public void enviarDadosValidosDeLogin() {
		loginPage.login("standard_user", "secret_sauce");
	}
	@Then("login efetuado com sucesso")
	public void loginEfetuadoComSucesso() {
	    loginPage.validarLoginComSucesso();
	    Navegadores.finalizarTest();
	}



}
