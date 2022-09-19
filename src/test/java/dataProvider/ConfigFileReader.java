package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**Clase de configuração de leitura de arquivos. */
public class ConfigFileReader {
	
	/**Instância de Properties. */
	private Properties properties;
	
	/**Caminho de acesso ao arquivo de configuração de propriedades. */
	private final String propertyFilePath = "configs//Configuration.properties";

	/**Construtor da classe. */
	public ConfigFileReader(){
		
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	/**Método responsável por obter o caminho do driver do navegador. */
	public String getDriverPath(){
		
		String driverPath = properties.getProperty("driverPath");
		
		if(driverPath!= null) {
			
			return driverPath;
		} else {
			
			throw new RuntimeException("driverPath: Caminho do driver não foi especificado no arquivo Configuration.properties.");		
		}
	}
	
	/**Método responsável por obter o tempo padrão de espera setado para espera implícita. */
	public int getImplicitlyWait() {		
		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		
		if(implicitlyWait != null) {
			
			return Integer.parseInt(implicitlyWait);
		} else {
			
			throw new RuntimeException("implicitlyWait: Tempo de espera implícita não foi especificada Configuration.properties.");		
		}
	}
	
	/**Método responsável por obter a URL da aplicação. */
	public String getApplicationUrl() {
		
		String url = properties.getProperty("url");
		
		if(url != null) {
			
			return url;
		} else {
			
			throw new RuntimeException("url: URL da aplicação não foi especificada no arquivo Configuration.properties.");
		}
	}
	
}
