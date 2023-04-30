package ejercicio3;

public interface InstalacionDeportiva {

	default String getTipoDeInstalacion(Polideportivo poli) {

		String tipo = "";

		tipo = poli.getClass().getName();

		return tipo;
	}

}
