package ejercicio1;

public class Main {

	public static void main(String[] args) {

		Socio listadoSocios[] = new Socio[5];

		Socio listadoSociosOrdenado[] = new Socio[5];

		Socio listadoSocios1 = new Socio(12, "Juan", 22);

		Socio listadoSocios2 = new Socio(13, "Juan", 22);

		listadoSocios[0] = new Socio(11, "Juan", 22);

		listadoSocios[1] = new Socio(1, "Juan", 2);

		listadoSocios[2] = new Socio(3, "Juan", 33);

		listadoSocios[3] = new Socio(20, "Juan", 40);

		listadoSocios[4] = new Socio(2, "Juan", 4);

	
		System.out.println(listadoSocios1.compareTo(listadoSocios2));

		for (int i = 0; i < listadoSocios.length; i++) {
			

			for (int j = 0; j < listadoSocios.length; j++) {
				int resultadoComparar;
				resultadoComparar = listadoSocios[i].compareTo(listadoSocios)[j];

			}

		}

	}

}
