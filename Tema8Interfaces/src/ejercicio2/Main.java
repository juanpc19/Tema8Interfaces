package ejercicio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// creo array listaFutbolistas tipo Futbolista de longitud 5
		Futbolista listaFutbolistas[] = new Futbolista[5];

		// creo objeto futbolista1 y le doy argumentos al constructor
		Futbolista futbolista1 = new Futbolista(12, "Juan", 22, 1);

		// creo objeto futbolista2 y le doy argumentos al constructor
		Futbolista futbolista2 = new Futbolista(12, "Paco", 22, 1);

		// creo objeto listaFutbolistas en posicion 0 del array y le doy argumentos al
		// constructor
		listaFutbolistas[0] = new Futbolista(7, "Paco", 22, 1);

		// creo objeto listaFutbolistas en posicion 1 del array y le doy argumentos al
		// constructor
		listaFutbolistas[1] = new Futbolista(7, "Juan", 22, 1);

		// creo objeto listaFutbolistas en posicion 2 del array y le doy argumentos al
		// constructor
		listaFutbolistas[2] = new Futbolista(1, "Antonio", 22, 1);

		// creo objeto listaFutbolistas en posicion 3 del array y le doy argumentos al
		// constructor
		listaFutbolistas[3] = new Futbolista(5, "Paxi", 22, 1);

		// creo objeto listaFutbolistas en posicion 4 del array y le doy argumentos al
		// constructor
		listaFutbolistas[4] = new Futbolista(4, "Manolo", 22, 1);

		// compruebo funcionamiento de compareTo usando atributos numCamiseta y nombre
		// con los siguientes objetos
		System.out.println(futbolista1.compareTo(futbolista2));

		// compruebo funcionamiento de compareTo usando atributos numCamiseta y nombre
		// con los siguientes objetos
		System.out.println(futbolista2.compareTo(futbolista1));

		// compruebo funcionamiento de compareTo usando atributos numCamiseta y nombre
		// con los siguientes objetos
		System.out.println(futbolista1.compareTo(futbolista1));

		// ordeno el array listaFutbolistas haciendo uso de Arrays.sort que usara el
		// metodo compareTo de la clase Futbolista que implementa la interfaz Comparable
		// de java
		Arrays.sort(listaFutbolistas);

		// recorro el array listaFutbolistas mostrando por pantalla los datos de cada
		// objeto
		for (Futbolista futbolista : listaFutbolistas) {
			System.out.println(futbolista);
		}

	}

}
