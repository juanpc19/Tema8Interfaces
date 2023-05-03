package ejercicio4;

public interface Animal {

	default void comer() {
		System.out.println("ñam, ñam.");
	}
	
	default void dormir() {
		System.out.println("zzzz, zzzz.");
	}
	
	default void hacerRuido() {
		System.out.println("Reeeeeeeeeeeeeeeeeeee.");
	}
	
}
