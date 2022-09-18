package builder;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.InsurantDataPO;
import utils.MethodUtils;

public class InsurantDataBuilder {

	/**Instância de InsurantDataPO. */
	private InsurantDataPO insurantDataPO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;
	
	private String firstName = "";
	
	private String lastName = "";
	
	private String dateOfBirth = "";
	
	private WebElement gender;
	
	private String streetAdress = "";
	
	private String country = "";
	
	private String zipCode = "";
	
	private String city = "";
	
	private String occupation = "";
	
	private List<WebElement> listaHobbies;
	
	private String[] hobbies;
	
	private String website = "";
	
	private String picture = "";
	
	public InsurantDataBuilder(InsurantDataPO insurantDataPO) {
		
		this.insurantDataPO = insurantDataPO;
	}
	
	public InsurantDataBuilder com_FirstName(String firstName) {
		
		this.firstName = firstName;
		return this;
	}
	
	public InsurantDataBuilder com_LastName(String lastName) {
		
		this.lastName = lastName;
		return this;
	}
	
	public InsurantDataBuilder com_DateOfBirth(String dateOfBirth) {
		
		this.dateOfBirth = dateOfBirth;
		return this;
	}
	
	public InsurantDataBuilder com_Gender(WebElement gender) {
		
		this.gender = gender;
		return this;
	}
	
	public InsurantDataBuilder com_StreetAdress(String streetAdress) {
		
		this.streetAdress = streetAdress;
		return this;
	}
	
	public InsurantDataBuilder com_Country(String country) {
		
		this.country = country;
		return this;
	}
	
	public InsurantDataBuilder com_ZipCode(String zipCode) {
		
		this.zipCode = zipCode;
		return this;
	}
	
	public InsurantDataBuilder com_City(String city) {
		
		this.city = city;
		return this;
	}
	
	public InsurantDataBuilder com_Occupation(String occupation) {
		
		this.occupation = occupation;
		return this;
	}
	
	public InsurantDataBuilder com_Hobbies(List<WebElement> listaHobbies, String hobbies[]) {
		
		this.listaHobbies = listaHobbies;
		this.hobbies = hobbies;
		return this;
	}
	
	public InsurantDataBuilder com_Website(String website) {
		
		this.website = website;
		return this;
	}
	
	public InsurantDataBuilder com_Picture(String picture) {
		
		this.picture = picture;
		return this;
	}
	
	public void preencher_InsurantData(WebDriver driver, int tempoMaximoEspera) {
		
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
