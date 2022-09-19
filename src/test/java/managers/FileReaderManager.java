package managers;

import dataProvider.ConfigFileReader;

/**Classe para gerenciar a leitura de arquivos. */
public class FileReaderManager {

	/**Nova instância de FileReaderManager. */
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	
	/**Nova instância de ConfigFileReader. */
	private static ConfigFileReader configFileReader;

	/**Construtor da classe. */
	private FileReaderManager() {
	}

	/**Método responsável por obter determinada instância. */
	public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	}
	
	/**Método responsável por instanciar a classe ConfigFileReader. */
	public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}
	
}
