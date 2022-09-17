package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**Page object de opções de preços. */
public class PriceOptionPO {

	/**Elemento de opção de plano silver. */
	@FindBy(id = "selectsilver")
	public WebElement rdbtn_Silver;
	
	/**Elemento de opção de plano gold. */
	@FindBy(id = "selectgold")
	public WebElement rdbtn_Gold;
	
	/**Elemento de opção de plano platinum. */
	@FindBy(id = "selectplatinum")
	public WebElement rdbtn_Platinum;
	
	/**Elemento de opção de plano ultimate. */
	@FindBy(id = "selectultimate")
	public WebElement rdbtn_Ultimate;
	
	/**Elemento de botão para voltar para aba 'Enter Insurant Data'. */
	@FindBy(id = "preventerproductdata")
	public WebElement btn_Previous;
	
	/**Elemento de botão avançar para a aba 'Send Quote'. */
	@FindBy(id = "nextsendquote")
	public WebElement btn_Next;
	
	/**Construtor da classe. 
	 * @param driver Driver do navegador.
	 */
	public PriceOptionPO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
