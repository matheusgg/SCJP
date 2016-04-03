/**
 * O deslocamento de bits altera a sequência de bits armazenada em uma variável.
 * É possível utilizá-lo apenas com números inteiros. Para deslocar um valor,
 * basta transformá-lo em binário, e deslocar todos os números '1', para a
 * direita ou para a esquerda, com exceção do último bit, que representa o
 * sinal. Os operadores '>>', '<<' e '>>>' são chamados de operadores bite-wise.
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
		 * Sequência de bits de x antes do deslocamento.
		 */
		// 00000000000000000000000000010000 (base 2)
		int x = 16;

		/*
		 * Sequência de bits de x depois do deslocamento.
		 */
		// 00000000000000000000000000000100 (base 2)
		x = x >> 2; // Deslocando 2 bits para a direita
		System.out.println(x);
	}

	public void deslocamentoAEsquerdaComSinal() {
		/*
		 * Sequência de bits de x antes do deslocamento.
		 */
		// 10000000000000000000000011001000 equivale a -200
		int x = -200;

		/*
		 * Sequência de bits de x antes do deslocamento.
		 */
		// 10000000000000000000011001000000 equivale a -1600
		x <<= 3;
		System.out.println(x);
	}

	/**
	 * O deslocamento à direita sem sinal não mantém o sinal do número, pois
	 * desloca até o bit da estrema esquerda, que é o responsável por determinar
	 * o sinal. Desta forma, um número positivo pode se tornar negativo e
	 * vice-versa.
	 */
	public void deslocamentoADireitaSemSinal() {
		/*
		 * Sequência de bits antes do deslocamento
		 */
		// 00010000 (16)
		// 10010000
		byte x = 16;
		byte y = -16;

		/*
		 * Sequência de bits após o deslocamento
		 */
		// 00000010 (2)
		// 00010010
		x >>>= 3;
		y >>>= 3;

		System.out.println(x);
		System.out.println(y);
	}
}
