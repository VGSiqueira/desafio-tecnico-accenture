package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InsurantDataPO;
import pages.PriceOptionPO;
import pages.ProductDataPO;
import pages.SendQuotePO;
import pages.VehicleDataPO;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class SegurosAutomoveisSteps {

	private WebDriver driver;
	private VehicleDataPO vehicleDataPO;
	private InsurantDataPO insurantDataPO;
	private ProductDataPO productDataPO;
	private PriceOptionPO priceOptionPO;
	private SendQuotePO sendQuotePO;
	
	@Given("^usuário está na página de aplicação de seguro de automóveis$")
	public void usuário_está_na_página_de_aplicação_de_seguro_de_automóveis() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver-105.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
	}

	@When("^preencher o formulário na aba Enter Vehicle Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Vehicle_Data_e_pressionar_next() {
	}

	@And("^preencher o formulário na aba Enter Insurant Data e pressionar next$")
	public void preencher_o_formulário_na_aba_Enter_Insurant_Data_e_pressionar_next() {
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
