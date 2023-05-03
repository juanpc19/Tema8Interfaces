package ejercicio3;

/**
 * interfaz que contendra el metodo TipoDeInstalacion
 * 
 * @author juanpesca19
 *
 */
public interface InstalacionDeportiva {

	/**
	 * Metodo que sera usado y modificado por varias clases para devolver un int
	 * acorde al nombre de la instalacion
	 * 
	 * @return resultado devolvera valor actual de resultado
	 */
	default int getTipoDeInstalacion() {
		int resultado = 0;

		return resultado;
	}

}
