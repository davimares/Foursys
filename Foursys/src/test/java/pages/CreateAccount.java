package pages;

import org.openqa.selenium.By;

public class CreateAccount extends Metodos {

	By username = By.name("usernameRegisterPage");
	By email = By.name("emailRegisterPage");
	By password = By.name("passwordRegisterPage");
	By password2 = By.name("confirm_passwordRegisterPage");
	By iGree = By.name("i_agree");
	By register = By.id("register_btnundefined");

	public void createAccount1() {

		metodos.escrever(username, "Daviteste");
		metodos.escrever(email, "daviteste@teste.com");
		metodos.escrever(password, "Davi@123");
		metodos.escrever(password2, "Davi@123");
		metodos.pausa(3000);
	}

	public void createAccount2() {

		metodos.escrever(username, "Da");
		metodos.escrever(email, "davitesteteste.com");
		metodos.escrever(password, "123");
		metodos.escrever(password2, "1234");
		metodos.pausa(3000);

	}

	public void createAccount3() {

		metodos.escrever(username, "");
		metodos.escrever(email, "");
		metodos.escrever(password, "");
		metodos.escrever(password2, "");
		metodos.pausa(3000);

	}

	public void iGree() {

		metodos.clicar(iGree);
		metodos.pausa(3000);

	}

	public void register() {

		metodos.clicar(register);
		metodos.pausa(3000);
	}
}
