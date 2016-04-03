package loops;

public class Loops {

	public static void main(String... args) {
		Loops l = new Loops();
		l.loopFor();
		l.loopForAprimorado();
		l.instrucaoContinue();
		l.rotulos();
		l.loopAlfabeto();
	}

	public void loopFor() {
		/*
		 * Partes do loop for: Declara��o e inicializa��o das vari�veis; Teste
		 * condicional; Incremento. � poss�vel chamar m�todos dentro da
		 * declara��o do for. O incremento � executado sempre depois do corpo do
		 * loop.
		 */
		for (int x = 0, y = 1; y >= x; x = this.increment(x)) {
			System.out.println(x);
		}

		System.out.println("==============================");

		/*
		 * � poss�vel colocar qualquer coisa dentro das se��es de declara��o e
		 * incremento do for, por�m, na se��o da condi��o, � poss�vel declarar
		 * apenas um teste booleano.
		 */
		for (int x = 0; x < 4; System.out.println(x)) {
			x++;
			System.out.println("Dentro do loop");
		}

	}

	private int increment(int num) {
		return ++num;
	}

	public void loopForAprimorado() {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int x : array) {
			System.out.println(x);
		}
	}

	public void instrucaoContinue() {
		/*
		 * A instru��o continue faz com que a itera��o atual seja encerrada e a
		 * pr�xima itera��o seja executada imediatamente.
		 */
		for (int i = 0; i < 5; i++) {
			System.out.print("Begin ");
			if (i >= 3) {
				continue;
			}
			System.out.print(">> End\n");
		}
	}

	public void rotulos() {
		int[] array = { 1, 2, 3, 4, 5 };
		int x = 10;
		rotuloWhile: while (x-- > 0) {
			rotuloFor: for (int i : array) {
				if (i == 3) {
					continue rotuloWhile; // A instru��o rotulada deve ficar
											// dentro do loop que possui o
											// r�tulo.
				} else if (x == 7) {
					break rotuloFor;
				}
				System.out.print(i + ", ");
			}
		}
	}

	public void loopAlfabeto() {
		for (char letra = 'a'; letra < 123; letra++) {
			System.out.print(letra + ", ");
		}
	}
}
