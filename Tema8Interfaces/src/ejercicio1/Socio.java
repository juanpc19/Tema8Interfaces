package ejercicio1;

public class Socio implements Comparable {

	int id;// número identificativo del socio.
	String nombre;
	int edad;

	public Socio() {

	}

	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Socio id: " + id + ", nombre: " + nombre + ", edad: " + edad;
	}

}
