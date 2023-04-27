package ejercicio1;

public class Socio implements Comparable {

	int id;// guardara número identificativo del socio.
	String nombre;// guardara nombre del socio.
	int edad;// guardara edad del socio.

	/**
	 * constructor sin parametros de entrada
	 */
	public Socio() {

	}

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param id     contendra valor para atributo id
	 * @param nombre contendra valor para atributo nombre
	 * @param edad   contendra valor para atributo edad
	 */
	public Socio(int id, String nombre, int edad) {
		if (id >= 0 && edad >= 0) {
			this.id = id;
			this.nombre = nombre;
			this.edad = edad;
		}
	}

	/**
	 * getter de atributo edad
	 * 
	 * @return edad devolvera valor actual de atributo edad
	 */
	public int getId() {
		return id;
	}

	/**
	 * metodo que devolvera una cadena con los valores de los atributos del objeto
	 * que lo llama
	 */
	@Override
	public String toString() {
		return "Socio id: " + id + ", nombre: " + nombre + ", edad: " + edad;
	}

	// metodo implementado por interfaz Comparable que comparara 2 atributos de 2
	// objetos devolviendo 0 si tiene mismo valor, -1 si el valor del atributo que
	// llama al metodo es menor que el de parametro de entrada o 1 en caso inverso
	@Override
	public int compareTo(Object o) {
		int resultado = 0;// doy a resultado valor 0 por defecto que sera lo que devolvere si ambos id
							// tienen mismo valor en la comparacion

		// hago cast para cambiar parametro de entrada de tipo Object a tipo Socio para
		// poder compararlo al objeto que llama al metodo
		Socio socio = (Socio) o;

		// comparo atributos id de los objetos, si id de invocador es menor que id de
		// parametro entrada
		if (this.id < socio.id) {
			// resultado toma valor -1
			resultado = -1;

			// comparo atributos id de los objetos, si id de invocador es mayor que id de
			// parametro entrada
		} else if (this.id > socio.id) {
			// resultado toma valor 1
			resultado = 1;
		}
		return resultado;
	}

}
