package stepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import builder.InsurantDataBuilder;
import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import pages.InsurantDataPO;
import pages.PriceOptionPO;
import pages.ProductDataPO;
import pages.SendQuotePO;
import pages.VehicleDataPO;
import utils.MethodUtils;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class SegurosAutomoveisSteps  {

	private WebDriver driver;
	
	private VehicleDataPO vehicleDataPO;
	private InsurantDataPO insurantDataPO;
	private ProductDataPO productDataPO;
	private PriceOptionPO priceOptionPO;
	private SendQuotePO sendQuotePO;
	
	private MethodUtils utils;
	private PageObjectManager pageObjectManager;
	private ConfigFileReader configFileReader;
	
	private InsurantDataBuilder insurantDataBuilder;
	
	@Given("^usuário está na página de aplicação de seguro de automóveis$")
	public void usuário_está_na_página_de_aplicação_de_seguro_de_automóveis() {
		configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		
		driver = new ChromeDriver();
		pageObjectManager = new PageObjectManager(driver);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configFileReader.getImplicitlyWait()));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(configFileReader.getImplicitlyWait()));
		
		driver.manage().window().maximize();
		
		driver.navigate().to(configFileReader.getApplicationUrl());
	}

	@When("^preencher o formulário na aba Enter Vehicle Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Vehicle_Data_e_pressionar_next() {
		
		vehicleDataPO = pageObjectManager.getVehicleDataPO();
		
		utils = new MethodUtils();
		utils.clicar(vehicleDataPO.btn_Next, driver, 10);
	}

	@And("^preencher o formulário na aba Enter Insurant Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Insurant_Data_e_pressionar_next() {
		
		String[] hobbies = {"Speeding", "Other"};
		
		insurantDataPO = pageObjectManager.getInsurantDataPO();
		utils = new MethodUtils();
		
		insurantDataBuilder = new InsurantDataBuilder(insurantDataPO);
		insurantDataBuilder
			.com_FirstName("Vinicius")
			.com_LastName("Siqueira")
			.com_DateOfBirth("04/08/1994")
			.com_Gender(insurantDataPO.rdbtn_Male)
			.com_StreetAdress("Rua Nicacio Salles")
			.com_Country("Brazil")
			.com_ZipCode("28635360")
			.com_City("Nova Friburgo")
			.com_Occupation("Selfemployed")
			.com_Hobbies(insurantDataPO.chkbox_hobbies, hobbies)
			.preencher_InsurantData(driver, 10);
		
		utils.clicar(insurantDataPO.btn_Next, driver, 10);
	}

	@And("^preencher o formulário na aba Enter Product Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Product_Data_e_pressionar_next() {
	}

	@And("^preencher o formulário na aba Select Price Option e pressionar nextt$")
	public void preencher_o_formulário_na_aba_Select_Price_Option_e_pressionar_nextt() {
	}

	@And("^preencher o formulário na aba Send Quote tab e pressionar next$")
	public void preencher_o_formulário_na_aba_Send_Quote_tab_e_pressionar_next() {
	}

	@Then("^verificar a mensagem Sending e-mail success! na tela$")
	public void verificar_a_mensagem_Sending_e_mail_success_na_tela() {
	}
	
}
