package strings;

public class Strings {

	public static void main(String... args) {
		Strings s = new Strings();
		s.poolDeStrings();
		s.metodosString();
	}

	public void poolDeStrings() {
		/*
		 * Um objeto do tipo String � criado e inserido no pool.
		 */
		String s = "abc";

		/*
		 * Dois objetos Strings s�o criados, um ser� inserido no pool ('def'), e
		 * o outro objeto ser� inserido na mem�ria normal.
		 */
		String s2 = new String("def");

		System.out.println(s + s2);
	}

	public void metodosString() {
		String s = "Matheus Gomes G�es";
		/*
		 * O m�todo substring recebe dois �ndices. O primeiro se inicia em 0, e
		 * o segundo se inicia em 1.
		 */
		System.out.println(s.substring(0, 10)); // Matheus Go
	}

}
