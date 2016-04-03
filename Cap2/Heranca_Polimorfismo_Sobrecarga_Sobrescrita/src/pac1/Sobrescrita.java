package pac1;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Sobrescrita {
	public static void main(String[] args) {
		Jogador j = new JogadorDeFutebol();
		try {
			j.correr(null); // O método de JogadorDeFutebol será invocado
		} catch (ArithmeticException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}

class Jogador {
	protected List<String> correr(List<Integer> lista) throws IOException, SQLException {
		System.out.println("Jogador.correr()");
		return null;
	}
}

class JogadorDeFutebol extends Jogador {
	/*
	 * Sobrescrita Válida. Métodos das subclasses podem sobrescrever os métodos
	 * da superclasse e declarar exceções não verificadas de tempo de execução,
	 * mesmo que estas exceções não estejam declaradas no método da classe pai.
	 * É possível declarar uma ou vários checked exceptions no método
	 * sobrescrito desde que estas exceções sejam iguais ou menos abrangentes do
	 * que as exceções declaradas no método da classe pai. Nesta caso,
	 * IOException abrange tanto IOException quanto FileAlreadyExistsException,
	 * isso é válido.
	 */
	public ArrayList<String> correr(List<Integer> lista) throws IOException, FileAlreadyExistsException, ArithmeticException {
		int x = 10 / 0;
		System.out.println("JogadorDeFutebol.correr() " + x);
		return null;
	}
}
