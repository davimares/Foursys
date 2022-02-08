package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageLogado;
import pages.Login;

public class LoginTeste {

	Login login = new Login();
	HomePageLogado Logado = new HomePageLogado();

	@When("preencho os dados obrigatorios corretamente")
	public void preencho_os_dados_obrigatorios_corretamente() {
		
		login.loginValido();

	}

	@When("preencho os dados obrigatorios incorretamente")
	public void preencho_os_dados_obrigatorios_incorretamente() {
		login.loginInvalido();

	}
	
	@When(" não preencho os dados obrigatorios")
	public void não_preencho_os_dados_obrigatorios() {
		
		login.loginEmBranco();

	}

	@When("clico em sign in")
	public void clico_em_sign_in() {
		
		login.signIn();

	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		
		Logado.homePageLogado("Daviteste");
	}

	@Then("mensagem de erro")
	public void mensagem_de_erro() {
		
		login.erro("Incorrect user name or password.");

	}

}
