package builder;

import org.openqa.selenium.WebDriver;

import pages.SendQuotePO;
import utils.MethodUtils;

/**Classe builder para Send Quote. */
public class SendQuoteBuilder {
	
	/**Instância de SendQuotePO. */
	private SendQuotePO sendQuotePO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;

	/**Input de e-mail. */
	private String email = "";
	
	/**Input de telefone. */
	private String phone = "";
	
	/**Input de nome do usuário. */
	private String username = "";
	
	/**Input de senha. */
	private String password = "";
	
	/**Input de confirmação de senha. */
	private String confirmPassword = "";
	
	/**Input de comentários. */
	private String comments = "";
	
    /**
     * Construtor da classe.
     * @param sendQuotePO Instância de SendQuotePO para criação de objeto do tipo SendQuotePO. 
    */
	public SendQuoteBuilder(SendQuotePO sendQuotePO) {
		
		this.sendQuotePO = sendQuotePO;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo email.
	 * @param email Valor String como parâmetro do elemento txtbx_Email.
	 * @return Retorna a própria classe.
	 */
	public SendQuoteBuilder com_Email(String email) {
		
		this.email = email;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo phone.
	 * @param phone Valor String como parâmetro do elemento txtbx_Phone.
	 * @return Retorna a própria classe.
	 */
	public SendQuoteBuilder com_Phone(String phone) {
		
		this.phone = phone;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo username.
	 * @param username Valor String como parâmetro do elemento txtbx_Username.
	 * @return Retorna a própria classe.
	 */
	public SendQuoteBuilder com_Username(String username) {
		
		this.username = username;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo password.
	 * @param password Valor String como parâmetro do elemento txtbx_Password.
	 * @return Retorna a própria classe.
	 */
	public SendQuoteBuilder com_Password(String password) {
		
		this.password = password;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo confirmPassword.
	 * @param confirmPassword Valor String como parâmetro do elemento txtbx_ConfirmPassword.
	 * @return Retorna a própria classe.
	 */
	public SendQuoteBuilder com_ConfirmPassword(String confirmPassword) {
		
		this.confirmPassword = confirmPassword;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo comments.
	 * @param comments Valor String como parâmetro do elemento txtbx_Comments.
	 * @return Retorna a própria classe.
	 */
	public SendQuoteBuilder com_Comments(String comments) {
		
		this.comments = comments;
		return this;
	}
	
	/**
	 * Método responsável por preencher o formulário de Send Quote.
	 * @param driver Driver do navegador. 
	 * @param tempoMaximoEspera Tempo máximo de espera que o sistema irá aguardar até que o elemento esteja visível/pronto para determinada ação. 
	 */
	public void preencher_SendQuote(WebDriver driver, int tempoMaximoEspera) {
		
		utils = new MethodUtils();
		
		utils.escreverCampoTexto(sendQuotePO.txtbx_Email, driver, email, tempoMaximoEspera);
		utils.escreverCampoTexto(sendQuotePO.txtbx_Phone, driver, phone, tempoMaximoEspera);
		utils.escreverCampoTexto(sendQuotePO.txtbx_Username, driver, username, tempoMaximoEspera);
		utils.escreverCampoTexto(sendQuotePO.txtbx_Password, driver, password, tempoMaximoEspera);
		utils.escreverCampoTexto(sendQuotePO.txtbx_ConfirmPassword, driver, confirmPassword, tempoMaximoEspera);
		utils.escreverCampoTexto(sendQuotePO.txtbx_Comments, driver, comments, tempoMaximoEspera);
	}
}
