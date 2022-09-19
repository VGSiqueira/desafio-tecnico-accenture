package builder;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.ProductDataPO;
import utils.MethodUtils;

/**Classe builder para Product Data. */
public class ProductDataBuilder {

	/**Instância de VehicleDataPO. */
	private ProductDataPO productDataPO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;
	
	/**Input da data de início do produto. */
	private String startDate = "";
	
	/**Input da soma do seguro. */
	private String insuranceSum = "";
	
	/**Input de classificação de mérito. */
	private String meritRating = "";
	
	/**Input de seguros de danos. */
	private String damageInsurance = "";
	
	/**Lista de elementos de produtos opcionais. */
	private List<WebElement> listaOptionalProducts;
	
	/**Lista de produtos opcionais. */
	private String[] optionalProducts;
	
	/**Input de carro de cortesia. */
	private String courtesyCar = "";
	
    /**
     * Construtor da classe.
     * @param productDataPO Instância de ProductDataPO para criação de objeto do tipo ProductDataPO. 
    */
	public ProductDataBuilder(ProductDataPO productDataPO) {
		
		this.productDataPO = productDataPO;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo startDate.
	 * @param startDate Valor String como parâmetro do elemento txtbx_StartDate.
	 * @return Retorna a própria classe.
	 */
	public ProductDataBuilder com_StartDate(String startDate) {
		
		this.startDate = startDate;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo insuranceSum.
	 * @param insuranceSum Valor String como parâmetro do elemento drpdwn_InsuranceSum.
	 * @return Retorna a própria classe.
	 */
	public ProductDataBuilder com_InsuranceSum(String insuranceSum) {
		
		this.insuranceSum = insuranceSum;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo meritRating.
	 * @param meritRating Valor String como parâmetro do elemento drpdwn_MeritRating.
	 * @return Retorna a própria classe.
	 */
	public ProductDataBuilder com_MeritRating(String meritRating) {
		
		this.meritRating = meritRating;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo damageInsurance.
	 * @param damageInsurance Valor String como parâmetro do elemento drpdwn_DamageInsurance.
	 * @return Retorna a própria classe.
	 */
	public ProductDataBuilder com_DamageInsurance(String damageInsurance) {
		
		this.damageInsurance = damageInsurance;
		return this;
	}
	
	/**
	 * Builder responsável por receber os valores dos atributos de listaOptionalProducts e optionalProducts.
	 * @param listaOptionalProducts Lista de elementos usada para pesquisar determinado optionalProduct.
	 * @param optionalProducts Array de optionalProducts como parâmetro para selecionar.
	 * @return Retorna a própria classe.
	 */
	public ProductDataBuilder com_OptionalProducts(List<WebElement> listaOptionalProducts, String optionalProducts[]) {
		
		this.listaOptionalProducts = listaOptionalProducts;
		this.optionalProducts = optionalProducts;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo courtesyCar.
	 * @param courtesyCar Valor String como parâmetro do elemento drpdwn_CourtesyCar.
	 * @return Retorna a própria classe.
	 */
	public ProductDataBuilder com_CourtesyCar(String courtesyCar) {
		
		this.courtesyCar = courtesyCar;
		return this;
	}
	
	/**
	 * Método responsável por preencher o formulário de Product Data para 'Automobile'.
	 * @param driver Driver do navegador. 
	 * @param tempoMaximoEspera Tempo máximo de espera que o sistema irá aguardar até que o elemento esteja visível/pronto para determinada ação. 
	 */
	public void preencher_ProductDataAutomobile(WebDriver driver, int tempoMaximoEspera) {
		
		utils = new MethodUtils();
		
		utils.escreverCampoTexto(productDataPO.txtbx_StartDate, driver, startDate, tempoMaximoEspera);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_InsuranceSum, insuranceSum);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_MeritRating, meritRating);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_DamageInsurance, damageInsurance);
		utils.selecionarOpcoes(listaOptionalProducts, driver, optionalProducts, tempoMaximoEspera);
		utils.selecionarOpcaoDropDown(productDataPO.drpdwn_CourtesyCar, courtesyCar);
	}
}
