package wrapper;

public class Wrapper {
	public static void main(String[] args) {
		Wrapper w = new Wrapper();
		w.incializandoWrappers();
		w.metodosWrappers();
		w.autoboxing();
		w.comparando();
		w.comparando2();
	}

	/**
	 * Todo tipo primitivo em Java possui uma classe Wrapper. Geralmente toda
	 * classe wrapper possui dois contrutores, um que recebe o tipo primitivo e
	 * outro que recebe uma String. A classe Float possui tr�s construtores,
	 * inclu�do um que recebe um double. J� a classe Character possui apenas um
	 * construtor. As vari�veis de refer�ncia do tipo wrapper podem ser
	 * inicializadas com valores literais.
	 */
	public void incializandoWrappers() {
		Boolean booleano = new Boolean(true);
		Byte b = new Byte("126");
		Short s = new Short("32000");
		Character c = new Character('c');
		Integer i = new Integer("400");
		Long l = new Long("4000");
		Float f = new Float("56.7f");
		Double d = new Double("54.3");

		if (booleano) {
			System.out.println(b);
			System.out.println(s);
			System.out.println(c);
			System.out.println(i);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);
		}

		// Incializando com valores literais
		booleano = false;
		b = 126;
		c = 'c';
		i = 400;
		l = 4000l;
		f = 56.7f;
		d = 54.3;
	}

	public void metodosWrappers() {
		/*
		 * Converte o valor informado em um objeto do tipo int de acordo com a
		 * base informada
		 */
		Integer i = Integer.valueOf("012", 8);// Base octal - Sa�da: 10
		System.out.println(i);
		i = Integer.valueOf("10", 2); // Base Bin�ria - Sa�da: 2
		System.out.println(i);
	}

	public void autoboxing() {
		/*
		 * � poss�vel usar o autoboxing para atribuir valores menores a um
		 * determinado tipo.
		 */
		Integer i1 = (int) new Byte("10");
		System.out.println(i1);
		Integer i2 = (int) new Short("30");
		System.out.println(i2);
		Integer i3 = (int) new Character('a');
		System.out.println(i3);
		// Integer i4 = (int) new Long(10l); Erro de compila��o. Long � maior do
		// que um integer
		Double d = (double) new Long(10l);
		System.out.println(d);
	}

	public void comparando() {
		Integer i1 = new Integer(1000);
		Integer i2 = new Integer(1000);
		System.out.println(i1 == i2); // false
		System.out.println(i1.equals(i2)); // true
		i1 = 100;
		i2 = 100;
		System.out.println(i1 == i2);// true, pois os valores s�o menores do que
										// o valor m�ximo de um byte.
		System.out.println(i1 != i2); // false, pois os valores s�o menores do
										// que o valor m�ximo de um byte.

		/*
		 * Valores declarados de forma literal que cabem em um byte, sempre
		 * resultar�o em true na compara��o com ==. Caso o valor seja maior que
		 * um byte, a compara��o resultar� em false.
		 */
		Integer ii1 = 128;
		Integer ii2 = 128;
		System.out.println(ii1 != ii2); // true
		System.out.println(ii1 == ii2); // false
	}

	/**
	 * Compara��o entre primitivos e wrappers do mesmo tipo e mesmo valor
	 * utilizando o operador == sempre resultar� em true, independentemente de o
	 * valor ser maior do que um byte. Pois neste caso, � feito o
	 * desempacotamento autom�tico na hora da compara��o, deste modo, o que est�
	 * sendo realmente comparado s�o dois valores primitivos.
	 */
	public void comparando2() {
		int i = 10;
		Integer I2 = 10;
		System.out.println(i == I2);// true

		int i2 = 1000;
		Integer I3 = 1000;
		System.out.println(i2 == I3); // true

		int i3 = 1000;
		Integer I4 = new Integer(1000);
		System.out.println(i3 == I4); // true
	}
}
