package sobrecarga;

public class Sobrecarga {

	public static void main(String[] args) {
		/*
		 * O compilador sempre preferir� a amplia��o ao inv�s do autoboxing.
		 * Logo, o m�todo que recebe o tipo primitivo float ser� chamado.
		 */
		Sobrecarga s = new Sobrecarga();
		float f = 10.3f;
		s.metodo(f);

		// Sobrecarga2 s2 = new Sobrecarga2();
		// s2.metodo(f); N�o � poss�vel chamar este m�todo passando um float,
		// pois a JVM n�o consegue fazer a amplia��o e em seguida o boxing
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
