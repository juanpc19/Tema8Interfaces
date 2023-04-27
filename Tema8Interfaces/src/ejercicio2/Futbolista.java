package ejercicio2;

public class Futbolista implements Comparable {

	int numCamiseta;// contendra numero de camiseta de futbolista

	String nombre;// nombre del futbolista

	int edad;// contendra la edad del futbolista

	int numGoles;// contendra numero de goles del futbolista

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param numCamiseta contendra valor para atributo numCamiseta
	 * @param nombre      contendra valor para atributo nombre
	 * @param edad        contendra valor para atributo edad
	 * @param numGoles    contendra valor para atributo numGoles
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		// si los datos son correctos
		if (numCamiseta >= 0 && edad >= 0 && numGoles >= 0) {
			// los asigno a sus atributos
			this.numCamiseta = numCamiseta;
			this.nombre = nombre;
			this.edad = edad;
			this.numGoles = numGoles;
		}
	}

	/**
	 * metodo que devolvera una cadena con los valores de los atributos del objeto
	 * que lo llama
	 */
	@Override
	public String toString() {
		return "Numero de camiseta: " + numCamiseta + ", nombre: " + nombre + ", edad: " + edad + ", numero goles: "
				+ numGoles;
	}

	@Override
	public int compareTo(Object o) {
		int resultado = 0;// doy a resultado valor 0 para inicializarlo

		// hago cast para cambiar parametro de entrada de tipo Object a tipo Futbolista
		// para poder compararlo al objeto que llama al metodo
		Futbolista futbolista = (Futbolista) o;

		// comparo numCamiseta de los objetos, si numCamiseta de invocador es
		// igual que numCamiseta de parametro entrada
		if (this.numCamiseta == futbolista.numCamiseta) {

			// comparo los atributos nombre y si tambien son iguales
			if (this.nombre.equalsIgnoreCase(futbolista.nombre)) {
				// resultado mantiene su valor a 0
				resultado = 0;
			}

			// si atributo nombre de invocante es menor alfabeticamente que el de parametro
			// de entrada
			else if (this.nombre.compareTo(futbolista.nombre) < 0) {
				// resultado toma valor 1 para indicarlo
				resultado = -1;
			}

			// si atributo nombre de invocante es mayor alfabeticamente que el de parametro
			// de entrada
			else if (this.nombre.compareTo(futbolista.nombre) > 0) {
				// resultado toma valor 1 para indicarlo
				resultado = 1;
			}
		}

		// si numCamiseta no son iguales, comparo atributos numCamiseta de los objetos,
		// si numCamiseta de invocador es menor que numCamiseta de parametro entrada
		else if (this.numCamiseta < futbolista.numCamiseta) {
			// resultado toma valor -1
			resultado = -1;

			// comparo atributos numCamiseta de los objetos, si numCamiseta de invocador es
			// mayor que numCamiseta de parametro entrada
		} else if (this.numCamiseta > futbolista.numCamiseta) {
			// resultado toma valor 1
			resultado = 1;
		}
		return resultado;
	}
}
