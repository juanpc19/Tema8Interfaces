package ejercicio3;

public class Polideportivo implements Edificio, InstalacionDeportiva {

	private String nombre;

	private double superficie;

	public Polideportivo() {

	}

	public Polideportivo(String nombre, double superficie) {
		this.superficie = superficie;
		this.nombre = nombre;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		int resultado = 0;

		switch (nombre) {

		case "Tenis" -> {
			resultado = 1;
		}

		case "Futbol" -> {
			resultado = 2;
		}

		case "Baloncesto" -> {
			resultado = 3;
		}

		case "Karate" -> {
			resultado = 4;
		}

		case "Judo" -> {
			resultado = 5;
		}

		default -> {
			System.err.println("El tipo de instalacion no es valido: ");
		}

		}

		return resultado;
	}

}
