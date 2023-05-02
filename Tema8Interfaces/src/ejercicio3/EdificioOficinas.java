package ejercicio3;

public class EdificioOficinas implements Edificio {

	// hereda superficie de polideportivo por lo que usa interfaz edificio para
	// superficie
	// implementa InstalacionDeportiva para saber si es Polideportivo o
	// edificioOficinas

	protected int numOficinas;

	public EdificioOficinas() {
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
