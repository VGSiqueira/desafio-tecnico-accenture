package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**Page object de dados do assegurado. */
public class InsurantDataPO extends BasePO {

	/**Elemento de campo de texto do primeiro nome do assegurado. */
	@FindBy(id = "firstname")
	public WebElement txtbx_FirstName;
	
	/**Elemento de campo de texto do último nome do assegurado. */
	@FindBy(id = "lastname")
	public WebElement txtbx_LastName;
	
	/**Elemento de campo de texto da data de nascimento do assegurado. */
	@FindBy(id = "birthdate")
	public WebElement txtbx_DateBirth;
	
	/**Elemento de opção de gênero masculino do assegurado. */
	@FindBy(css = "#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)")
	public WebElement rdbtn_Male;
	
	/**Elemento de opção de gênero feminino do assegurado. */
	@FindBy(css = "#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2)")
	public WebElement rdbtn_Female;
	
	/**Elemento de campo de texto de endereço do assegurado. */
	@FindBy(id = "streetaddress")
	public WebElement txtbx_StreetAdress;
	
	/**Elemento de seletor de país do assegurado. */
	@FindBy(id = "country")
	public WebElement drpdwn_Country;
	
	/**Elemento de campo de texto de código postal do assegurado. */
	@FindBy(id = "zipcode")
	public WebElement txtbx_ZipCode;
	
	/**Elemento de campo de texto de cidade do assegurado. */
	@FindBy(id = "city")
	public WebElement txtbx_City;
	
	/**Elemento de seletor de ocupação do assegurado. */
	@FindBy(id = "occupation")
	public WebElement drpdwn_Occupation;
	
	/**Elemento de opção corrida como passamento do assegurado. */
	@FindBy(id = "speeding")
	public WebElement chkbx_Speeding;
	
	/**Elemento de opção bungee jumping como passamento do assegurado. */
	@FindBy(id = "bungeejumping")
	public WebElement chkbx_BungeeJumping;
	
	/**Elemento de opção queda livre como passamento do assegurado. */
	@FindBy(id = "cliffdiving")
	public WebElement chkbx_CliffDiving;
	
	/**Elemento de opção paraquedismo como passamento do assegurado. */
	@FindBy(id = "skydiving")
	public WebElement chkbx_Skydiving;
	
	/**Elemento de opção outro como passamento do assegurado. */
	@FindBy(id = "other")
	public WebElement chkbx_Other;
	
	/**Elemento de campo de texto de site do assegurado. */
	@FindBy(id = "website")
	public WebElement txtbx_Website;
	
	/**Elemento de campo de texto de foto do assegurado. */
	@FindBy(id = "picture")
	public WebElement txtbx_Picture;
	
	/**Elemento de botão para abrir foto do assegurado. */
	@FindBy(id = "open")
	public WebElement btn_Open;
	
	/**Elemento de botão para voltar para aba 'Enter Vehicle Data'. */
	@FindBy(id = "preventervehicledata")
	public WebElement btn_Previous;
	
	/**Elemento de botão avançar para a aba 'Enter Product Data'. */
	@FindBy(id = "nextenterproductdata")
	public WebElement btn_Next;
	
	/**Elemento que contém as opções de hobbies. */
	@FindBy(css = "#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p")
	public WebElement box_hobbies;
	
	/**Lista de elementos de opções de hobbies. */
	@FindBy(css = "#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label")
	public List<WebElement> chkbox_hobbies;
	
	/**Construtor da classe. 
	 * @param driver Driver do navegador.
	 */
	public InsurantDataPO(WebDriver driver) {
		super(driver);
	}
}
