package pages;

import org.openqa.selenium.By;

public class NewAccount extends Metodos {

	By create = By.xpath("//a[text()='CREATE NEW ACCOUNT']");

	public void account(String account) {

		if (account.equalsIgnoreCase("CREATE NEW ACCOUNT")) {
			metodos.clicar(create);

		}

	}

}
