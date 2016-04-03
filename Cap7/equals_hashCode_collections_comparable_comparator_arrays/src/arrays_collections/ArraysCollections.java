package arrays_collections;

import java.util.Arrays;

public class ArraysCollections {

	public static void main(String... args) {
		ArraysCollections ac = new ArraysCollections();
		ac.buscaBinaria();
	}

	/**
	 * Para realizar buscas bin�rias, o array deve estar previamente ordenado,
	 * caso contr�rio, o resultado da busca pode ser imprevis�vel. Valores a
	 * partir de 0 significam que a busca foi bem sucedida. Valores abaixo de 0
	 * significam que a busca foi mal-sucedida. Quando o array for ordenado a
	 * partir de um Comparator, � necess�rio passar este Comparator ao m�todo de
	 * busca, caso contr�rio, a pesquisa ser� mal-sucedida e retornar� um valor
	 * negativo.
	 */
	public void buscaBinaria() {
		String[] array = { "one", "two", "three", "four" };

		for (String string : array) {
			System.out.print(string + ", ");
		}

		/*
		 * OBS.: N�o � poss�vel passar um Comparator para o m�todo sort() quando
		 * um array de tipos primitivos � informado. O mesmo ocorre com o m�todo
		 * binarySearch(). Chamadas inv�lidas:
		 */
		// Arrays.sort(new int[]{1,2,3}, new Comparador());
		// Arrays.binarySearch(new int[]{1,2,3}, 1, new Comparador());

		Arrays.sort(array); // Ordena��o
		System.out.println("\nOrdenando...");

		for (String string : array) {
			System.out.print(string + ", ");
		}

		int index = Arrays.binarySearch(array, "one"); // Busca
		System.out.println("\n�ndice: " + index);
	}

}
