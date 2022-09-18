package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {

    /**Drive que será utilizado por todas as pages do sistema. */
    protected WebDriver driver;
	
	/**Elemento de texto do link para 'Insurance Type'. */
	@FindBy(id = "selectedinsurance")
	public WebElement span_InsuranceType;
	
	/**Elemento de link que redireciona para formulário 'Automobile'. */
	@FindBy(id = "nav_automobile")
	public WebElement menu_Automobile;
	
	/**Elemento de link que redireciona para formulário 'Truck'. */
	@FindBy(id = "nav_truck")
	public WebElement menu_Truck;
	
	/**Elemento de link que redireciona para formulário 'Motorcycle'. */
	@FindBy(id = "nav_motorcycle")
	public WebElement menu_Motorcycle;
	
	/**Elemento de link que redireciona para formulário 'Camper'. */
	@FindBy(id = "nav_camper")
	public WebElement menu_Camper;
	
	/**Elemento de alerta visível.*/
	@FindBy(css = "body > div.sweet-alert.showSweetAlert.visible")
	public WebElement Alert;
	
	/**Elemento de botão de confirmar alerta.*/
	@FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button")
	public WebElement btn_Ok;
	
	/**Elemento de título do alerta.*/
	@FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > h2")
	public WebElement txt_AlertTitle;
	
    /**
     * Construtor da classe.
     * @param driver Driver utilizado pelo sistema.
     */
    public BasePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
}
