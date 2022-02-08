package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browsers;
import pages.CreateAccount;
import pages.HomePage;
import pages.HomePageLogado;
import pages.NewAccount;

public class CadastroTeste {

	Browsers browsers = new Browsers();
	HomePage home = new HomePage();
	NewAccount account = new NewAccount();
	CreateAccount create = new CreateAccount();
	HomePageLogado Logado = new HomePageLogado();

	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String site) {

		browsers.abrirNavegador(site);

	}

	@Given("e seleciono o opção USER")
	public void e_seleciono_o_opção_user() {

		home.user("user");

	}

	@Given("e clico em CREATE NEWACCOUNT")
	public void e_clico_em_create_newaccount() {

		account.account("CREATE NEW ACCOUNT");

	}

	@When("preencho os dados obrigatorios")
	public void preencho_os_dados_obrigatorios() {

		create.createAccount1();

	}

	@When("clico em I AGREE")
	public void clico_em_i_agree() {

		create.iGree();

	}

	@When("clico em REGISTER")
	public void clico_em_register() {

		create.register();

	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() {

		Logado.homePageLogado("Daviteste");

	}

	@When("preencho os dados obrigatorios com infromações invalidas")
	public void preencho_os_dados_obrigatorios_com_infromações_invalidas() {

		create.createAccount2();

	}

	@Then("não será possivel prosseguir em REGISTER")
	public void não_será_possivel_prosseguir_em_register() {

		create.register();

	}

	@When("não preencho os dados obrigatorios")
	public void não_preencho_os_dados_obrigatorios() {

		create.createAccount3();

	}

	@When("não clico em I AGREE")
	public void não_clico_em_i_agree() {

		create.iGree();

	}

}
