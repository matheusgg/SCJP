package stringbuilder_stringbuffer;

/**
 * StringBuffer e StringBuilder possuem a mesma API, a única diferença entre as
 * duas é que os métodos de StringBuffer são thread safe, equanto os métodos de
 * StringBuilder não são. Desta forma, é recomendado a utilização de
 * StringBuilder, pois trabalha de forma mais rápida em relação a StringBuffer,
 * porém essas duas classes não possuem diferenças em relação a API.
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
		sb.insert(7, " Gomes "); // Insere em uma determinada posição
		sb.append("Góes"); // Concatena

		System.out.println(sb);

		sb.delete(7, 13); // Remove uma substring

		System.out.println(sb);
	}
}
