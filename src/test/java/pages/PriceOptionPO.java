package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**Page object de opções de preços. */
public class PriceOptionPO extends BasePO {

	/**Elemento de opção de plano silver. */
	@FindBy(css = "#priceTable > tfoot > tr > th.group > label:nth-child(1)")
	public WebElement rdbtn_Silver;
	
	/**Elemento de opção de plano gold. */
	@FindBy(css = "#priceTable > tfoot > tr > th.group > label:nth-child(2)")
	public WebElement rdbtn_Gold;
	
	/**Elemento de opção de plano platinum. */
	@FindBy(css = "#priceTable > tfoot > tr > th.group > label:nth-child(3)")
	public WebElement rdbtn_Platinum;
	
	/**Elemento de opção de plano ultimate. */
	@FindBy(css = "#priceTable > tfoot > tr > th.group > label:nth-child(4)")
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
		super(driver);
	}
}
