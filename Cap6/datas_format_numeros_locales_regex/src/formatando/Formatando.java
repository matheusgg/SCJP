package formatando;

import java.util.Scanner;

public class Formatando {

	public static void main(String... args) {
		Formatando f = new Formatando();
		f.testeScanner();
		f.testeFormat();
	}

	/**
	 * %[indice$][flags][width][.precisao] caractere de conversão
	 */
	public void testeFormat() {
		// Índices
		System.out.format("%2$s %1$s", "Gomes", "Matheus");

		// Flag - : distância entre dois textos
		System.out.format("\n%-20s %s", "Matheus", "Gomes");

		// Flag width: distância da margem esquerda
		System.out.format("\n%20s", "Matheus");

		// Flag 0: Preenche as casas com 0
		System.out.format("\n%010d", 1);

		// Flag + : Coloca o sinal de + ou - no número
		System.out.format("\n%+d", 80);

		// Flag + : Coloca o sinal de + ou - no número
		System.out.format("\n%+d", -80);

		// Flag ( : Coloca o valor negativo entre parênteses
		System.out.format("\n%(d", -80);

		// Precisão
		System.out.format("\n%.2f", 456.5826376);
	}

	/**
	 * O delimitador da classe Scanner por padrão é o espaço em branco ( ),
	 * porém é possível alterá-lo.
	 */
	public void testeScanner() {
		Scanner scan = new Scanner("jabdha;s5236;23;kbhj7;3y21;8ujhf82;2r387y");
		scan.useDelimiter(";"); // Altera o delimitador
		while (scan.hasNext()) {
			if (scan.hasNextInt()) {
				System.err.print("int");
			} else {
				System.out.print("texto");
			}
			scan.next();
		}
		scan.close();

		System.out.println("\n==============================================");

		scan = new Scanner("jabdha;s5236;23;kbhj7;3y21;8ujhf82;2r387y");
		scan.useDelimiter(";"); // Altera o delimitador
		while (scan.hasNext()) {
			/*
			 * Tenta encontra uma ocorrência deste padrão ignorando qualquer
			 * delimitador.
			 */
			String found = scan.findInLine("\\d+"); // Ignora o delimitador
			if (found != null) {
				System.out.println(found);
			} else {
				break;
			}
		}
		scan.close();
	}

}
