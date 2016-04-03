package declaracoesgenericas;

import java.util.ArrayList;
import java.util.List;

public class DeclaracoesGenericas {

	/**
	 * � poss�vel declarar um tipo parametrizado tamb�m no construtor.
	 */
	public <T> DeclaracoesGenericas(T t) {
		System.out.println(t);
	}

	public DeclaracoesGenericas() {

	}

	public static void main(String... args) {
		DeclaracoesGenericas d = new DeclaracoesGenericas();
		d.classeGenerica();
		d.testeMetodoGenerico();
	}

	public void testeMetodoGenerico() {
		this.metodoGeneric(20l);
	}

	public void classeGenerica() {
		FuckList<Integer> lista = new FuckList<>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.remove(30);
		lista.add(40);
		System.out.println(lista.get(2));
		System.out.println(lista);
	}

	/**
	 * � poss�vel utilizar tipos gen�ricos em um n�vel mais detalhado: nos
	 * m�todos. N�o � permitido a utiliza��o de caracteres coringas na
	 * declara��o do tipo gen�rico no m�todo. Com esta sintaxe, o tipo do
	 * argumento � descoberto e utilizado para criar a lista.
	 */
	public <T extends Number> void metodoGeneric(T number) {
		List<T> lista = new ArrayList<T>();
		lista.add(number);
		/*
		 * N�o � poss�vel adicionar um n�mero desta forma, pois com o apagamento
		 * dos gen�ricos, n�o h� como a JVM garantir que o tipo errado seja
		 * adicionado em tempo de execu��o.
		 */
		// lista.add(10l);
		System.out.println(lista);
	}

}
