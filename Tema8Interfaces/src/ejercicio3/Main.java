package ejercicio3;

public class Main {

	public static void main(String[] args) {

		Polideportivo poli[] = new Polideportivo[5];

		EdificioOficinas EdiOfi[] = new EdificioOficinas[2];

		poli[0] = new Polideportivo("Tenis", 50.0);
		poli[1] = new Polideportivo("Futbol", 100.0);
		poli[2] = new Polideportivo("Baloncesto", 70.0);
		poli[3] = new Polideportivo("Karate", 50.0);
		poli[4] = new Polideportivo("Judo", 60.0);

		EdiOfi[0] = new EdificioOficinas(10, 100.0);
		EdiOfi[1] = new EdificioOficinas(20, 200.0);

		for (Polideportivo p : poli) {
			System.out.println("Tipo de instalacion: " + p.getTipoDeInstalacion());

			System.out.println("Superficie edificio: " + p.getSuperficieEdificio());
		}
		
		System.out.println();

		for (EdificioOficinas e : EdiOfi) {
			System.out.println("Numero de oficinas: " + e.getNumOficinas());

			System.out.println("Superficie edificio: " + e.getSuperficieEdificio());
		}

	}

}
