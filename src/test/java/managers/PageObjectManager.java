package managers;

import org.openqa.selenium.WebDriver;

import pages.InsurantDataPO;
import pages.PriceOptionPO;
import pages.ProductDataPO;
import pages.SendQuotePO;
import pages.VehicleDataPO;

public class PageObjectManager {

	private WebDriver driver;
	
	private InsurantDataPO insurantDataPO;
	
	private PriceOptionPO priceOptionPO;
	
	private ProductDataPO productDataPO;
	
	private SendQuotePO sendQuotePO;
	
	private VehicleDataPO vehicleDataPO;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public InsurantDataPO getInsurantDataPO() {
		
		return (insurantDataPO == null) ? insurantDataPO = new InsurantDataPO(driver) : insurantDataPO;
	}

	public PriceOptionPO getPriceOptionPO() {
		
		return (priceOptionPO == null) ? priceOptionPO = new PriceOptionPO(driver) : priceOptionPO;
	}

	public ProductDataPO getProductDataPO() {
		
		return (productDataPO == null) ? productDataPO = new ProductDataPO(driver) : productDataPO;
	}

	public SendQuotePO getSendQuotePO() {
		
		return (sendQuotePO == null) ? sendQuotePO = new SendQuotePO(driver) : sendQuotePO;
	}

	public VehicleDataPO getVehicleDataPO() {
		
		return (vehicleDataPO == null) ? vehicleDataPO = new VehicleDataPO(driver) : vehicleDataPO;
	}
	
	
}
