package pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Metodos extends Browsers {

	protected static Metodos metodos = new Metodos();

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------------erro ao clicar------------" + e.getMessage());
			System.err.println("-------------causa do erro------------" + e.getCause());
		}
	}

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("-------------erro ao escrever------------" + e.getMessage());
			System.err.println("-------------causa do erro------------" + e.getCause());
		}
	}

	public void fechar() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("-------------erro ao fechar------------" + e.getMessage());
			System.err.println("-------------causa do erro------------" + e.getCause());
		}
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.err.println("-------------erro ao pausar------------" + e.getMessage());
			System.err.println("-------------causa do erro------------" + e.getCause());
		}
	}

	public void validarJanela(WebElement elemento) {
		int contador = 3;
		while (elemento.isDisplayed() && contador > 0) {
			elemento.click();
			contador--;
		}
	}

	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destinoFile = new File("./Evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destinoFile);

		} catch (Exception e) {
			System.err.println("-------------erro ao tirar screenShot ------------" + e.getMessage());
			System.err.println("-------------causa do erro------------" + e.getCause());
		}
	}
}
