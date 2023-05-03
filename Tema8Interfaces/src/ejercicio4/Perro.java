package ejercicio4;

public class Perro extends AnimalDomestico implements Animal {

	public Perro() {
		super();
	}

	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

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

	@Override
	public void hacerRuido() {
		System.out.println("Guau!");
	}

	public void sacarPaseo() {
		System.out.println("Toby, ven vamos de paseo!");
	}

}
