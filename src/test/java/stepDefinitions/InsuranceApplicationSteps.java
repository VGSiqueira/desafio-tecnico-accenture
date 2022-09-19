package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import builder.InsurantDataBuilder;
import builder.ProductDataBuilder;
import builder.SendQuoteBuilder;
import builder.VehicleDataBuilder;
import dataProvider.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.BuilderManager;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.UtilsManager;
import managers.WebDriverManager;
import pages.InsurantDataPO;
import pages.PriceOptionPO;
import pages.ProductDataPO;
import pages.SendQuotePO;
import pages.VehicleDataPO;
import utils.MethodUtils;

public class InsuranceApplicationSteps {

	private WebDriver driver;
	
	private VehicleDataPO vehicleDataPO;
	private InsurantDataPO insurantDataPO;
	private ProductDataPO productDataPO;
	private PriceOptionPO priceOptionPO;
	private SendQuotePO sendQuotePO;
	
	private MethodUtils utils;
	
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	private BuilderManager builderManager;
	private ConfigFileReader configFileReader;
	private UtilsManager utilsManager;
	
	private InsurantDataBuilder insurantDataBuilder;
	private VehicleDataBuilder vehicleDataBuilder;
	private ProductDataBuilder productDataBuilder;
	private SendQuoteBuilder sendQuoteBuilder;
	
	private int tempoMaximoEspera = FileReaderManager.getInstance().getConfigReader().getImplicitlyWait();
	private String counter = "0";
	
	@Before
	public void BeforeSteps() {
		
		webDriverManager = new WebDriverManager(driver);
		
		configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		
		driver = webDriverManager.getWebDriver();
		pageObjectManager = new PageObjectManager(driver);
		builderManager = new BuilderManager(pageObjectManager);
		utilsManager = new UtilsManager();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
		
		driver.manage().window().maximize();
		
		driver.get(configFileReader.getApplicationUrl());
		
		vehicleDataPO = pageObjectManager.getVehicleDataPO();
		insurantDataPO = pageObjectManager.getInsurantDataPO();
		productDataPO = pageObjectManager.getProductDataPO();
		sendQuotePO = pageObjectManager.getSendQuotePO();
		
		vehicleDataBuilder = builderManager.getVehicleDataBuilder();
		insurantDataBuilder = builderManager.getInsurantDataBuilder();
		productDataBuilder = builderManager.getProductDataBuilder();
		sendQuoteBuilder = builderManager.getSendQuoteBuilder();
		
		utils = utilsManager.getUtils();
	}
	
	@After
	public void AfterSteps() {
		
		webDriverManager.closeDriver();
	}
	
	@Given("^usuário está na página de aplicação de seguro de automóveis$")
	public void usuário_está_na_página_de_aplicação_de_seguro_de_automóveis() {
		
		String page = "Automobile Insurance";
		
		utils.clicar(vehicleDataPO.menu_Automobile, driver, tempoMaximoEspera);
		utils.aguardarElementoPorTexto(vehicleDataPO.span_InsuranceType, driver, page, tempoMaximoEspera);
	}

	@When("^preencher o formulário na aba Enter Vehicle Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Vehicle_Data_e_pressionar_next() {
		
		String make = "Ford";
		String enginePerformance = "3";
		String dateOfManufacture = "08/02/2012";
		String numberOfSeats = "5";
		String fuelType = "Gas";
		String listPrice = "1000";
		String licensePlateNumber = "123456";
		String annualMileage = "1500";
		
		vehicleDataBuilder
			.com_Make(make)
			.com_EnginePerformance(enginePerformance)
			.com_DateOfManufacture(dateOfManufacture)
			.com_NumberOfSeats(numberOfSeats)
			.com_FuelType(fuelType)
			.com_ListPrice(listPrice)
			.com_LicensePlateNumber(licensePlateNumber)
			.com_AnnualMileage(annualMileage)
			.preencher_VehicleDataAutomobile(driver, tempoMaximoEspera);
		
		utils.aguardarElementoPorTexto(vehicleDataPO.span_VehicleDataCounter, driver, counter, tempoMaximoEspera);
		utils.clicar(vehicleDataPO.btn_Next, driver, tempoMaximoEspera);
	}

