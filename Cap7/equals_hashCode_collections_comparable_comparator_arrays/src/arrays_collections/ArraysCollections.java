package arrays_collections;

import java.util.Arrays;

public class ArraysCollections {

	public static void main(String... args) {
		ArraysCollections ac = new ArraysCollections();
		ac.buscaBinaria();
	}

	/**
	 * Para realizar buscas binárias, o array deve estar previamente ordenado,
	 * caso contrário, o resultado da busca pode ser imprevisível. Valores a
	 * partir de 0 significam que a busca foi bem sucedida. Valores abaixo de 0
	 * significam que a busca foi mal-sucedida. Quando o array for ordenado a
	 * partir de um Comparator, é necessário passar este Comparator ao método de
	 * busca, caso contrário, a pesquisa será mal-sucedida e retornará um valor
	 * negativo.
	 */
	public void buscaBinaria() {
		String[] array = { "one", "two", "three", "four" };

		for (String string : array) {
			System.out.print(string + ", ");
		}

		/*
		 * OBS.: Não é possível passar um Comparator para o método sort() quando
		 * um array de tipos primitivos é informado. O mesmo ocorre com o método
		 * binarySearch(). Chamadas inválidas:
		 */
		// Arrays.sort(new int[]{1,2,3}, new Comparador());
		// Arrays.binarySearch(new int[]{1,2,3}, 1, new Comparador());

		Arrays.sort(array); // Ordenação
		System.out.println("\nOrdenando...");

		for (String string : array) {
			System.out.print(string + ", ");
		}

		int index = Arrays.binarySearch(array, "one"); // Busca
		System.out.println("\nÍndice: " + index);
	}

}
