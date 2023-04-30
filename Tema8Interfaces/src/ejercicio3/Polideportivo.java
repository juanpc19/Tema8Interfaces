package ejercicio3;

public class Polideportivo implements Edificio, InstalacionDeportiva {

	// tiene superficie por lo que usa interfaz edificio para superficie
	// implementa InstalacionDeportiva para saber si es Polideportivo o
	// edificioOficinas

	protected double superficie;

	protected String nombre = "";

	public Polideportivo() {

	}

	public Polideportivo(double superficie, String nombre) {
		this.superficie = superficie;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void getSuperficieEdificio() {

	}
}
