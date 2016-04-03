package estatico;

public class Static {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Teste t = null;
		/*
		 * Isto funciona!!! pois a JVM verifica apenas o tipo da variável de
		 * referência quando se trata de um membro estático para chamá-lo. Já
		 * que este método pertence a classe, ou seja, não é um membro de
		 * instância, mesmo com a variável de referência estando nula, o método
		 * estático será invocado a partir da classe que é o tipo da variável de
		 * referência. O mesmo vale para variáveis estáticas. Ou seja, a JVM usa
		 * o tipo da variável de referência para invocar o método da classe, e
		 * não a partir de um objeto.
		 */
		System.out.println(t.ramdomNumber());
		System.out.println(t.x);
		new Teste1[] { new Teste2() }[0].metodo();
	}

}

class Teste {
	/*
	 * É possível invocar métodos estáticos para inicializar atributos da classe
	 * (estáticos ou não-estáticos). Porém, não é possível chamar métodos de
	 * instância para inicializar atributos estáticos. Logo, a seguinte linha
	 * não compilaria. static double x = this.geraDouble();
	 */
	static double x = Teste.geraDoubleEstatico();
	double y = this.geraDouble();

	static int ramdomNumber() {
		return (int) (Math.random() * 100);
	}

	static double geraDoubleEstatico() {
		return Math.random() * 100;
	}

	double geraDouble() {
		return Math.random() * 100;
	}
}

class Teste1 {
	static void metodo() {
		System.out.println("t1");
	}
}

class Teste2 extends Teste1 {
	/*
	 * Não é possível sobrescrever um método static, porém é possível
	 * redefini-lo. IMPORTANTE... SOBRESCREVER E REDEFINIR SÃO COISAS
	 * DIFERENTES. MAS A REDEFINIÇÃO SEGUE AS MESMAS REGRAS DA SOBRESCRITA.
	 */
	static void metodo() {
		System.out.println("t2");
	}
}
