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
			j.correr(null); // O m�todo de JogadorDeFutebol ser� invocado
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
	 * Sobrescrita V�lida. M�todos das subclasses podem sobrescrever os m�todos
	 * da superclasse e declarar exce��es n�o verificadas de tempo de execu��o,
	 * mesmo que estas exce��es n�o estejam declaradas no m�todo da classe pai.
	 * � poss�vel declarar uma ou v�rios checked exceptions no m�todo
	 * sobrescrito desde que estas exce��es sejam iguais ou menos abrangentes do
	 * que as exce��es declaradas no m�todo da classe pai. Nesta caso,
	 * IOException abrange tanto IOException quanto FileAlreadyExistsException,
	 * isso � v�lido.
	 */
	public ArrayList<String> correr(List<Integer> lista) throws IOException, FileAlreadyExistsException, ArithmeticException {
		int x = 10 / 0;
		System.out.println("JogadorDeFutebol.correr() " + x);
		return null;
	}
}
