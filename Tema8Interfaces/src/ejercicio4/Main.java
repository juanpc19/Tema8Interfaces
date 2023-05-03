package ejercicio4;

public class Main {

	public static void main(String[] args) {

		//creacion de objeto tipo AnimalDomestico con parametros de entrada lo guardo en variable a
		AnimalDomestico a = new AnimalDomestico("Vadim", "Pastor aleman", 20.0, "Negro");

		//llamo al metodo toString con objeto a
		System.out.println(a.toString());
		//llamo a los diferentes metodos de objeto a
		a.comer();
		a.dormir();
		System.out.println(a.hacerCaso()? "Hace caso." : "No hace caso.");
		a.hacerRuido();
		a.vacunar();

		System.out.println();

		//creacion de objeto tipo Perro con parametros de entrada lo guardo en variable p
		Perro p = new Perro("Toby", "Pitbull", 19.0, "Blanco");

		//llamo al metodo toString con objeto p
		System.out.println(p.toString());
		//llamo a los diferentes metodos de objeto p
		p.comer();
		p.dormir();
		System.out.println(p.hacerCaso()? "Hace caso." : "No hace caso.");
		p.hacerRuido();
		p.vacunar();
		p.sacarPaseo();
		System.out.println();

		//creacion de objeto tipo Gato con parametros de entrada lo guardo en variable g
		Gato g = new Gato("Albondiga", "Abisino", 10.0, "Negro");

		//llamo al metodo toString con objeto g
		System.out.println(g.toString());
		//llamo a los diferentes metodos de objeto g
		g.comer();
		g.dormir();
		System.out.println(g.hacerCaso()? "Hace caso." : "No hace caso.");
		g.hacerRuido();
		g.vacunar();
		g.toserBolaPelo();

	}

}
