package ejercicio4;

/**
 * clase AnimalDomestico que implementra la interfaz animal con sus 3 metodos y
 * añadira los metodos vacunar y hacerCaso
 * 
 * @author juanpesca19
 *
 */
public class AnimalDomestico implements Animal {

	protected String nombre;// atributo que guardara el nombre del animal

	protected String raza; // atributo que guardara el raza del animal

	protected double peso; // atributo que guardara el peso del animal

	protected String color; // atributo que guardara el color del animal

	/**
	 * constructor sin parametros
	 */
	public AnimalDomestico() {
	}

	/**
	 * constructor con parametros
	 * 
	 * @param nombre contendra valor para atributo nombre
	 * @param raza   contendra valor para atributo raza
	 * @param peso   contendra valor para atributo peso
	 * @param color  contendra valor para atributo color
	 */
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		if (peso >= 0.0) {
			this.nombre = nombre;
			this.raza = raza;
			this.peso = peso;
			this.color = color;
		}
	}

	/**
	 * metodo vacunar que imprimira mensaje por pantalla
	 */
	public void vacunar() {
		System.out.println("Pinchazo administrado.");
	}

	/**
	 * metodo que devolvera true si el animal hace caso
	 * 
	 * @return resultado devolvera true o false segun el animal obedezca o no
	 */
	public boolean hacerCaso() {
		boolean resultado = true;

		return resultado;
	}

	/**
	 * metodo que devolvera cadena con valores de atributos el objeto que lo llama
	 */
	public String toString() {
		String resultado = "nombre: " + nombre + ", raza: " + raza + ", peso: " + peso + ", color: " + color;
		return resultado;
	}

}
