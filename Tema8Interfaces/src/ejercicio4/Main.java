package ejercicio4;

public class Main {

	public static void main(String[] args) {

		AnimalDomestico a = new AnimalDomestico("Vadim", "Pastor aleman", 20.0, "Negro");

		System.out.println(a.toString());
		a.comer();
		a.dormir();
		System.out.println(a.hacerCaso()? "Hace caso." : "No hace caso.");
		a.hacerRuido();
		a.vacunar();

		System.out.println();

		Perro p = new Perro("Toby", "Pitbull", 19.0, "Blanco");

		System.out.println(p.toString());
		p.comer();
		p.dormir();
		System.out.println(p.hacerCaso()? "Hace caso." : "No hace caso.");
		p.hacerRuido();
		p.vacunar();
		p.sacarPaseo();
		System.out.println();

		Gato g = new Gato("Albondiga", "Abisino", 10.0, "Negro");

		System.out.println(g.toString());
		g.comer();
		g.dormir();
		System.out.println(g.hacerCaso()? "Hace caso." : "No hace caso.");
		g.hacerRuido();
		g.vacunar();
		g.toserBolaPelo();

	}

}
