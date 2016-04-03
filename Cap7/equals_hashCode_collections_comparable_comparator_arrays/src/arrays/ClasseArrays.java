package arrays;

import java.util.Arrays;

public class ClasseArrays {
	public static void main(String[] args) {
		ClasseArrays a = new ClasseArrays();
		a.arrays();
	}

	public void arrays() {
		Object[] o = { new Casa("Endereço 2"), new Predio("Endereço 1") };
		for (Object object : o) {
			System.out.println(object);
		}
		Arrays.sort(o);
		for (Object object : o) {
			System.out.println(object);
		}

		/*
		 * Não é possível comparar um array com objetos diferentes. Isso lançará
		 * uma exceção em tempo de execução.
		 */
		Object[] o2 = { "3", 10 };
		for (Object object : o2) {
			System.out.println(object);
		}
		Arrays.sort(o2);
		for (Object object : o2) {
			System.out.println(object);
		}
	}

}
