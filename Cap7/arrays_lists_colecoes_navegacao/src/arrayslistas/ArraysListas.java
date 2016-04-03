package arrayslistas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListas {

	public static void main(String... args) {
		ArraysListas al = new ArraysListas();
		// al.metodoAsList();
		al.metodoToArray();
	}

	/**
	 * O m�todo toArray() possui duas vers�es, uma que retorna um array de
	 * Object e outra que retorna uma array de acordo com o tipo do array
	 * informado. Diferente do m�todo asList() de Arrays, toArray() n�o cria
	 * liga��o entre a lista e o array.
	 */
	public void metodoToArray() {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			lista.add(i);
		}

		Object[] arrayObject = lista.toArray(); // retorna um array de Object.
		System.out.println(arrayObject[4]);

		/*
		 * Retorna um array do tipo informado.
		 */
		Integer[] arrayInteger = lista.toArray(new Integer[] {});

		/*
		 * N�o h� liga��o entre a lista e o array.
		 */
		lista.set(0, 10);
		this.imprimeArrayLista(arrayInteger, lista);
	}

	/**
	 * O m�todo asList() da classe Arrays retorna uma lista contendo os valores
	 * do array informado, por�m este m�todo cria uma liga��o entre estes dois
	 * objetos de tal forma que, se acontecer alguma modifica��o em algum deles,
	 * os dois ser�o afetados, ou seja, o m�todo asList() cria uma lista de
	 * tamanho fixo de acordo com o array. E este tamanho n�o pode ser
	 * modificado, deste modo, n�o � poss�vel inserir ou remover elementos da
	 * lista. Quando o array for de tipos primitivos, � criada uma lista
	 * contendo em vetor de tipos primitivos em cada posi��o da lista.
	 * 
	 */
	public void metodoAsList() {
		Integer[] arrays = { 1, 2, 3, 4, 5 };
		List<Integer> lista = Arrays.asList(arrays);
		this.imprimeArrayLista(arrays, lista);

		arrays[2] = 10; // Modificar� a lista e o array
		this.imprimeArrayLista(arrays, lista);

		lista.set(0, 20); // Modificar� a lista e o array
		this.imprimeArrayLista(arrays, lista);

		/*
		 * Isto lan�ar� uma exce��o em tempo de execu��o, pois a lista retornada
		 * pelo m�todo asList(), usa o array para armazenar os elementos, desta
		 * forma, n�o � poss�vel adicionar ou remover itens desta lista.
		 */
		lista.add(30);
		lista.remove(10);
		this.imprimeArrayLista(arrays, lista);

	}

	private void imprimeArrayLista(Integer[] arrays, List<Integer> lista) {
		System.out.print("Array - [");
		for (Integer i : arrays) {
			System.out.print(i + ", ");
		}
		System.out.print("]");

		System.out.println("\nLista - " + lista + "\n\n");
	}
}
