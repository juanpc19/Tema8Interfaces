package ejercicio3;

/**
 * clase Polideportivo que implementara las interfaces Edificio y
 * InstalacionDeportiva
 * 
 * @author juanpesca19
 *
 */
public class Polideportivo implements Edificio, InstalacionDeportiva {

	private String nombre;// atributo que guardara el nombre del edificio

	private double superficie;// atributo que guardara la superficie del edificio

	/**
	 * constructor sin parametros
	 */
	public Polideportivo() {

	}

	/**
	 * constructor con parametros
	 * 
	 * @param nombre     contendra valor para atributo nombre
	 * @param superficie contendra valor para atributo nombre
	 */
	public Polideportivo(String nombre, double superficie) {
		if (superficie >= 0) {
			this.superficie = superficie;
			this.nombre = nombre;
		}
	}

	/**
	 * metodo implementado de la interfaz Edificio modificado en clase Polideportivo
	 * para que devuelva valor actual de atributo superficie
	 */
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	/**
	 * metodo implementado de la interfaz InstalacionDeportiva que devolvera un
	 * numero segun el valor actual de atributo nombre de objeto que lo llama
	 */
	@Override
	public int getTipoDeInstalacion() {
		int resultado = 0;

		switch (nombre) {

		case "Tenis" -> {
			resultado = 1;
		}

		case "Futbol" -> {
			resultado = 2;
		}

		case "Baloncesto" -> {
			resultado = 3;
		}

		case "Karate" -> {
			resultado = 4;
		}

		case "Judo" -> {
			resultado = 5;
		}

		default -> {
			System.err.println("El tipo de instalacion no es valido: ");
		}

		}

		return resultado;
	}

}
