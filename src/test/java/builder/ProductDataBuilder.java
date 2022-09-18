package builder;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.ProductDataPO;
import utils.MethodUtils;

public class ProductDataBuilder {

	/**Instância de VehicleDataPO. */
	private ProductDataPO productDataPO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;
	
	private String startDate = "";
	
	private String insuranceSum = "";
	
	private String meritRating = "";
	
	private String damageInsurance = "";
	
	private List<WebElement> listaOptionalProducts;
	
	private String[] optionalProducts;
	
	private String courtesyCar = "";
	
	public ProductDataBuilder(ProductDataPO productDataPO) {
		
		this.productDataPO = productDataPO;
	}
	
	public ProductDataBuilder com_StartDate(String startDate) {
		
		this.startDate = startDate;
		return this;
	}
	
	public ProductDataBuilder com_InsuranceSum(String insuranceSum) {
		
		this.insuranceSum = insuranceSum;
		return this;
	}
	
	public ProductDataBuilder com_MeritRating(String meritRating) {
		
		this.meritRating = meritRating;
		return this;
	}
	
	public ProductDataBuilder com_DamageInsurance(String damageInsurance) {
		
		this.damageInsurance = damageInsurance;
		return this;
	}
	
	public ProductDataBuilder com_OptionalProducts(List<WebElement> listaOptionalProducts, String optionalProducts[]) {
		
		this.listaOptionalProducts = listaOptionalProducts;
		this.optionalProducts = optionalProducts;
		return this;
	}
	
	public ProductDataBuilder com_CourtesyCar(String courtesyCar) {
		
		this.courtesyCar = courtesyCar;
		return this;
	}
	
	public void preencher_ProductData(WebDriver driver, int tempoMaximoEspera) {
		
		utils = new MethodUtils();
		
		utils.escreverCampoTexto(productDataPO.txtbx_StartDate, driver, startDate, tempoMaximoEspera);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_InsuranceSum, insuranceSum);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_MeritRating, meritRating);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_DamageInsurance, damageInsurance);
		utils.selecionarOpcoes(listaOptionalProducts, driver, optionalProducts, tempoMaximoEspera);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_CourtesyCar, courtesyCar);
	}
}
