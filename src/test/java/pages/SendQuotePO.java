package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**Page object de enviar cotação. */
public class SendQuotePO {

	/**Elemento de campo de texto e-mail para envio da cotação. */
	@FindBy(id = "email")
	public WebElement txtbx_Email;
	
	/**Elemento de campo de texto telefone. */
	@FindBy(id = "phone")
	public WebElement txtbx_Phone;
	
	/**Elemento de campo de texto usuário. */
	@FindBy(id = "username")
	public WebElement txtbx_Username;
	
	/**Elemento de campo de texto senha. */
	@FindBy(id = "password")
	public WebElement txtbx_Password;
	
	/**Elemento de campo de texto para confirmar senha. */
	@FindBy(id = "confirmpassword")
	public WebElement txtbx_ConfirmPassword;
	
	/**Elemento de área de texto de comentários. */
	@FindBy(id = "Comments")
	public WebElement txtbx_Comments;
	
	/**Elemento de botão para voltar para aba 'Select Price Option'. */
	@FindBy(id = "prevselectpriceoption")
	public WebElement btn_Previous;
	
	/**Elemento de botão avançar para enviar e-mail. */
	@FindBy(id = "sendemail")
	public WebElement btn_Send;
	
	/**Construtor da classe. 
	 * @param driver Driver do navegador.
	 */
	public SendQuotePO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
