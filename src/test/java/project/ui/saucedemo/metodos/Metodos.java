package project.ui.saucedemo.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import project.ui.saucedemo.drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void validarUrl(String url) {	
		try {
			assertEquals(url, driver.getCurrentUrl());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
