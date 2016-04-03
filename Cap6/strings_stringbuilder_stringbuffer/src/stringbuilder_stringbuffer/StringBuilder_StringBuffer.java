package stringbuilder_stringbuffer;

/**
 * StringBuffer e StringBuilder possuem a mesma API, a �nica diferen�a entre as
 * duas � que os m�todos de StringBuffer s�o thread safe, equanto os m�todos de
 * StringBuilder n�o s�o. Desta forma, � recomendado a utiliza��o de
 * StringBuilder, pois trabalha de forma mais r�pida em rela��o a StringBuffer,
 * por�m essas duas classes n�o possuem diferen�as em rela��o a API.
 * 
 * @author Matheus
 * 
 */
public class StringBuilder_StringBuffer {
	public static void main(String... args) {
		StringBuilder_StringBuffer ss = new StringBuilder_StringBuffer();
		ss.metodos();
	}

	public void metodos() {
		StringBuilder sb = new StringBuilder("Matheus");
		sb.insert(7, " Gomes "); // Insere em uma determinada posi��o
		sb.append("G�es"); // Concatena

		System.out.println(sb);

		sb.delete(7, 13); // Remove uma substring

		System.out.println(sb);
	}
}
