package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import builder.InsurantDataBuilder;
import builder.ProductDataBuilder;
import builder.SendQuoteBuilder;
import builder.VehicleDataBuilder;
import dataProvider.ConfigFileReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import managers.PageObjectManager;
import pages.InsurantDataPO;
import pages.PriceOptionPO;
import pages.ProductDataPO;
import pages.SendQuotePO;
import pages.VehicleDataPO;
import utils.MethodUtils;

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
	private VehicleDataBuilder vehicleDataBuilder;
	private ProductDataBuilder productDataBuilder;
	private SendQuoteBuilder sendQuoteBuilder;
	
	private int tempoMaximoEspera = FileReaderManager.getInstance().getConfigReader().getImplicitlyWait();
	
	@Given("^usuário está na página de aplicação de seguro de automóveis$")
	public void usuário_está_na_página_de_aplicação_de_seguro_de_automóveis() {
		configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		
		driver = new ChromeDriver();
		pageObjectManager = new PageObjectManager(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait()));
		
		driver.manage().window().maximize();
		
		driver.navigate().to(configFileReader.getApplicationUrl());
		
		utils = new MethodUtils();
		vehicleDataPO = pageObjectManager.getVehicleDataPO();
		
		utils.clicar(vehicleDataPO.menu_Automobile, driver, tempoMaximoEspera);
		
		utils.aguardarElementoPorTexto(vehicleDataPO.span_InsuranceType, driver, "Automobile Insurance", tempoMaximoEspera);
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
		
		vehicleDataPO = pageObjectManager.getVehicleDataPO();
		utils = new MethodUtils();
		
		vehicleDataBuilder = new VehicleDataBuilder(vehicleDataPO);
		
		vehicleDataBuilder
			.com_Make(make)
			.com_EnginePerformance(enginePerformance)
			.com_DateOfManufacture(dateOfManufacture)
			.com_NumberOfSeats(numberOfSeats)
			.com_FuelType(fuelType)
			.com_ListPrice(listPrice)
			.com_LicensePlateNumber(licensePlateNumber)
			.com_AnnualMileage(annualMileage)
			.preencher_VehicleData(driver, tempoMaximoEspera);
		
		utils.clicar(vehicleDataPO.btn_Next, driver, tempoMaximoEspera);
	}

	@And("^preencher o formulário na aba Enter Insurant Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Insurant_Data_e_pressionar_next() {
		
		insurantDataPO = pageObjectManager.getInsurantDataPO();
		
		String firstName = "Vinicius";
		String lastName = "Siqueira";
		String dateOfBirth = "04/08/1994";
		WebElement gender = insurantDataPO.rdbtn_Male;
		String streetAdress = "Rua Nicacio Salles";
		String country = "Brazil";
		String zipCode = "28635360";
		String city = "Nova Friburgo";
		String occupation = "Selfemployed";
		String[] hobbies = {"Speeding", "Other"};
		
		utils = new MethodUtils();
		
		insurantDataBuilder = new InsurantDataBuilder(insurantDataPO);
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
			.preencher_InsurantData(driver, tempoMaximoEspera);
		
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
		
		productDataPO = pageObjectManager.getProductDataPO();
		
		utils = new MethodUtils();
		
		productDataBuilder = new ProductDataBuilder(productDataPO);
		productDataBuilder
			.com_StartDate(startDate)
			.com_InsuranceSum(insuranceSum)
			.com_MeritRating(meritRating)
			.com_DamageInsurance(damageInsurance)
			.com_OptionalProducts(productDataPO.chkbox_OptionalProducts, optionalProducts)
			.com_CourtesyCar(courtesyCar)
			.preencher_ProductData(driver, tempoMaximoEspera);
		
		utils.clicar(productDataPO.btn_Next, driver, tempoMaximoEspera);
	}

	@And("^preencher o formulário na aba Select Price Option e pressionar next$")
	public void preencher_o_formulário_na_aba_Select_Price_Option_e_pressionar_next() {
		
		priceOptionPO = pageObjectManager.getPriceOptionPO();
		
		utils = new MethodUtils();
		
		utils.clicar(priceOptionPO.rdbtn_Platinum, driver, tempoMaximoEspera);
		
		utils.aguardarElementoFicarVisivel(priceOptionPO.btn_Next, driver, tempoMaximoEspera);
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
		
		sendQuotePO = pageObjectManager.getSendQuotePO();
		
		utils = new MethodUtils();
		
		sendQuoteBuilder = new SendQuoteBuilder(sendQuotePO);
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
		
		utils = new MethodUtils();
		
		utils.aguardarElementoFicarVisivel(sendQuotePO.Alert, driver, tempoMaximoEspera);
		Assert.assertEquals(successMessage, utils.obterTexto(sendQuotePO.txt_AlertTitle));
		
		utils.clicar(sendQuotePO.btn_Ok, driver, tempoMaximoEspera);
	}
	
}
