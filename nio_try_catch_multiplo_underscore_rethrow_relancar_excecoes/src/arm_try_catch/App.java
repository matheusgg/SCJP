package arm_try_catch;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		/*
		 * Qualquer classe que implementa a interface AutoClosable pode ser
		 * gerenciada pelo try. Nestes casos, nao e obrigatorio um bloco catch e
		 * os objetos precisam ser declarados dentro dos parenteses do bloco
		 * try.
		 */
		try (FileReader reader = new FileReader("file.txt"); Inter i = new Inter()) {
			System.out.println(reader);
			System.out.println(i);
		}

		/*
		 * Com o Multicatch, e possivel tratar varias excecoes da mesma forma em
		 * um unico bloco catch.
		 */
		try {
			throw new IllegalArgumentException("Excecao lancada...");
		} catch (NullPointerException | IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}

class Inter implements Closeable {

	/*
	 * Com o Gerenciamento Automatico de recursos, este metodo sera invocado
	 * automaticamente pela JVM
	 */
	@Override
	public void close() throws IOException {
		System.out.println("Fechando a conexao...");
	}

}
