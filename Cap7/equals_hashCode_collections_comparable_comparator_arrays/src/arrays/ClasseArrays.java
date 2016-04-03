package arrays;

import java.util.Arrays;

public class ClasseArrays {
	public static void main(String[] args) {
		ClasseArrays a = new ClasseArrays();
		a.arrays();
	}

	public void arrays() {
		Object[] o = { new Casa("Endere�o 2"), new Predio("Endere�o 1") };
		for (Object object : o) {
			System.out.println(object);
		}
		Arrays.sort(o);
		for (Object object : o) {
			System.out.println(object);
		}

		/*
		 * N�o � poss�vel comparar um array com objetos diferentes. Isso lan�ar�
		 * uma exce��o em tempo de execu��o.
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
