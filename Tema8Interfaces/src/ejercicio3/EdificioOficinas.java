package ejercicio3;

public class EdificioOficinas implements Edificio {

	private int numOficinas;

	private double superficie;

	public EdificioOficinas() {

	}

	public EdificioOficinas(int numOficinas, double superficie) {
		this.numOficinas = numOficinas;
		this.superficie = superficie;
	}

	public int getNumOficinas() {
		return numOficinas;
	}

	public void setNumOficinas(int numOficinas) {
		this.numOficinas = numOficinas;
	}

	public double getSuperficieEdificio() {
		return superficie;
	}

}
