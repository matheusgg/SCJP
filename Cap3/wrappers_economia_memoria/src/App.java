public class App {
	public static void main(String... args) {
		new App().regraDeEconomiaDeMemoria();
	}

	public void regraDeEconomiaDeMemoria() {
		/*
		 * Quando um objeto wrapper dos tipos Byte, Short, Integer e Long s�o
		 * inicializados de forma literal e este valor cabe em um byte, a
		 * compera��o com o operador de igualdade resultar� em true caso estes
		 * objetos tenham o mesmo valor e forem do mesmo tipo. Isto n�o ocorrer�
		 * com os objetos do tipo Float e Double. � poss�vel utilizar o operador
		 * de compara��o para os tipos Boolean e Character tamb�m.
		 */
		Boolean b = true;
		Boolean b2 = true;
		System.out.println("Boolean:" + (b == b2)); // true

		Character c = 'z';
		Character c2 = 'z';
		System.out.println("Character:" + (c == c2));// true

		Byte by = 120;
		Byte by2 = 120;
		System.out.println("Byte:" + (by == by2));// true

		Short s = 127;
		Short s2 = 127;
		System.out.println("Short:" + (s == s2)); // true

		Integer i = 126;
		Integer i2 = 126;
		System.out.println("Integer:" + (i == i2));// true

		Long l = 127l;
		Long l2 = 127l;
		System.out.println("Long:" + (l == l2));// true

		Float f = 120f;
		Float f2 = 120f;
		System.out.println("Float:" + (f == f2));// false

		Double d = 120d;
		Double d2 = 120d;
		System.out.println("Double:" + (d == d2));// false

	}
}
