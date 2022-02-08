package pages;

import org.openqa.selenium.By;

public class HomePage extends Metodos {

	By menuUser = By.id("menuUser");

	public void user(String user) {

		if (user.equalsIgnoreCase("user")) {
			metodos.clicar(menuUser);
			metodos.pausa(5000);

		}

	}

}
