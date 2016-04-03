package strings;

public class Strings {

	public static void main(String... args) {
		Strings s = new Strings();
		s.poolDeStrings();
		s.metodosString();
	}

	public void poolDeStrings() {
		/*
		 * Um objeto do tipo String é criado e inserido no pool.
		 */
		String s = "abc";

		/*
		 * Dois objetos Strings são criados, um será inserido no pool ('def'), e
		 * o outro objeto será inserido na memória normal.
		 */
		String s2 = new String("def");

		System.out.println(s + s2);
	}

	public void metodosString() {
		String s = "Matheus Gomes Góes";
		/*
		 * O método substring recebe dois índices. O primeiro se inicia em 0, e
		 * o segundo se inicia em 1.
		 */
		System.out.println(s.substring(0, 10)); // Matheus Go
	}

}
