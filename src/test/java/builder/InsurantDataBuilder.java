package builder;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.InsurantDataPO;
import utils.MethodUtils;

/**Classe builder para Insurant Data. */
public class InsurantDataBuilder {

	/**Instância de InsurantDataPO. */
	private InsurantDataPO insurantDataPO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;
	
	/**Input de primeiro nome.*/
	private String firstName = "";
	
	/**Input de último nome. */
	private String lastName = "";
	
	/**Input de data de nascimento. */
	private String dateOfBirth = "";
	
	/**Elemento de gênero. */
	private WebElement gender;
	
	/**Input de endereço. */
	private String streetAdress = "";
	
	/**Input de país. */
	private String country = "";
	
	/**Input de código postal. */
	private String zipCode = "";
	
	/**Input de cidade. */
	private String city = "";
	
	/**Input de ocupação. */
	private String occupation = "";
	
	/**Lista de elementos de hobbies. */
	private List<WebElement> listaHobbies;
	
	/**Lista de hobbies. */
	private String[] hobbies;
	
	/**Input de website. */
	private String website = "";
	
	/**Input de diretório da foto. */
	private String picture = "";
	
    /**
     * Construtor da classe.
     * @param insurantDataPO Instância de InsurantDataPO para criação de objeto do tipo InsurantDataPO. 
    */
	public InsurantDataBuilder(InsurantDataPO insurantDataPO) {
		
		this.insurantDataPO = insurantDataPO;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo firstName.
	 * @param firstName Valor String como parâmetro do elemento txtbx_FirstName.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_FirstName(String firstName) {
		
		this.firstName = firstName;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo lastName.
	 * @param lastName Valor String como parâmetro do elemento txtbx_LastName.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_LastName(String lastName) {
		
		this.lastName = lastName;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo dateOfBirth.
	 * @param dateOfBirth Valor String como parâmetro do elemento txtbx_DateBirth.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_DateOfBirth(String dateOfBirth) {
		
		this.dateOfBirth = dateOfBirth;
		return this;
	}
	
	/**
	 * Builder responsável por receber o elemento do atributo gender.
	 * @param gender Elemento como parâmetro do elemento rdbtn_Male ou rdbtn_Female.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_Gender(WebElement gender) {
		
		this.gender = gender;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo streetAdress.
	 * @param streetAdress Valor String como parâmetro do elemento txtbx_StreetAdress.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_StreetAdress(String streetAdress) {
		
		this.streetAdress = streetAdress;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo country.
	 * @param country Valor String como parâmetro do elemento drpdwn_Country.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_Country(String country) {
		
		this.country = country;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo zipCode.
	 * @param zipCode Valor String como parâmetro do elemento txtbx_ZipCode.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_ZipCode(String zipCode) {
		
		this.zipCode = zipCode;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo city.
	 * @param city Valor String como parâmetro do elemento txtbx_City.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_City(String city) {
		
		this.city = city;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo occupation.
	 * @param occupation Valor String como parâmetro do elemento drpdwn_Occupation.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_Occupation(String occupation) {
		
		this.occupation = occupation;
		return this;
	}
	
	/**
	 * Builder responsável por receber os valores dos atributos de listaHobbies e hobbies.
	 * @param listaHobbies Lista de elementos usada para pesquisar determinado hobbie.
	 * @param hobbies Array de hobbies como parâmetro para selecionar.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_Hobbies(List<WebElement> listaHobbies, String hobbies[]) {
		
		this.listaHobbies = listaHobbies;
		this.hobbies = hobbies;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo website.
	 * @param website Valor String como parâmetro do elemento txtbx_Website.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_Website(String website) {
		
		this.website = website;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo picture.
	 * @param picture Valor String como parâmetro do elemento txtbx_Picture.
	 * @return Retorna a própria classe.
	 */
	public InsurantDataBuilder com_Picture(String picture) {
		
		this.picture = picture;
		return this;
	}
	
	/**
	 * Método responsável por preencher o formulário de Insurant Data para 'Automobile'.
	 * @param driver Driver do navegador. 
	 * @param tempoMaximoEspera Tempo máximo de espera que o sistema irá aguardar até que o elemento esteja visível/pronto para determinada ação. 
	 */
	public void preencher_InsurantDataAutomobile(WebDriver driver, int tempoMaximoEspera) {
		
		utils = new MethodUtils();
		
		utils.escreverCampoTexto(insurantDataPO.txtbx_FirstName, driver, firstName, tempoMaximoEspera);
		utils.escreverCampoTexto(insurantDataPO.txtbx_LastName, driver, lastName, tempoMaximoEspera);
		utils.escreverCampoTexto(insurantDataPO.txtbx_DateBirth, driver, dateOfBirth, tempoMaximoEspera);
		utils.clicar(gender, driver, tempoMaximoEspera);
		utils.escreverCampoTexto(insurantDataPO.txtbx_StreetAdress, driver, streetAdress, tempoMaximoEspera);
		utils.selecionarOpcaoDropDown(insurantDataPO.drpdwn_Country, country);
		utils.escreverCampoTexto(insurantDataPO.txtbx_ZipCode, driver, zipCode, tempoMaximoEspera);
		utils.escreverCampoTexto(insurantDataPO.txtbx_City, driver, city, tempoMaximoEspera);
		utils.selecionarOpcaoDropDown(insurantDataPO.drpdwn_Occupation, occupation);
		utils.selecionarOpcoes(listaHobbies, driver, hobbies, tempoMaximoEspera);
		utils.escreverCampoTexto(insurantDataPO.txtbx_Website, driver, website, tempoMaximoEspera);
		utils.escreverCampoTexto(insurantDataPO.txtbx_Picture, driver, picture, tempoMaximoEspera);
	}

	
	
}
