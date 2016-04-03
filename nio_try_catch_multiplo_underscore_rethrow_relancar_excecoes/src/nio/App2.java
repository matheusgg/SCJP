package nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App2 {
	public static void main(String[] args) throws IOException {
		Path pasta = Paths.get("pasta");
		String filtro = "*.txt";

		/*
		 * Percorrendo uma pasta e listando os arquivos atraves de um filtro.
		 * Neste caso, apenas os arquivos que terminarem com .txt serao
		 * exibidos.
		 */
		DirectoryStream<Path> directory = Files.newDirectoryStream(pasta, filtro);
		for (Path path : directory) {
			System.out.println(path);
		}
	}
}
