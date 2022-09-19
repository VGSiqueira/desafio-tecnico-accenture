package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**Classe do gerenciador do WebDriver. */
public class WebDriverManager {

	/**Instância do driver do navegador. */
	private WebDriver driver;
	
	/**
	 * Construtor da classe. 
	 * @driver Driver do navegador.
	 */
	public WebDriverManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	/**
	 * Método responsável por obter o driver.
	 * @return Retorna o driver.
	 */
	public WebDriver getWebDriver() {
		
		return (driver == null) ? driver = new ChromeDriver() : driver;
	}
	
	/**Método responsável por finalizar o driver.*/
	public void closeDriver() {
		
		driver.close();
		driver.quit();
	}
}
