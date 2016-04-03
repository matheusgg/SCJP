package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args) throws IOException {
		// Semelhantemente ao File, Path representa um arquivo ou diretorio
		Path pasta = Paths.get("pasta");
		Path file1 = pasta.resolve("file.txt");
		Path file2 = pasta.resolve("file2.txt");
		Path fileBkp = pasta.resolve("fileBkp.txt");

		// Removendo se existir...
		Files.deleteIfExists(file2);

		// Criando um arquivo
		Path arquivo2 = pasta.resolve("file2.txt");
		Files.createFile(arquivo2);

		// Removendo se existir...
		Files.deleteIfExists(fileBkp);

		// Copiar um arquivo
		Files.copy(file1, fileBkp);

		// Movendo um arquivo
		Path pasta2 = Paths.get("pasta2/file2.txt");
		Files.deleteIfExists(pasta2);
		Files.move(file2, pasta2);

		System.out.println("OK");
	}
}
