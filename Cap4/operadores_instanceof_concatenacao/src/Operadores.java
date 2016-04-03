public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Operadores o = new Operadores();
		o.operadores();
		o.operadorInstanceOf();
		o.concatenacao();
	}

	/**
	 * N�o � poss�vel comparar objetos de tipos diferentes, a n�o ser que sejam
	 * tipos primitivos.
	 */
	public void operadores() {
		Byte x = 10;
		Byte y = 10;
		Integer i = 200;
		System.out.println(10 != 10.2);
		System.out.println(10l == 1f);
		System.out.println(x == y);
		// System.out.println(i == y); �nv�lido! Tipos diferentes
		System.out.println(i == 10f); // Aqui � feito o unboxing autom�tico

		boolean b = false;
		if (b = true) {
			System.out.println("Valor de b >>>>>>> " + b);
		}
		if ((i = 30) < 100) {
			System.out.println("Valor de i >>>>>>> " + i);
		}
	}

	public void operadorInstanceOf() {
		String s = null;
		System.out.println(s instanceof String); // false
		System.out.println(null instanceof Object); // false

		int[] i = new int[10];
		System.out.println(i instanceof int[]);// true

		String[] ss = new String[10];
		System.out.println(ss instanceof String[]);// true

		A[] a = new B[10];
		System.out.println(a instanceof B[]); // true
	}

	/**
	 * A concatena��o ocorre da esquerda para a direita. Caso os operandos sejam
	 * n�meros, eles s�o somados. Caso contr�rio, s�o concatenados.
	 */
	public void concatenacao() {
		System.out.println("" + 10 + 6); // 106
		System.out.println(10 + 6 + ""); // 16
	}
}

class A {

}

class B extends A {

}
