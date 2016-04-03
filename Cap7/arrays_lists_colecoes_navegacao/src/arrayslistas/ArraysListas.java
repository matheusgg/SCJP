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
	 * O método toArray() possui duas versões, uma que retorna um array de
	 * Object e outra que retorna uma array de acordo com o tipo do array
	 * informado. Diferente do método asList() de Arrays, toArray() não cria
	 * ligação entre a lista e o array.
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
		 * Não há ligação entre a lista e o array.
		 */
		lista.set(0, 10);
		this.imprimeArrayLista(arrayInteger, lista);
	}

	/**
	 * O método asList() da classe Arrays retorna uma lista contendo os valores
	 * do array informado, porém este método cria uma ligação entre estes dois
	 * objetos de tal forma que, se acontecer alguma modificação em algum deles,
	 * os dois serão afetados, ou seja, o método asList() cria uma lista de
	 * tamanho fixo de acordo com o array. E este tamanho não pode ser
	 * modificado, deste modo, não é possível inserir ou remover elementos da
	 * lista. Quando o array for de tipos primitivos, é criada uma lista
	 * contendo em vetor de tipos primitivos em cada posição da lista.
	 * 
	 */
	public void metodoAsList() {
		Integer[] arrays = { 1, 2, 3, 4, 5 };
		List<Integer> lista = Arrays.asList(arrays);
		this.imprimeArrayLista(arrays, lista);

		arrays[2] = 10; // Modificará a lista e o array
		this.imprimeArrayLista(arrays, lista);

		lista.set(0, 20); // Modificará a lista e o array
		this.imprimeArrayLista(arrays, lista);

		/*
		 * Isto lançará uma exceção em tempo de execução, pois a lista retornada
		 * pelo método asList(), usa o array para armazenar os elementos, desta
		 * forma, não é possível adicionar ou remover itens desta lista.
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
