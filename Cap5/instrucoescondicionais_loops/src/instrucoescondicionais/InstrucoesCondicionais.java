package instrucoescondicionais;

public class InstrucoesCondicionais {

	public static void main(String... args) {
		InstrucoesCondicionais ic = new InstrucoesCondicionais();
		ic.instrucoesIf();
		ic.instrucoesSwitch();
	}

	public void instrucoesIf() {
		int x = 10;
		if (x == 9) // If sem else
			System.out.println(""); // Instrução do primeiro If
		if (x > 20) // If com else
			System.out.println("Falso"); // Instrução do segundo If
		else
			// else do segundo if
			System.out.println("Else");// Instrução do else do segundo If
		/*
		 * Instrução else sem If (Erro de Compilação)
		 */
		// else
		// System.out.println("Syso");

		boolean b = false;
		int y;
		if ((y = 10) == 10 && (b = true)) {
			System.out.println(b + " >>>> " + y);
		}
	}

	/**
	 * Não é possível utilizar continue em instruções switch, apenas em loops. É
	 * possível utilizar apenas valores que podem ser convertidos para o tipo
	 * int, Strings ou ENUMS em testes switch. As constantes utilizadas nos
	 * cases devem ser resolvidas em tempo de compilação, isto é, elas devem ser
	 * marcadas como FINAL.
	 */
	public void instrucoesSwitch() {
		final byte a = 8;
		final long b = 127;
		Byte x = 8;
		// Label para o switch
		teste: switch (x) {
		case a: { // Constante literal final de valor 8
			System.out.println("Oito");
			break teste; // Opcional, pois break quebrará o switch
		}
		case (short) b: {// Variável final de valor 9
			System.out.println("Nove");
			break;
		}
		case (int) 10.8: {
			System.out.println("Dez");
			break;
		}
		default: {
			System.out.println("Default!");
		}
		}
		System.out.println("=============================================================");

		byte y = 10;
		byte c = 100;
		switch (y) {
		// case 128: Erro de compilação! 128 é maior do que um byte
		// System.out.println("Case 1");
		// break;
		// case c: Erro de compilação! A variável c não está marcada como final
		// System.out.println("Case 1");
		// break;
		case 10: {
			System.out.println("Case 3");
			break;
		}
		// case 10: Erro de compilação! Não é possível ter dois cases iguais
		// System.out.println("Case 3");
		// break;
		default:
			System.out.println(c);
		}

		System.out.println("=============================================================");
		/*
		 * A instrução default pode aparecer no início, meio ou no fim do switch
		 * case.
		 */
		switch (10) {
		default:
			System.out.println("Default");
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		}

	}
}
