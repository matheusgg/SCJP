package excecoes;

public class Excecoes {

	public static void main(String... args) {
		Excecoes e = new Excecoes();
		try {
			e.tratamentoExcecoes();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}

		try {
			String word = e.reverse("Matheus");
			System.out.println(word);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			System.out.println("Teste finalizado!");
		}

		e.metodoThrowable();

		try {
			e.metodoError();
		} catch (Error ex) {
			ex.printStackTrace();
		}

		try {
			e.go();
		} catch (Error ex) {
			System.err.println("ERRO!!!");
		}

		System.out.println("FIM >>>>> " + Runtime.getRuntime().freeMemory());
	}

	/**
	 * Isso gerar� um erro StackOverFlowError
	 */
	public void go() {
		this.go();
	}

	/**
	 * Throwable pode ser capturada ou declarada da mesma forma que uma
	 * Exception.
	 */
	public void metodoThrowable() {
		try {
			int x = (int) (Math.random() * 100);
			if (x > 30) {
				throw new Throwable("Throwable lan�ada!!!");
			}
		} catch (Throwable t) {
			t.printStackTrace();
			/*
			 * Erro de compila��o! Throwables e checked exceptions precisam ser
			 * tratadas ou declaradas.
			 */
			// throw new Throwable("ERRO declarado!!!");
		}
	}

	/**
	 * Erros podem ser lan�ados como qualquer outra exce��o, por�m s�o
	 * semelhantes as unchecked exceptions, pois n�o precisam ser declarados ou
	 * tratados.
	 */
	public void metodoError() {
		try {
			int x = (int) (Math.random() * 100);
			if (x > 30) {
				throw new Error("Ocorreu um ERRO!!!");
			}
		} catch (Error e) {
			e.printStackTrace();
			/*
			 * Erros n�o precisam ser tratados ou declarados.
			 */
			throw new Error("ERRO lan�ado!!!");
		}
	}

	/**
	 * N�o � obrigat�rio tratar ou declarar uma unchecked exception. Neste caso,
	 * o bloco finally ser� executado de qualquer forma. Quando h� um tipo de
	 * retorno e blocos catch, cada bloco precisa retornar algo. Caso contr�rio,
	 * o �nico bloco que precisar� de um retorno ser� o bloco try.
	 * 
	 * @return
	 * @throws ArithmeticException
	 */
	public int tratamentoExcecoes() throws ArithmeticException {
		try {
			int x = 10 / 0;
			return x;
		} catch (ArithmeticException e) {
			int x = 10 / 0;
			/*
			 * Caso algum catch seja declarado, � necess�rio um retorno.
			 */
			return x;
		} finally { // Ser� executado de qualquer forma.
			System.out.println("Finalmente");
		}
	}

	public String reverse(String word) {
		String reverseWord = "";
		if (word == null || word.length() == 0) {
			throw new IllegalArgumentException("String vazia!!!");
		} else {
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord += word.charAt(i);
			}
			return reverseWord;
		}
	}
}
