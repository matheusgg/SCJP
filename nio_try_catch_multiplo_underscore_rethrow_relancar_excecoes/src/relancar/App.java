package relancar;

/**
 * RethRow => Relancar
 * 
 * @author Matheus
 * 
 */
public class App {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		/*
		 * Quando uma excecao nao e modificada no bloco catch e e relancada, o
		 * compilador faz uma analise mais precisa das excecoes que podem ser
		 * lancadas, e apesar de um objeto ser do tipo Exception, o compilador
		 * sabe que este objeto na verdade e de algum tipo declarado no metodo,
		 * e nao do tipo Exception. Toda esta verificacao ocorre em tempo de
		 * compilacao. Neste caso, se a excecao IllegalAccessException for
		 * removida da declaracao do metodo, um erro de compilacao sera gerado.
		 */
		try {
			throw new IllegalAccessException("Exception de acesso...");
		} catch (Exception e) {
			/*
			 * Com isso, um erro de compilacao seria gerado, pois e execao foi
			 * modificada e neste caso o metodo nao declara que lancara uma
			 * Exception.
			 */
			// e = new RuntimeException();
			throw e;
		}
	}

}
