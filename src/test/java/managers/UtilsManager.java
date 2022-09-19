package managers;

import utils.MethodUtils;

public class UtilsManager {

	private MethodUtils utils;
	
	public UtilsManager() {
		
	}
	
	public MethodUtils getUtils() {
		
		return (utils == null) ? utils = new MethodUtils() : utils;
	}
	
}
