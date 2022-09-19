package builder;

import org.openqa.selenium.WebDriver;

import pages.VehicleDataPO;
import utils.MethodUtils;

/**Classe builder para Vehicle Data. */
public class VehicleDataBuilder {

	/**Instância de VehicleDataPO. */
	private VehicleDataPO vehicleDataPO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;
	
	/**Input de fabricante.*/
	private String make;
	
	/**Input de performance do motor. */
	private String enginePerformance;
	
	/**Input de data de fabricação. */
	private String dateOfManufacture;
	
	/**Input de número de assentos. */
	private String numberOfSeats;
	
	/**Input de tipo de combustível. */
	private String fuelType;
	
	/**Input de preço listado. */
	private String listPrice;
	
	/**Input de número da licença da placa. */
	private String licensePlateNumber;
	
	/**Input de milhagem anual. */
	private String annualMileage;
	
    /**
     * Construtor da classe.
     * @param vehicleDataPO Instância de VehicleDataPO para criação de objeto do tipo VehicleDataPO. 
    */
	public VehicleDataBuilder(VehicleDataPO vehicleDataPO) {
		
		this.vehicleDataPO = vehicleDataPO;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo make.
	 * @param make Valor String como parâmetro do elemento drpdwn_Make.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_Make(String make) {
		
		this.make = make;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo enginePerformance.
	 * @param enginePerformance Valor String como parâmetro do elemento txtbx_EnginePerformance.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_EnginePerformance(String enginePerformance) {
		
		this.enginePerformance = enginePerformance;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo dateOfManufacture.
	 * @param dateOfManufacture Valor String como parâmetro do elemento txtbx_DateManufacture.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_DateOfManufacture(String dateOfManufacture) {
		
		this.dateOfManufacture = dateOfManufacture;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo numberOfSeats.
	 * @param numberOfSeats Valor String como parâmetro do elemento drpdwn_NumberSeats.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_NumberOfSeats(String numberOfSeats) {
		
		this.numberOfSeats = numberOfSeats;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo fuelType.
	 * @param fuelType Valor String como parâmetro do elemento drpdwn_FuelTypes.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_FuelType(String fuelType) {
		
		this.fuelType = fuelType;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo listPrice.
	 * @param listPrice Valor String como parâmetro do elemento drpdwn_listPrice.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_ListPrice(String listPrice) {
		
		this.listPrice = listPrice;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo licensePlateNumber.
	 * @param licensePlateNumber Valor String como parâmetro do elemento txtbx_LicensePlateNumber.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_LicensePlateNumber(String licensePlateNumber) {
		
		this.licensePlateNumber = licensePlateNumber;
		return this;
	}
	
	/**
	 * Builder responsável por receber o valor do atributo annualMileage.
	 * @param annualMileage Valor String como parâmetro do elemento txtbx_AnnualMileage.
	 * @return Retorna a própria classe.
	 */
	public VehicleDataBuilder com_AnnualMileage(String annualMileage) {
		
		this.annualMileage = annualMileage;
		return this;
	}
	
	/**
	 * Método responsável por preencher o formulário de Vehicle Data para 'Automobile'.
	 * @param driver Driver do navegador. 
	 * @param tempoMaximoEspera Tempo máximo de espera que o sistema irá aguardar até que o elemento esteja visível/pronto para determinada ação. 
	 */
	public void preencher_VehicleDataAutomobile(WebDriver driver, int tempoMaximoEspera) {
		
		utils = new MethodUtils();
		
		utils.selecionarOpcaoDropDown(vehicleDataPO.drpdwn_Make, make);
		utils.escreverCampoTexto(vehicleDataPO.txtbx_EnginePerformance, driver, enginePerformance, tempoMaximoEspera);
		utils.escreverCampoTexto(vehicleDataPO.txtbox_DateManufacture, driver, dateOfManufacture, tempoMaximoEspera);
		utils.selecionarOpcaoDropDown(vehicleDataPO.drpdwn_NumberSeats, numberOfSeats);
		utils.selecionarOpcaoDropDown(vehicleDataPO.drpdwn_FuelType, fuelType);
		utils.escreverCampoTexto(vehicleDataPO.txtbx_ListPrice, driver, listPrice, tempoMaximoEspera);
		utils.escreverCampoTexto(vehicleDataPO.txtbx_LicensePlateNumber, driver, licensePlateNumber, tempoMaximoEspera);
		utils.escreverCampoTexto(vehicleDataPO.txtbx_AnnualMileage, driver, annualMileage, tempoMaximoEspera);
	}

}
