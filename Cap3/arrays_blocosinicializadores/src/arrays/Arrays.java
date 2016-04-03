package arrays;
public class Arrays {

	public static void main(String[] args) {
		Arrays a = new Arrays();
		a.arraysBidimensionais();
		a.arraysBidimensionais2();
		a.sintaxesArrays();
	}

	/*
	 * Arrays bidimensionais nada mais s�o do que arrays dentro de outro array.
	 */
	public void arraysBidimensionais() {
		/*
		 * N�o � necess�rio definir um tamanho para os arrays que ser�o
		 * armazenados em cada posi��o do vetor. A �nica obrigatoriedade �
		 * definir o tamanho do array que ser� atribu�do � vari�vel de
		 * refer�ncia array.
		 */
		int[][] array = new int[3][];
		array[0] = new int[2]; // Dentro da posi��o 0 de array � armazenado a
								// refer�ncia para outro vetor de tamanho 5
		array[0][0] = 1;
		array[0][1] = 2;
		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		array[1] = new int[3];
		array[1][0] = 3;
		array[1][1] = 4;
		array[1][2] = 5;
		System.out.println(array[1][0]);
		System.out.println(array[1][1]);
		System.out.println(array[1][2]);
	}

	public void arraysBidimensionais2() {
		/*
		 * Desta forma, o array j� � inicializado. Isto �, cada posi��o de vetor
		 * possui outro array de tamanho 2.
		 */
		int[][] vetor = new int[2][2];
		System.out.println(vetor[0][0]);
		System.out.println(vetor[0][1]);
		System.out.println(vetor[1][0]);
		System.out.println(vetor[1][1]);
	}

	public void sintaxesArrays() {
		int x = new int[] { 2, 3, 4 }[2];// Recuperando o elemento da posi��o 2
											// do vetor
		System.out.println(x);

		// Incializando
		int[][] a = { { 2, 3 }, { 5, 6, 7 } }; // Estas duas sintaxes fazem a
												// mesma coisa
		int[][] b;
		b = new int[][] { { 2, 3 }, { 5, 6, 7 } };// Estas duas sintaxes
													// fazem a mesma
													// coisa
		int[] c = {}; // Array com 0 posi��es
		System.out.println(b[1][0]);
		System.out.println(a[0]);
		System.out.println(c[0]);// Lan�a em exce��o de estouro de �ndice
		int[] v = new int[-10];// Lan�a uma exce��o de tamanho negativo do array
		System.out.println(v);
	}
}
