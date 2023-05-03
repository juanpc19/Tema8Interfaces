package ejercicio3;

/**
 * interfaz que contendra el metodo getSuperficieEdificio
 * 
 * @author juanpesca19
 *
 */
public interface Edificio {

	/**
	 * Metodo que sera usado y modificado por varias clases para devolver valor de
	 * atributo superficie
	 * 
	 * @return devolvera valor actual de resultado
	 */
	default double getSuperficieEdificio() {
		double resultado = 0;

		return resultado;
	}

}
