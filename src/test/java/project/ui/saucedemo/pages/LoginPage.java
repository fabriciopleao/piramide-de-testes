package project.ui.saucedemo.pages;

import project.ui.saucedemo.elementos.Elementos;
import project.ui.saucedemo.metodos.Metodos;

public class LoginPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void login(String username, String password) {
		metodo.escrever(el.campoUser, username);
		metodo.escrever(el.campoPass, password);
		metodo.clicar(el.btnLogin);
	}
	
	public void validarLoginComSucesso() {
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");
	}
	
	public void validarLoginError() {
		
	}
 }
