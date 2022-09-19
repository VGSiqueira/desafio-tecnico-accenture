package managers;

import builder.InsurantDataBuilder;
import builder.ProductDataBuilder;
import builder.SendQuoteBuilder;
import builder.VehicleDataBuilder;
import pages.InsurantDataPO;
import pages.ProductDataPO;
import pages.SendQuotePO;
import pages.VehicleDataPO;

/**Classe do gerenciador de Builders. */
public class BuilderManager {

	/**Instância da classe InsurantDataBuilder. */
	private InsurantDataBuilder insurantDataBuilder;
	
	/**Instância da classe ProductDataBuilder. */
	private ProductDataBuilder productDataBuilder;
	
	/**Instância da classe SendQuoteBuilder. */
	private SendQuoteBuilder sendQuoteBuilder;
	
	/**Instância da classe VehicleDataBuilder. */
	private VehicleDataBuilder vehicleDataBuilder;
	
	/**Instância da classe InsurantDataPO. */
	private InsurantDataPO insurantDataPO;
	
	/**Instância da classe ProductDataPO. */
	private ProductDataPO productDataPO;
	
	/**Instância da classe SendQuotePO. */
	private SendQuotePO sendQuotePO;
	
	/**Instância da classe VehicleDataPO. */
	private VehicleDataPO vehicleDataPO;
	
	/**Instância da classe PageObjectManager. */
	private PageObjectManager pageObjectManager;
	
	/**
	 * Builder da classe.
	 */
	public BuilderManager(PageObjectManager pageObjectManager) {
		
		this.pageObjectManager = pageObjectManager;
	}
	
	/**
	 * Método responsável por obter a instância de InsurantDataBuilder.
	 * @return Retorna a classe InsurantDataBuilder.
	 */
	public InsurantDataBuilder getInsurantDataBuilder() {
		
		insurantDataPO = pageObjectManager.getInsurantDataPO();
		
		return (insurantDataBuilder == null) ? insurantDataBuilder = new InsurantDataBuilder(insurantDataPO) : insurantDataBuilder;
	}

	/**
	 * Método responsável por obter a instância de ProductDataBuilder.
	 * @return Retorna a classe ProductDataBuilder.
	 */
	public ProductDataBuilder getProductDataBuilder() {
		
		productDataPO = pageObjectManager.getProductDataPO();
		
		return (productDataBuilder == null) ? productDataBuilder = new ProductDataBuilder(productDataPO) : productDataBuilder;
	}

	/**
	 * Método responsável por obter a instância de SendQuoteBuilder.
	 * @return Retorna a classe SendQuoteBuilder.
	 */
	public SendQuoteBuilder getSendQuoteBuilder() {
		
		sendQuotePO = pageObjectManager.getSendQuotePO();
		
		return (sendQuoteBuilder == null) ? sendQuoteBuilder = new SendQuoteBuilder(sendQuotePO) : sendQuoteBuilder;
	}

	/**
	 * Método responsável por obter a instância de VehicleDataBuilder.
	 * @return Retorna a classe VehicleDataBuilder.
	 */
	public VehicleDataBuilder getVehicleDataBuilder() {
		
		vehicleDataPO = pageObjectManager.getVehicleDataPO();
		
		return (vehicleDataBuilder == null) ? vehicleDataBuilder = new VehicleDataBuilder(vehicleDataPO) : vehicleDataBuilder;
	}
	
}
