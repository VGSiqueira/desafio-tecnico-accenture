package managers;

import org.openqa.selenium.WebDriver;

import pages.InsurantDataPO;
import pages.PriceOptionPO;
import pages.ProductDataPO;
import pages.SendQuotePO;
import pages.VehicleDataPO;

/**Classe do gerenciador de Page Objects. */
public class PageObjectManager {

	/**Instância do driver do navegador. */
	private WebDriver driver;
	
	/**Instância da classe InsurantDataPO. */
	private InsurantDataPO insurantDataPO;
	
	/**Instância da classe PriceOptionPO. */
	private PriceOptionPO priceOptionPO;
	
	/**Instância da classe ProductDataPO. */
	private ProductDataPO productDataPO;
	
	/**Instância da classe SendQuotePO. */
	private SendQuotePO sendQuotePO;
	
	/**Instância da classe VehicleDataPO. */
	private VehicleDataPO vehicleDataPO;
	
	/**
	 * Construtor da classe. 
	 * @driver Driver do navegador.
	 */
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	/**
	 * Método responsável por obter a instância de InsurantDataPO.
	 * @return Retorna a classe InsurantDataPO.
	 */
	public InsurantDataPO getInsurantDataPO() {
		
		return (insurantDataPO == null) ? insurantDataPO = new InsurantDataPO(driver) : insurantDataPO;
	}

	/**
	 * Método responsável por obter a instância de PriceOptionPO.
	 * @return Retorna a classe PriceOptionPO.
	 */
	public PriceOptionPO getPriceOptionPO() {
		
		return (priceOptionPO == null) ? priceOptionPO = new PriceOptionPO(driver) : priceOptionPO;
	}

	/**
	 * Método responsável por obter a instância de ProductDataPO.
	 * @return Retorna a classe ProductDataPO.
	 */
	public ProductDataPO getProductDataPO() {
		
		return (productDataPO == null) ? productDataPO = new ProductDataPO(driver) : productDataPO;
	}

	/**
	 * Método responsável por obter a instância de SendQuotePO.
	 * @return Retorna a classe SendQuotePO.
	 */
	public SendQuotePO getSendQuotePO() {
		
		return (sendQuotePO == null) ? sendQuotePO = new SendQuotePO(driver) : sendQuotePO;
	}

	/**
	 * Método responsável por obter a instância de VehicleDataPO.
	 * @return Retorna a classe VehicleDataPO.
	 */
	public VehicleDataPO getVehicleDataPO() {
		
		return (vehicleDataPO == null) ? vehicleDataPO = new VehicleDataPO(driver) : vehicleDataPO;
	}
	
	
}
