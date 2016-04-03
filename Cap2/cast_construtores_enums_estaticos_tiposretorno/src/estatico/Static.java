package estatico;

public class Static {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Teste t = null;
		/*
		 * Isto funciona!!! pois a JVM verifica apenas o tipo da vari�vel de
		 * refer�ncia quando se trata de um membro est�tico para cham�-lo. J�
		 * que este m�todo pertence a classe, ou seja, n�o � um membro de
		 * inst�ncia, mesmo com a vari�vel de refer�ncia estando nula, o m�todo
		 * est�tico ser� invocado a partir da classe que � o tipo da vari�vel de
		 * refer�ncia. O mesmo vale para vari�veis est�ticas. Ou seja, a JVM usa
		 * o tipo da vari�vel de refer�ncia para invocar o m�todo da classe, e
		 * n�o a partir de um objeto.
		 */
		System.out.println(t.ramdomNumber());
		System.out.println(t.x);
		new Teste1[] { new Teste2() }[0].metodo();
	}

}

class Teste {
	/*
	 * � poss�vel invocar m�todos est�ticos para inicializar atributos da classe
	 * (est�ticos ou n�o-est�ticos). Por�m, n�o � poss�vel chamar m�todos de
	 * inst�ncia para inicializar atributos est�ticos. Logo, a seguinte linha
	 * n�o compilaria. static double x = this.geraDouble();
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
	 * N�o � poss�vel sobrescrever um m�todo static, por�m � poss�vel
	 * redefini-lo. IMPORTANTE... SOBRESCREVER E REDEFINIR S�O COISAS
	 * DIFERENTES. MAS A REDEFINI��O SEGUE AS MESMAS REGRAS DA SOBRESCRITA.
	 */
	static void metodo() {
		System.out.println("t2");
	}
}
