/**
 * O deslocamento de bits altera a sequ�ncia de bits armazenada em uma vari�vel.
 * � poss�vel utiliz�-lo apenas com n�meros inteiros. Para deslocar um valor,
 * basta transform�-lo em bin�rio, e deslocar todos os n�meros '1', para a
 * direita ou para a esquerda, com exce��o do �ltimo bit, que representa o
 * sinal. Os operadores '>>', '<<' e '>>>' s�o chamados de operadores bite-wise.
 * 
 * @author Matheus
 * 
 */
public class DeslocamentoDeBits {
	public static void main(String[] args) {
		DeslocamentoDeBits d = new DeslocamentoDeBits();
		// d.deslocamentoADireitaComSinal();
		// d.deslocamentoAEsquerdaComSinal();
		d.deslocamentoADireitaSemSinal();
	}

	public void deslocamentoADireitaComSinal() {
		/*
		 * Sequ�ncia de bits de x antes do deslocamento.
		 */
		// 00000000000000000000000000010000 (base 2)
		int x = 16;

		/*
		 * Sequ�ncia de bits de x depois do deslocamento.
		 */
		// 00000000000000000000000000000100 (base 2)
		x = x >> 2; // Deslocando 2 bits para a direita
		System.out.println(x);
	}

	public void deslocamentoAEsquerdaComSinal() {
		/*
		 * Sequ�ncia de bits de x antes do deslocamento.
		 */
		// 10000000000000000000000011001000 equivale a -200
		int x = -200;

		/*
		 * Sequ�ncia de bits de x antes do deslocamento.
		 */
		// 10000000000000000000011001000000 equivale a -1600
		x <<= 3;
		System.out.println(x);
	}

	/**
	 * O deslocamento � direita sem sinal n�o mant�m o sinal do n�mero, pois
	 * desloca at� o bit da estrema esquerda, que � o respons�vel por determinar
	 * o sinal. Desta forma, um n�mero positivo pode se tornar negativo e
	 * vice-versa.
	 */
	public void deslocamentoADireitaSemSinal() {
		/*
		 * Sequ�ncia de bits antes do deslocamento
		 */
		// 00010000 (16)
		// 10010000
		byte x = 16;
		byte y = -16;

		/*
		 * Sequ�ncia de bits ap�s o deslocamento
		 */
		// 00000010 (2)
		// 00010010
		x >>>= 3;
		y >>>= 3;

		System.out.println(x);
		System.out.println(y);
	}
}
