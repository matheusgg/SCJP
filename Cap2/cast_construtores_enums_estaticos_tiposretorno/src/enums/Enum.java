package enums;

public enum Enum {
	UNO;

	/*
	 * � poss�vel declarar outras enums dentro de uma enum.
	 */
	enum Teste {
		DOS, TRES;

		public void metodoTeste() {
			/*
			 * Usando a classe aninhada para criar um objeto.
			 */
			Classe c = Enum.UNO.new Classe();
			c.metodo();
		}

	}

	/*
	 * � poss�vel declarar classes aninhadas dentro de enums.
	 */
	private class Classe {
		public void metodo() {
			System.out.println("Enum.Classe.metodo()");
		}
	}

	/*
	 * M�todo principal dentro de uma enum.
	 */
	public static void main(String[] args) {
		Teste t = Teste.DOS;
		t.metodoTeste();
	}
}
