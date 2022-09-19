package managers;

import utils.MethodUtils;

/**Classe do gerenciador da classe MethodUtils. */
public class UtilsManager {

	/**Instância de MethodUtils.*/
	private MethodUtils utils;
	
	/**Construtor da classe.*/
	public UtilsManager() {
		
	}
	
	/**Método responsável por obter a instância de MethodUtils.*/
	public MethodUtils getUtils() {
		
		return (utils == null) ? utils = new MethodUtils() : utils;
	}
	
}
