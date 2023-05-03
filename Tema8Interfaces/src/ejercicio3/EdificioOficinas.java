package ejercicio3;

/**
 * clase EdificioOficinas que implementara la interfaz Edificio
 * 
 * @author juanpesca19
 *
 */
public class EdificioOficinas implements Edificio {

	private int numOficinas;// atributo que guardara el numero de oficinas del edificio

	private double superficie;// atributo que guardara la superficie del edificio

	/**
	 * constructor sin parametros
	 */
	public EdificioOficinas() {

	}

	/**
	 * constructor con parametros
	 * 
	 * @param nombre     contendra valor para atributo nombre
	 * @param superficie contendra valor para atributo nombre
	 */
	public EdificioOficinas(int numOficinas, double superficie) {
		if (numOficinas >= 0 && superficie >= 0) {
			this.numOficinas = numOficinas;
			this.superficie = superficie;
		}
	}

	/**
	 * getter de atributo numOficinas
	 * 
	 * @return numOficinas devolvera valor actual de atributo numOficinas
	 */
	public int getNumOficinas() {
		return numOficinas;
	}

	/**
	 * setter de atributo numOficinas
	 * 
	 * @param numOficinas contendra valor para atributo numOficinas
	 */
	public void setNumOficinas(int numOficinas) {
		if (numOficinas >= 0) {
			this.numOficinas = numOficinas;
		}
	}

	/**
	 * metodo implementado de la interfaz Edificio modificado en clase Polideportivo
	 * para que devuelva valor actual de atributo superficie
	 */
	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

}
