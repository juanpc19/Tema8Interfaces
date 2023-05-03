package ejercicio4;

/**
 * clase Perro que heredara metodos de AnimalDomestico y añadira el metodo
 * sacarPaseo ademas de implentar la interfaz Animal
 * 
 * @author juanpesca19
 *
 */
public class Perro extends AnimalDomestico implements Animal {

	/**
	 * constructor sin parametros
	 */
	public Perro() {
		super();
	}

	/**
	 * constructor con parametros
	 * 
	 * @param nombre contendra valor para atributo nombre
	 * @param raza   contendra valor para atributo raza
	 * @param peso   contendra valor para atributo peso
	 * @param color  contendra valor para atributo color
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * metodo que devolvera true si el animal hace caso lo cual sucedera el 90% de
	 * las veces
	 * 
	 * @return resultado devolvera true o false segun el animal obedezca o no
	 */
	@Override
	public boolean hacerCaso() {
		boolean resultado = false;
		int numeroRandom = 0;

		numeroRandom = (int) (Math.random() * 10);

		if (numeroRandom != 5) {
			resultado = true;
		}

		return resultado;
	}

	/**
	 * metodo que heredado de Animal domestico que sobreescribira al mismo para
	 * adaptar su uso a clase Perro
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Guau!");
	}

	/**
	 * metodo que imprimira mensaje por pantalla
	 */
	public void sacarPaseo() {
		System.out.println("Toby, ven vamos de paseo!");
	}

}
