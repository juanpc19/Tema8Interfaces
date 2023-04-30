package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Polideportivo poli[] = new Polideportivo[5];

		Polideportivo poli2 = new Polideportivo(20.4, "nooooooo");

		Scanner dogma = new Scanner(System.in);

		double cosa;

		poli[0] = new Polideportivo(10.5, "siu");
		poli[1] = new Polideportivo(20.4, "nooooooo");
		poli[2] = new Polideportivo(30.1, "reeee");
		poli[3] = new EdificioOficinas(40.2, "no tiene oficinas");
		poli[4] = new EdificioOficinas(50.2, "tiene oficinas", 20);

		System.out.println(poli2.getSuperficieEdificio(poli2));
		System.out.println(poli[0].getClass().getName());
		System.out.println(poli[3].getClass());
		System.out.println(poli[4].getNombre());

		for (Polideportivo p : poli) {

		}

		dogma.close();
	}

}
