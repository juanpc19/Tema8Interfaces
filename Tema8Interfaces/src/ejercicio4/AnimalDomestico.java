package ejercicio4;

public class AnimalDomestico implements Animal {

	String nombre;

	String raza;

	double peso;

	String color;
	
	public AnimalDomestico() {
	}

	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
		this.color = color;
	}


	void vacunar() {

	}

	void hacerCaso() {

	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub

	}

}
