package utils;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**Classe para armazenar métodos úteis que serão utilizados em todo o projeto. */
public class MethodUtils {

	public WebDriver driver;
	
	private Duration tempoSegundos;
	
	private WebDriverWait esperar;
	
	public void verificarSeElementoEstahDisponivel(WebElement elemento) {
		
		if(!elemento.isDisplayed()) {
			throw new NoSuchElementException("Elemento não está disponível na página.");
		}
	}
	
	public void aguardarElementoFicarVisivel(WebElement elemento, WebDriver driver, int tempoMaximoEspera) {
		
		tempoSegundos = Duration.ofSeconds(tempoMaximoEspera);
		
		esperar = new WebDriverWait(driver, tempoSegundos);
		esperar.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(elemento));
	}
	
	public void aguardarElementoSerClicavel(WebElement elemento, WebDriver driver, int tempoMaximoEspera) {
		
		tempoSegundos = Duration.ofSeconds(tempoMaximoEspera);
		
		driver.manage().timeouts().implicitlyWait(tempoSegundos);
		
		esperar = new WebDriverWait(driver, tempoSegundos);
		esperar.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	public void clicar(WebElement elemento, WebDriver driver, int tempoMaximoExpera) {
		
		aguardarElementoSerClicavel(elemento, driver, tempoMaximoExpera);
		elemento.click();
	}
	
	public void selecionarOpcaoDropDown(WebElement drpdwn, String opcao) {
		
		Select opcaoSelecionada = new Select(drpdwn);
		opcaoSelecionada.selectByVisibleText(opcao);
	}
	
	public void limparCampoTexto(WebElement txtbx, int tempoMaximoEspera) {
		
		txtbx.clear();		
	}
	
	public void escreverCampoTexto(WebElement txtbx, WebDriver driver, String texto, int tempoMaximoEspera) {
		
		aguardarElementoFicarVisivel(txtbx, driver, tempoMaximoEspera);
		limparCampoTexto(txtbx, tempoMaximoEspera);
		txtbx.sendKeys(texto);
	}
	
	public String obterTexto(WebElement elemento) {
		
		String texto = elemento.getText();
		
		return texto;
	}
	
	public void selecionarOpcoes(List<WebElement> listaOpcoes, WebDriver driver, String[] opcoes) {
		
		for (String opcao : opcoes) {
			WebElement elementoOpcao = listaOpcoes.stream()
					.filter(op -> obterTexto(op).contains(opcao))
					.findFirst().orElse(null);
			clicar(elementoOpcao, driver, 10);
		}		
	}
	
}
