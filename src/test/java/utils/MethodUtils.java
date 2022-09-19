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

	/**Instância do driver do navegador. */
	public WebDriver driver;
	
	/**Instância de Duration.*/
	private Duration tempoSegundos;
	
	/**Instância de WebDriverWait. */
	private WebDriverWait esperar;
	
	/**
	 * Método responsável por verificar se elemento está sendo exibido. 
	 * @param elemento Elemento a ser verificado se está sendo exibido.
	 */
	public void verificarSeElementoEstahSendoExibido(WebElement elemento) {
		
		if(!elemento.isDisplayed()) {
			throw new NoSuchElementException("Elemento não está disponível na página.");
		}
	}
	
	public void esperaImplicita(int tempoMaximoEspera, WebDriver driver) {
		tempoSegundos = Duration.ofSeconds(tempoMaximoEspera);
		
		driver.manage().timeouts().implicitlyWait(tempoSegundos);
	}
	
	/** 
	 * Método responsável por aguardar um elemento estar vísivel.
	 * @param elemento Elemento a ser aguardado.
	 * @param driver Driver do navegador.
	 * @param tempoMaximoEspera Tempo máximo de espera até aprensentar alguma exception.
	 */
	public void aguardarElementoFicarVisivel(WebElement elemento, WebDriver driver, int tempoMaximoEspera) {
		
		tempoSegundos = Duration.ofSeconds(tempoMaximoEspera);
		
		esperar = new WebDriverWait(driver, tempoSegundos);
		esperar.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(elemento));
	}
	
	/** 
	 * Método responsável por aguardar um elemento ser clicável.
	 * @param elemento Elemento a ser aguardado.
	 * @param driver Driver do navegador.
	 * @param tempoMaximoEspera Tempo máximo de espera até aprensentar alguma exception.
	 */
	public void aguardarElementoSerClicavel(WebElement elemento, WebDriver driver, int tempoMaximoEspera) {
		
//		tempoSegundos = Duration.ofSeconds(tempoMaximoEspera);
//		
//		driver.manage().timeouts().implicitlyWait(tempoSegundos);
		
		esperaImplicita(tempoMaximoEspera, driver);
		
		esperar = new WebDriverWait(driver, tempoSegundos);
		esperar.until(ExpectedConditions.elementToBeClickable(elemento));
	}
	
	/** 
	 * Método responsável por aguardar um elemento por texto.
	 * @param elemento Elemento a ser aguardado.
	 * @param driver Driver do navegador.
	 * @param texto Texto a ser aguardado no elemento.
	 * @param tempoMaximoEspera Tempo máximo de espera até aprensentar alguma exception.
	 */
	public void aguardarElementoPorTexto(WebElement elemento, WebDriver driver, String texto, int tempoMaximoEspera) {
		
		tempoSegundos = Duration.ofSeconds(tempoMaximoEspera);
		
		driver.manage().timeouts().implicitlyWait(tempoSegundos);
		
		esperar = new WebDriverWait(driver, tempoSegundos);
		esperar.until(ExpectedConditions.textToBePresentInElement(elemento, texto));
	}
	
	/**
	 * Método responsável por clicar em um elemento.
	 * @param elemento Elemento a ser clicado.
	 * @param driver driver do navegador
	 * @param tempoMaximoEspera Tempo máximo de espera antes de apresentar uma exception.
	 */
	public void clicar(WebElement elemento, WebDriver driver, int tempoMaximoExpera) {
		
		aguardarElementoSerClicavel(elemento, driver, tempoMaximoExpera);
		elemento.click();
	}
	
	/**
	 * Método responsável por selecionar uma opção de um drop down ao passar uma opção.
	 * @param drpdwn Elemento de drop down que será interagido.
	 * @param opcao Opção a ser selecionada no drop down.
	 */
	public void selecionarOpcaoDropDown(WebElement drpdwn, String opcao) {
		
		Select opcaoSelecionada = new Select(drpdwn);
		opcaoSelecionada.selectByVisibleText(opcao);
	}
	
	/**
	 * Método responsável por limpar um campo de texto.
	 * @param txtbx Elemento de campo de texto a ser limpo.
	 * @param tempoMaximoEspera Tempo máximo de espera antes de apresentar uma exception.
	 */
	public void limparCampoTexto(WebElement txtbx, int tempoMaximoEspera) {
		
		txtbx.clear();		
	}
	
	/**
	 * Método responsável por escrever texto em um campo de texto.
	 * @param txtbx Elemento de campo de texto.
	 * @param driver Driver do navegador.
	 * @param texto Texto a ser inserido no campo.
	 * @param tempoMaximoEspera Tempo máximo de espera antes de apresentar uma exception.
	 */
	public void escreverCampoTexto(WebElement txtbx, WebDriver driver, String texto, int tempoMaximoEspera) {
		
		aguardarElementoFicarVisivel(txtbx, driver, tempoMaximoEspera);
		limparCampoTexto(txtbx, tempoMaximoEspera);
		txtbx.sendKeys(texto);
	}
	
	/**
	 * Método responsável por obter um texto de um elemento.
	 * @param elemento Elemento que vai ser usado para obter o seu texto.
	 * @return Retorna o texto do elemento.
	 */
	public String obterTexto(WebElement elemento) {
		
		String texto = elemento.getText();
		
		return texto;
	}
	
	/**
	 * Método responsável por selecionar as opções a partir de uma lista de opções.
	 * @param listaOpcoes Lista de elementos de opções.
	 * @param driver Driver do navegador.
	 * @param opcoes Array de opções que serão selecionadas.
	 * @param tempoMaximoExpera Tempo máximo de espera antes de apresentar uma exception.
	 */
	public void selecionarOpcoes(List<WebElement> listaOpcoes, WebDriver driver, String[] opcoes, int tempoMaximoExpera) {
		
		for (String opcao : opcoes) {
			WebElement elementoOpcao = listaOpcoes.stream()
					.filter(op -> obterTexto(op).contains(opcao))
					.findFirst().orElse(null);
			clicar(elementoOpcao, driver, tempoMaximoExpera);
		}
	}
	
}
