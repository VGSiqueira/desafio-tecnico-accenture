package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**Page object de dados do produto. */
public class ProductDataPO extends BasePO {

	/**Elemento de campo de texto da data inicial do produto. */
	@FindBy(id = "startdate")
	public WebElement txtbx_StartDate;
	
	/**Elemento de seletor do valor da soma dos seguros do produto. */
	@FindBy(id = "insurancesum")
	public WebElement drpdwn_InsuranceSum;
	
	/**Elemento de seletor da avaliação de mérido do produto. */
	@FindBy(id = "meritrating")
	public WebElement drpdwn_MeritRating;
	
	/**Elemento de seletor de seguro de dados do produto. */
	@FindBy(id = "damageinsurance")
	public WebElement drpdwn_DamageInsurance;
	
	/**Elemento de opção proteção do euro como produtos opcionais. */
	@FindBy(id = "EuroProtection")
	public WebElement chkbx_EuroProtection;
	
	/**Elemento de opção seguro de defesa jurídica como produtos opcionais. */
	@FindBy(id = "LegalDefenseInsurance")
	public WebElement chkbx_LegalDefenseInsurance;
	
	/**Elemento de seletor de carro de corteria. */
	@FindBy(id = "courtesycar")
	public WebElement drpdwn_CourtesyCar;
	
	/**Elemento de botão para voltar para aba 'Enter Insurant Data'. */
	@FindBy(id = "preventerinsurancedata")
	public WebElement btn_Previous;
	
	/**Elemento de botão avançar para a aba 'Select Price Option'. */
	@FindBy(id = "nextselectpriceoption")
	public WebElement btn_Next;
	
	/**Elemento que contém as opções de produtos opcionais. */
	@FindBy(css = "#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p")
	public WebElement box_OptionalProducts;
	
	/**Lista de elementos de opções de produtos opcionais. */
	@FindBy(css = "#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label")
	public List<WebElement> chkbox_OptionalProducts;
	
	/**Construtor da classe. 
	 * @param driver Driver do navegador.
	 */
	public ProductDataPO(WebDriver driver) {
		super(driver);
	}
}
