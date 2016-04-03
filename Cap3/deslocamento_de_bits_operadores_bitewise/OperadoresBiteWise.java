/**
 * Os operadores bite-wise comparam a sequ�ncia de bits existentes um uma
 * vari�vel e retornam um valor inteiro de acordo com o operador utilizado.
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
	 * Ser� impresso 2. Pois � comparado o padr�o de bits do n�mero 2 (1 0).
	 * Caso os dois valores sejam 1, o resultado ser� 1, caso contr�rio, o
	 * resultado ser� 0.
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
	 * Ser� impresso 3. Pois � comparado o padr�o de bits do n�mero 2 (1 0), com
	 * o padr�o de bits do n�mero 1 (0 1). Caso algum dos dois valores seja 1, o
	 * resultado ser� 1, caso os dois valores sejam 0, o resultado ser� 0.
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
	 * Ser� impresso 6. Pois � comparado o padr�o de bits do n�mero 4 (1 0 0),
	 * com o padr�o de bits do n�mero 2 (1 0). Caso um valor seja 1 e o outro 0,
	 * o valor ser� 1, caso contr�rio, ser� 0;
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
