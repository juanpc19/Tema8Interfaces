package ejercicio1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// creo array listadoSocios tipo Socios de longitud 5
		Socio listadoSocios[] = new Socio[5];

		// creo objeto socio1 y le doy argumentos al constructor
		Socio socio1 = new Socio(12, "Juan", 22);

		// creo objeto socio2 y le doy argumentos al constructor
		Socio socio2 = new Socio(13, "Juan", 22);

		// creo objeto listadoSocios en posicion 0 del array y le doy argumentos al
		// constructor
		listadoSocios[0] = new Socio(3, "Juan", 22);

		// creo objeto listadoSocios en posicion 1 del array y le doy argumentos al
		// constructor
		listadoSocios[1] = new Socio(2, "Juan", 21);

		// creo objeto listadoSocios en posicion 2 del array y le doy argumentos al
		// constructor
		listadoSocios[2] = new Socio(1, "Juan", 33);

		// creo objeto listadoSocios en posicion 3 del array y le doy argumentos al
		// constructor
		listadoSocios[3] = new Socio(5, "Juan", 40);

		// creo objeto listadoSocios en posicion 4 del array y le doy argumentos al
		// constructor
		listadoSocios[4] = new Socio(4, "Juan", 4);

		// compruebo funcionamiento de compareTo usando id con los siguientes objetos
		System.out.println(socio1.compareTo(socio2));

		// compruebo funcionamiento de compareTo usando id con los siguientes objetos
		System.out.println(socio2.compareTo(socio1));

		// compruebo funcionamiento de compareTo usando id con los siguientes objetos
		System.out.println(socio1.compareTo(socio1));

		// ordeno el array listadoSocios haciendo uso de Arrays.sort que usara el metodo
		// compareTo de la clase Socio que implementa la interfaz Comparable de java
		Arrays.sort(listadoSocios);

		// muestro array ordenado por pantalla
		System.out.println(Arrays.deepToString(listadoSocios));
		// muestro array ordenado por pantalla
		System.out.println(Arrays.toString(listadoSocios));

	}

}
