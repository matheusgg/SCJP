package declaracoesgenericas;

import java.util.ArrayList;
import java.util.List;

public class DeclaracoesGenericas {

	/**
	 * É possível declarar um tipo parametrizado também no construtor.
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
	 * É possível utilizar tipos genéricos em um nível mais detalhado: nos
	 * métodos. Não é permitido a utilização de caracteres coringas na
	 * declaração do tipo genérico no método. Com esta sintaxe, o tipo do
	 * argumento é descoberto e utilizado para criar a lista.
	 */
	public <T extends Number> void metodoGeneric(T number) {
		List<T> lista = new ArrayList<T>();
		lista.add(number);
		/*
		 * Não é possível adicionar um número desta forma, pois com o apagamento
		 * dos genéricos, não há como a JVM garantir que o tipo errado seja
		 * adicionado em tempo de execução.
		 */
		// lista.add(10l);
		System.out.println(lista);
	}

}
