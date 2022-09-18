package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**Page object da aba 'Vehicle Data'. */
public class VehicleDataPO extends BasePO {

	/**Elemento de seletor da marca do veículo. */
	@FindBy(id = "make")
	public WebElement drpdwn_Make;
	
	/**Elemento de seletor de modelo do veículo. */
	@FindBy(id = "model")
	public WebElement drpdwn_Model;
	
	/**Elemento de campo de texto de capacidade de cilindrada do veículo. */
	@FindBy(id = "cylindercapacity")
	public WebElement txtbx_CylinderCapacity;
	
	/**Elemento de campo de texto de potência do veículo. */
	@FindBy(id = "engineperformance")
	public WebElement txtbx_EnginePerformance;
	
	/**Elemento de campo de texto de data de produção do veículo. */
	@FindBy(id = "dateofmanufacture")
	public WebElement txtbox_DateManufacture;
	
	/**Elemento de seletor do número de assentos. */
	@FindBy(id = "numberofseats")
	public WebElement drpdwn_NumberSeats;
	
	/**Elemento de seletor do tipo de combustível. */
	@FindBy(id = "fuel")
	public WebElement drpdwn_FuelType;
	
	/**Elemento de campo de texto de preço listado do veículo. */
	@FindBy(id = "listprice")
	public WebElement txtbx_ListPrice;
	
	/**Elemento de campo de texto do número de licença da placa do veículo. */
	@FindBy(id = "licenseplatenumber")
	public WebElement txtbx_LicensePlateNumber;
	
	/**Elemento de campo de texto da milhagem anual do veículo. */
	@FindBy(id = "annualmileage")
	public WebElement txtbx_AnnualMileage;
	
	/**Elemento de botão avançar para a aba 'Enter Insurant Data'. */
	@FindBy(id = "nextenterinsurantdata")
	public WebElement btn_Next;
	
	/**Construtor da classe. 
	 * @param driver Driver do navegador.
	 */
	public VehicleDataPO(WebDriver driver) {
		super(driver);
	}
}
