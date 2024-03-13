package project.ui.saucedemo.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import project.ui.saucedemo.drivers.DriversFactory;

public class Navegadores extends DriversFactory {

	static boolean exibirNavegador = true; // true: mostrar navegador || false: não mostrar navegador

	public static void iniciarTest() {
		ChromeOptions options = new ChromeOptions();
		if (!exibirNavegador) {
			options.addArguments("--headless");
		}
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
	}

	public static void finalizarTest() {
		driver.quit();

	}

}
