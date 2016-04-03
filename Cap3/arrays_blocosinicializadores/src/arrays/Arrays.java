package arrays;
public class Arrays {

	public static void main(String[] args) {
		Arrays a = new Arrays();
		a.arraysBidimensionais();
		a.arraysBidimensionais2();
		a.sintaxesArrays();
	}

	/*
	 * Arrays bidimensionais nada mais são do que arrays dentro de outro array.
	 */
	public void arraysBidimensionais() {
		/*
		 * Não é necessário definir um tamanho para os arrays que serão
		 * armazenados em cada posição do vetor. A única obrigatoriedade é
		 * definir o tamanho do array que será atribuído à variável de
		 * referência array.
		 */
		int[][] array = new int[3][];
		array[0] = new int[2]; // Dentro da posição 0 de array é armazenado a
								// referência para outro vetor de tamanho 5
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
		 * Desta forma, o array já é inicializado. Isto é, cada posição de vetor
		 * possui outro array de tamanho 2.
		 */
		int[][] vetor = new int[2][2];
		System.out.println(vetor[0][0]);
		System.out.println(vetor[0][1]);
		System.out.println(vetor[1][0]);
		System.out.println(vetor[1][1]);
	}

	public void sintaxesArrays() {
		int x = new int[] { 2, 3, 4 }[2];// Recuperando o elemento da posição 2
											// do vetor
		System.out.println(x);

		// Incializando
		int[][] a = { { 2, 3 }, { 5, 6, 7 } }; // Estas duas sintaxes fazem a
												// mesma coisa
		int[][] b;
		b = new int[][] { { 2, 3 }, { 5, 6, 7 } };// Estas duas sintaxes
													// fazem a mesma
													// coisa
		int[] c = {}; // Array com 0 posições
		System.out.println(b[1][0]);
		System.out.println(a[0]);
		System.out.println(c[0]);// Lança em exceção de estouro de índice
		int[] v = new int[-10];// Lança uma exceção de tamanho negativo do array
		System.out.println(v);
	}
}
