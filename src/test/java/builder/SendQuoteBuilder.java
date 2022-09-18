package builder;

import org.openqa.selenium.WebDriver;

import pages.SendQuotePO;
import utils.MethodUtils;

public class SendQuoteBuilder {
	
	/**Instância de SendQuotePO. */
	private SendQuotePO sendQuotePO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;

	private String email = "";
	
	private String phone = "";
	
	private String username = "";
	
	private String password = "";
	
	private String confirmPassword = "";
	
	private String comments = "";
	
	public SendQuoteBuilder(SendQuotePO sendQuotePO) {
		
		this.sendQuotePO = sendQuotePO;
	}
	
	public SendQuoteBuilder com_Email(String email) {
		
		this.email = email;
		return this;
	}
	
	public SendQuoteBuilder com_Phone(String phone) {
		
		this.phone = phone;
		return this;
	}
	
	public SendQuoteBuilder com_Username(String username) {
		
		this.username = username;
		return this;
	}
	
	public SendQuoteBuilder com_Password(String password) {
		
		this.password = password;
		return this;
	}
	
	public SendQuoteBuilder com_ConfirmPassword(String confirmPassword) {
		
		this.confirmPassword = confirmPassword;
		return this;
	}
	
	public SendQuoteBuilder com_Comments(String comments) {
		
		this.comments = comments;
		return this;
	}
	
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
