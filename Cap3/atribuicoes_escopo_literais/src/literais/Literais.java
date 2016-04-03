package literais;

public class Literais {
	public static void main(String[] args) {
		Literais l = new Literais();
		l.baseOctal();
		l.baseHexadecimal();
		l.literaisTipoChar();
	}

	/*
	 * Literais octais possuem um 0 na frente do n�mero e v�o de 0 � 7. �
	 * poss�vel utilizar at� 21 d�gitos sem contar o zero na frente.
	 */
	public void baseOctal() {
		int seis = 06; // igual ao decimal 6
		int sete = 07; // igual ao decimal 7
		int oito = 010; // igual ao decimal 8
		int nove = 011; // igual ao decimal 9
		// System.out.println(08); Erro de compila��o, pois a base octal em Java
		// vai de 0 at� 7.
		System.out.println(seis);
		System.out.println(sete);
		System.out.println(oito);
		System.out.println(nove);
		System.out.println(025); // 21
	}

	/*
	 * Literais de base hexadecimal possuem o prefixo 0x seguidos de at� 16
	 * d�gitos. Em Java eles v�o de 0 � F. (0 1 2 3 4 5 6 7 8 9 A B C D E F).
	 * N�o h� diferen�a entre letras mai�sculas ou min�sculas neste caso.
	 */
	public void baseHexadecimal() {
		int a = 0x75846;
		int b = 0xcafe; // N�o h� diferen�as entre estas duas literais
		int c = 0XCaFe; // N�o h� diferen�as entre estas duas literais
		int d = 0x111111;
		long e = 0x657645364777l; // � poss�vel declarar literais hexadecimais
									// do tipo long com o sufixo l ou L
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

	/*
	 * Literais do tipo char possuem 16 bits e v�o de 0 a 2^16-1. Elas trabalham
	 * de acordo com os caracteres Unicode.
	 */
	public void literaisTipoChar() {
		char a = (char) -10;
		char b = 0xcafe; // atribui��o de uma literal hexadecimal para um char.
		char c = 56;
		char d = 010; // atribui��o de uma literal octal para um char.
		char e = 8; // isto � igual a linha anterior.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
