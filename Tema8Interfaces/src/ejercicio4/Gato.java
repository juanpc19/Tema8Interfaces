package ejercicio4;

public class Gato extends AnimalDomestico implements Animal {

	public Gato() {
		super();
	}

	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	public boolean hacerCaso() {
		boolean resultado = false;
		int numeroRandom = 0;
		
		numeroRandom = (int) (Math.random() * 20);
		
		if (numeroRandom == 5) {
			resultado = true;
		}

		return resultado;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Miau!");
	}

	public void toserBolaPelo() {
		System.out.println("Puagh.");
	}
}
