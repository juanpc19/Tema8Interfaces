package ejercicio4;

public class AnimalDomestico implements Animal {

	protected String nombre;

	protected String raza;

	protected double peso;

	protected String color;

	public AnimalDomestico() {
	}

	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}

	public void vacunar() {
		System.out.println("Pinchazo administrado.");
	}

	public boolean hacerCaso() {
		boolean resultado = true;

		return resultado;
	}
	
	public String toString() {
		String resultado = "nombre: " + nombre + ", raza: " + raza + ", peso: " + peso + ", color: " + color;
		return resultado;
	}

}
