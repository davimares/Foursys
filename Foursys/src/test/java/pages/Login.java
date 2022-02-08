package pages;

import org.openqa.selenium.By;

public class Login extends Metodos {

	By username = By.name("username");
	By password = By.name("password");
	By signIn = By.id("sign_in_btnundefined");
	By erro = By.id("signInResultMessage");

	public void loginValido() {
		metodos.pausa(3000);
		metodos.escrever(username, "Daviteste");
		metodos.escrever(password, "Davi@123");

	}

	public void loginInvalido() {
		metodos.pausa(3000);
		metodos.escrever(username, "Daviteste");
		metodos.escrever(password, "D23");

	}

	public void loginEmBranco() {
		metodos.pausa(3000);
		metodos.escrever(username, "");
		metodos.escrever(password, "");

	}

	public void signIn() {
		metodos.clicar(signIn);
	}

	public void erro(String erro) {

		if (erro.equalsIgnoreCase("Incorrect user name or password.")) {

		}

	}
}
