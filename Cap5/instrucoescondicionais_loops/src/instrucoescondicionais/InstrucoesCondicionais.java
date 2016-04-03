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
			System.out.println(""); // Instru��o do primeiro If
		if (x > 20) // If com else
			System.out.println("Falso"); // Instru��o do segundo If
		else
			// else do segundo if
			System.out.println("Else");// Instru��o do else do segundo If
		/*
		 * Instru��o else sem If (Erro de Compila��o)
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
	 * N�o � poss�vel utilizar continue em instru��es switch, apenas em loops. �
	 * poss�vel utilizar apenas valores que podem ser convertidos para o tipo
	 * int, Strings ou ENUMS em testes switch. As constantes utilizadas nos
	 * cases devem ser resolvidas em tempo de compila��o, isto �, elas devem ser
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
			break teste; // Opcional, pois break quebrar� o switch
		}
		case (short) b: {// Vari�vel final de valor 9
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
		// case 128: Erro de compila��o! 128 � maior do que um byte
		// System.out.println("Case 1");
		// break;
		// case c: Erro de compila��o! A vari�vel c n�o est� marcada como final
		// System.out.println("Case 1");
		// break;
		case 10: {
			System.out.println("Case 3");
			break;
		}
		// case 10: Erro de compila��o! N�o � poss�vel ter dois cases iguais
		// System.out.println("Case 3");
		// break;
		default:
			System.out.println(c);
		}

		System.out.println("=============================================================");
		/*
		 * A instru��o default pode aparecer no in�cio, meio ou no fim do switch
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
