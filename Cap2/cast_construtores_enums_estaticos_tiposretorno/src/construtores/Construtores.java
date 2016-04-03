package construtores;

/*
 * A JVM sempre chamar� implicitamente o construtor padr�o da superclasse. Caso
 * este construtor n�o exista, ser� necess�rio chamar outro construtor expl�citamente.
 * O compilador sempre criar� um construtor padr�o (sem par�metros) quando n�o � declarado
 * nenhum construtor na clase, e este por sua vez, ter� o mesmo modificador de acesso da
 * classe. A primeira instru��o dentro de um construtor deve sempre ser a chamada a um
 * construtor da super classe com 'super()', ou a chamada a um construtor sobrecarregado com
 * 'this()', por�m n�o � necess�rio declarar explicitamente estas instru��es. Caso elas n�o
 * estejam presentes, o compilador ir� inser�-las automaticamente.
 */
public class Construtores {
	public static void main(String[] args) {
		new Classe2();
		// Classe1.enclosing_method() static
		// Classe3.Classe3()
		// Classe1.enclosing_method()
		// Classe1.Classe1()
		// Classe2.Classe2() - 2
		// Classe2.Classe2() - 1
	}

	protected static class Teste {

	}
}

class Classe1 {
	/*
	 * Os valores padr�es e expl�citos das vari�veis de inst�ncia s�o atribu�dos
	 * antes da execu��o do construtor da Classe.
	 */
	Classe3 c3 = new Classe3(); // 2
	int x; // 2

	static {
		System.out.println("Classe1.enclosing_method() static"); // 1
	}

	{
		System.out.println("Classe1.enclosing_method()"); // 3
	}

	public Classe1() {
		System.out.println("Classe1.Classe1()"); // Ser� o primeiro a ser
													// chamado. 4
	}

	public Classe1(String n) {
		System.out.println(n);
	}

}

class Classe2 extends Classe1 {
	public Classe2() {
		this(""); // Chamar� o construtor sobrecarregado.
		System.out.println("Classe2.Classe2() - 1"); // Ser� a �ltima instru��o
														// a ser executada. 6
	}

	public Classe2(String s) {
		// Apenas m�todos est�ticos ou constantes podem ser usados
		// na chamada a contrutores com super ou this. Logo
		// (super(this.metodo())) n�o funcionar�, pois metodo() n�o � est�tico.
		// N�o � poss�vel chamar m�todos ou vari�veis de inst�ncia at� o
		// construtor da superclasse ter sido conslu�do.

		System.out.println("Classe2.Classe2() - 2"); // Chamar� implicitamente o
														// construtor da
														// superclasse. 5
		// super(Classe2.metodo());
	}

	public static String metodo() {
		return "METODO";
	}

	public String metodo(String n) {
		return n;
	}
}

class Classe3 {
	public Classe3() {
		System.out.println("Classe3.Classe3()"); // 2
	}
}
