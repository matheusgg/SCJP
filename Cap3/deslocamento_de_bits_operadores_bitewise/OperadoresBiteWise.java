/**
 * Os operadores bite-wise comparam a sequência de bits existentes um uma
 * variável e retornam um valor inteiro de acordo com o operador utilizado.
 * 
 * @author Matheus
 * 
 */
public class OperadoresBiteWise {
	public static void main(String[] args) {
		OperadoresBiteWise o = new OperadoresBiteWise();
		// o.operadorAND();
		// o.operadorOR();
		o.operadorXOR();
	}

	/**
	 * Será impresso 2. Pois é comparado o padrão de bits do número 2 (1 0).
	 * Caso os dois valores sejam 1, o resultado será 1, caso contrário, o
	 * resultado será 0.
	 */
	// 1 0
	// 1 0
	// ----
	// 1 0 --> 2 em decimal
	public void operadorAND() {
		int x = 2 & 2;
		System.out.println(x);
	}

	/**
	 * Será impresso 3. Pois é comparado o padrão de bits do número 2 (1 0), com
	 * o padrão de bits do número 1 (0 1). Caso algum dos dois valores seja 1, o
	 * resultado será 1, caso os dois valores sejam 0, o resultado será 0.
	 */
	// 1 0
	// 0 1
	// ----
	// 1 1 --> 3 em decimal
	public void operadorOR() {
		int x = 2 | 1;
		System.out.println(x);
	}

	/**
	 * Será impresso 6. Pois é comparado o padrão de bits do número 4 (1 0 0),
	 * com o padrão de bits do número 2 (1 0). Caso um valor seja 1 e o outro 0,
	 * o valor será 1, caso contrário, será 0;
	 */
	// 1 0 0
	// 0 1 0
	// ------
	// 1 1 0 --> 6 em decimal
	public void operadorXOR() {
		int x = 4 ^ 2;
		System.out.println(x);
	}
}
