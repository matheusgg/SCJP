package sobrecarga;

public class Sobrecarga {

	public static void main(String[] args) {
		/*
		 * O compilador sempre preferirá a ampliação ao invés do autoboxing.
		 * Logo, o método que recebe o tipo primitivo float será chamado.
		 */
		Sobrecarga s = new Sobrecarga();
		float f = 10.3f;
		s.metodo(f);

		// Sobrecarga2 s2 = new Sobrecarga2();
		// s2.metodo(f); Não é possível chamar este método passando um float,
		// pois a JVM não consegue fazer a ampliação e em seguida o boxing
		// automaticamente.
	}

	public void metodo(float f) {
		System.out.println("float");
	}

	public void metodo(Float f) {
		System.out.println("Float");
	}
}

class Sobrecarga2 {
	public void metodo(Double d) {
		System.out.println("Double");
	}
}
