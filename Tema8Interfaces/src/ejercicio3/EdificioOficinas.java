package ejercicio3;

public class EdificioOficinas extends Polideportivo implements Edificio, InstalacionDeportiva {

	// hereda superficie de polideportivo por lo que usa interfaz edificio para
	// superficie
	// implementa InstalacionDeportiva para saber si es Polideportivo o
	// edificioOficinas

	protected int numOficinas;

	public EdificioOficinas() {
		super();

	}

	public EdificioOficinas(double superficie, String nombre) {
		super(superficie, nombre);

	}

	public EdificioOficinas(double superficie, String nombre, int numOficinas) {
		super(superficie, nombre);
		this.numOficinas = numOficinas;
	}

	public int getNumOficinas() {
		return numOficinas;
	}

	public void setNumOficinas(int numOficinas) {
		this.numOficinas = numOficinas;
	}

	public void getSuperficieEdificio() {

	}

}
