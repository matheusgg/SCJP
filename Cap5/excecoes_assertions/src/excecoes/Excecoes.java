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
	 * Isso gerará um erro StackOverFlowError
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
				throw new Throwable("Throwable lançada!!!");
			}
		} catch (Throwable t) {
			t.printStackTrace();
			/*
			 * Erro de compilação! Throwables e checked exceptions precisam ser
			 * tratadas ou declaradas.
			 */
			// throw new Throwable("ERRO declarado!!!");
		}
	}

	/**
	 * Erros podem ser lançados como qualquer outra exceção, porém são
	 * semelhantes as unchecked exceptions, pois não precisam ser declarados ou
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
			 * Erros não precisam ser tratados ou declarados.
			 */
			throw new Error("ERRO lançado!!!");
		}
	}

	/**
	 * Não é obrigatório tratar ou declarar uma unchecked exception. Neste caso,
	 * o bloco finally será executado de qualquer forma. Quando há um tipo de
	 * retorno e blocos catch, cada bloco precisa retornar algo. Caso contrário,
	 * o único bloco que precisará de um retorno será o bloco try.
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
			 * Caso algum catch seja declarado, é necessário um retorno.
			 */
			return x;
		} finally { // Será executado de qualquer forma.
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
