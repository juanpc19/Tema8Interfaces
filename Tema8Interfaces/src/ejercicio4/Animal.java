package ejercicio4;

/**
 * interfaz que contendra metodos para clases relacionadas con animales
 * 
 * @author juanpesca19
 *
 */
public interface Animal {

	/**
	 * metodo comer que imprimira mensaje por pantalla
	 */
	default void comer() {
		System.out.println("ñam, ñam.");
	}

	/**
	 * metodo dormir que imprimira mensaje por pantalla
	 */
	default void dormir() {
		System.out.println("zzzz, zzzz.");
	}

	/**
	 * metodo hacerRuido que imprimira mensaje por pantalla
	 */
	default void hacerRuido() {
		System.out.println("Reeeeeeeeeeeeeeeeeeee.");
	}

}
