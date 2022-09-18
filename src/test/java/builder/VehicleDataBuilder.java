package builder;

import org.openqa.selenium.WebDriver;

import pages.VehicleDataPO;
import utils.MethodUtils;

public class VehicleDataBuilder {

	/**Instância de VehicleDataPO. */
	private VehicleDataPO vehicleDataPO;
	
	/**Instância de MethodUtils. */
	private MethodUtils utils;
	
	private String make;
	
	private String enginePerformance;
	
	private String dateOfManufacture;
	
	private String numberOfSeats;
	
	private String fuelType;
	
	private String listPrice;
	
	private String licensePlateNumber;
	
	private String annualMileage;
	
	public VehicleDataBuilder(VehicleDataPO vehicleDataPO) {
		
		this.vehicleDataPO = vehicleDataPO;
	}
	
	public VehicleDataBuilder com_Make(String make) {
		
		this.make = make;
		return this;
	}
	
	public VehicleDataBuilder com_EnginePerformance(String enginePerformance) {
		
		this.enginePerformance = enginePerformance;
		return this;
	}
	
	public VehicleDataBuilder com_DateOfManufacture(String dateOfManufacture) {
		
		this.dateOfManufacture = dateOfManufacture;
		return this;
	}
	
	public VehicleDataBuilder com_NumberOfSeats(String numberOfSeats) {
		
		this.numberOfSeats = numberOfSeats;
		return this;
	}
	
	public VehicleDataBuilder com_FuelType(String fuelType) {
		
		this.fuelType = fuelType;
		return this;
	}
	
	public VehicleDataBuilder com_ListPrice(String listPrice) {
		
		this.listPrice = listPrice;
		return this;
	}
	
	public VehicleDataBuilder com_LicensePlateNumber(String licensePlateNumber) {
		
		this.licensePlateNumber = licensePlateNumber;
		return this;
	}
	
	public VehicleDataBuilder com_AnnualMileage(String annualMileage) {
		
		this.annualMileage = annualMileage;
		return this;
	}
	
	public void preencher_VehicleData(WebDriver driver, int tempoMaximoEspera) {
		
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
