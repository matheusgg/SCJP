package construtores;

/*
 * A JVM sempre chamará implicitamente o construtor padrão da superclasse. Caso
 * este construtor não exista, será necessário chamar outro construtor explícitamente.
 * O compilador sempre criará um construtor padrão (sem parâmetros) quando não é declarado
 * nenhum construtor na clase, e este por sua vez, terá o mesmo modificador de acesso da
 * classe. A primeira instrução dentro de um construtor deve sempre ser a chamada a um
 * construtor da super classe com 'super()', ou a chamada a um construtor sobrecarregado com
 * 'this()', porém não é necessário declarar explicitamente estas instruções. Caso elas não
 * estejam presentes, o compilador irá inserí-las automaticamente.
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
	 * Os valores padrões e explícitos das variáveis de instância são atribuídos
	 * antes da execução do construtor da Classe.
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
		System.out.println("Classe1.Classe1()"); // Será o primeiro a ser
													// chamado. 4
	}

	public Classe1(String n) {
		System.out.println(n);
	}

}

class Classe2 extends Classe1 {
	public Classe2() {
		this(""); // Chamará o construtor sobrecarregado.
		System.out.println("Classe2.Classe2() - 1"); // Será a última instrução
														// a ser executada. 6
	}

	public Classe2(String s) {
		// Apenas métodos estáticos ou constantes podem ser usados
		// na chamada a contrutores com super ou this. Logo
		// (super(this.metodo())) não funcionará, pois metodo() não é estático.
		// Não é possível chamar métodos ou variáveis de instância até o
		// construtor da superclasse ter sido consluído.

		System.out.println("Classe2.Classe2() - 2"); // Chamará implicitamente o
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
