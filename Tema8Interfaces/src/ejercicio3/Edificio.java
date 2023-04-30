package ejercicio3;

public interface Edificio {

	double superficie = 0.0;

	default double getSuperficieEdificio(Polideportivo poli) {

		double superficie = 0;

		superficie = poli.superficie;

		return superficie;
	}

}
