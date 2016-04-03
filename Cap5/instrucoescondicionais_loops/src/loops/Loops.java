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
		 * Partes do loop for: Declaração e inicialização das variáveis; Teste
		 * condicional; Incremento. É possível chamar métodos dentro da
		 * declaração do for. O incremento é executado sempre depois do corpo do
		 * loop.
		 */
		for (int x = 0, y = 1; y >= x; x = this.increment(x)) {
			System.out.println(x);
		}

		System.out.println("==============================");

		/*
		 * É possível colocar qualquer coisa dentro das seções de declaração e
		 * incremento do for, porém, na seção da condição, é possível declarar
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
		 * A instrução continue faz com que a iteração atual seja encerrada e a
		 * próxima iteração seja executada imediatamente.
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
					continue rotuloWhile; // A instrução rotulada deve ficar
											// dentro do loop que possui o
											// rótulo.
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