	@And("^preencher o formulário na aba Enter Insurant Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Insurant_Data_e_pressionar_next() {
		
		String firstName = "Vinicius";
		String lastName = "Siqueira";
		String dateOfBirth = "04/08/1994";
		String streetAdress = "Rua Nicacio Salles";
		String country = "Brazil";
		String zipCode = "28635360";
		String city = "Nova Friburgo";
		String occupation = "Selfemployed";
		String[] hobbies = {"Speeding", "Other"};
		WebElement gender = insurantDataPO.rdbtn_Male;	

		insurantDataBuilder
			.com_FirstName(firstName)
			.com_LastName(lastName)
			.com_DateOfBirth(dateOfBirth)
			.com_Gender(gender)
			.com_StreetAdress(streetAdress)
			.com_Country(country)
			.com_ZipCode(zipCode)
			.com_City(city)
			.com_Occupation(occupation)
			.com_Hobbies(insurantDataPO.chkbox_hobbies, hobbies)
			.preencher_InsurantDataAutomobile(driver, tempoMaximoEspera);
		
		utils.aguardarElementoPorTexto(insurantDataPO.span_InsurantDataCounter, driver, counter, tempoMaximoEspera);
		utils.clicar(insurantDataPO.btn_Next, driver, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait());
	}

	@And("^preencher o formulário na aba Enter Product Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Product_Data_e_pressionar_next() {
		
		String startDate = "08/30/2023";
		String insuranceSum = "15.000.000,00";
		String meritRating = "Bonus 9";
		String damageInsurance = "Full Coverage";
		String[] optionalProducts = {"Euro Protection","Legal Defense Insurance"};
		String courtesyCar = "Yes";
		
		productDataBuilder
			.com_StartDate(startDate)
			.com_InsuranceSum(insuranceSum)
			.com_MeritRating(meritRating)
			.com_DamageInsurance(damageInsurance)
			.com_OptionalProducts(productDataPO.chkbox_OptionalProducts, optionalProducts)
			.com_CourtesyCar(courtesyCar)
			.preencher_ProductDataAutomobile(driver, tempoMaximoEspera);
		
		utils.aguardarElementoPorTexto(productDataPO.span_ProductDataCounter, driver, counter, tempoMaximoEspera);
		utils.clicar(productDataPO.btn_Next, driver, tempoMaximoEspera);
	}

	@And("^preencher o formulário na aba Select Price Option e pressionar next$")
	public void preencher_o_formulário_na_aba_Select_Price_Option_e_pressionar_next() {
		
		priceOptionPO = pageObjectManager.getPriceOptionPO();
		
		utils.clicar(priceOptionPO.rdbtn_Platinum, driver, tempoMaximoEspera);
		
		utils.aguardarElementoFicarVisivel(priceOptionPO.btn_Next, driver, tempoMaximoEspera);
		utils.aguardarElementoPorTexto(priceOptionPO.span_PriceOptionCounter, driver, counter, tempoMaximoEspera);
		utils.clicar(priceOptionPO.btn_Next, driver, tempoMaximoEspera);
	}

	@And("^preencher o formulário na aba Send Quote tab e pressionar send$")
	public void preencher_o_formulário_na_aba_Send_Quote_tab_e_pressionar_send() {
		
		String email = "vgsiqueira94@gmail.com";
		String phone = "5522999529004";
		String username = "vgsiq";
		String password = "123456As";
		String confirmPassword = "123456As";
		String comments = "Comentário de teste.";
		
		sendQuoteBuilder
			.com_Email(email)
			.com_Phone(phone)
			.com_Username(username)
			.com_Password(password)
			.com_ConfirmPassword(confirmPassword)
			.com_Comments(comments)
			.preencher_SendQuote(driver, tempoMaximoEspera);
		
		utils.clicar(sendQuotePO.btn_Send, driver, tempoMaximoEspera);
	}

	@Then("^verificar a mensagem Sending e-mail success! na tela$")
	public void verificar_a_mensagem_Sending_e_mail_success_na_tela() {
		
		String successMessage = "Sending e-mail success!";
		
		utils.aguardarElementoFicarVisivel(sendQuotePO.Alert, driver, tempoMaximoEspera);
		Assert.assertEquals(successMessage, utils.obterTexto(sendQuotePO.txt_AlertTitle));
		
		utils.aguardarElementoPorTexto(sendQuotePO.span_SendQuoteCounter, driver, counter, tempoMaximoEspera);
		utils.clicar(sendQuotePO.btn_Ok, driver, tempoMaximoEspera);
	}
	
}
