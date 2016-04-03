package tiposGenericos;

import java.util.ArrayList;
import java.util.List;

/**
 * Quando se trabalha com Generics, ocorre uma coisa chamada apagamento dos
 * genéricos, isto é, quando os bytecodes são gerados, todas a informações de
 * tipos parametrizaado são removidas, desta forma é mantida a compatibilidade
 * com códigos antigos e a JVM não tem como saber exatamente o tipo da Lista,
 * por este motivo não é possível passar uma Lista de um subtipo para um método
 * que recebe uma lista de algum supertipo.
 * 
 * @author Matheus
 * 
 */
public class TiposGenericos {
	public static void main(String... args) {
		TiposGenericos t = new TiposGenericos();
		// INVÁLIDO!!!
		// t.testTipos(new ArrayList<Dog>());
		t.caractereCoringa();
	}

	public void caractereCoringa() {
		this.metodo(new ArrayList<Dog>());
		this.metodo(new ArrayList<Animal>());

		/*
		 * Estas três listas são de algo que é do tipo, ou supertipo, de Dog.
		 */
		this.metodo2(new ArrayList<Dog>());
		this.metodo2(new ArrayList<Animal>());
		this.metodo2(new ArrayList<Object>());

		this.metodo3(new ArrayList<Cat>());
		this.metodo4(new ArrayList<Object>());
	}

	/*
	 * Estes dois métodos são diferentes! No primeiro, é possível receber uma
	 * lista de qualquer tipo, porém não é possível adicionar nada a esta lista.
	 */
	private void metodo3(List<?> lista) {
		// lista.add(new Object()); Não é possível adicionar itens
		System.out.println(lista);
	}

	/*
	 * Já neste método, é possível receber apenas uma lista de Object, e é
	 * possível adicionar qualquer coisa nesta lista.
	 */
	private void metodo4(List<Object> lista) {
		lista.add(new Cat());
		System.out.println(lista);
	}

	/**
	 * Este método recebe uma lista de qualquer supertipo de Dog, ou o próprio
	 * tipo Dog, porém nada abaixo de Dog na árvore hierárquica pode ser aceito.
	 * Quando se utiliza o coringa ? com super, é possível adicionar itens à
	 * lista. O caractere coringa só pode ser utilizado na declaração de
	 * variáveis, ou seja, não é possível utilizar o caractere coringa na
	 * declaração de classes ou tipos parametrizados na declaração de métodos, e
	 * muito menos em tipos de retorno.
	 * 
	 * @param lista
	 */
	private void metodo2(List<? super Dog> lista) {
		lista.add(new Dog()); // Neste caso, é possível adicionar.
		System.out.println(lista);
	}

	/**
	 * O caractere coringa serve para informar ao compilador de que este método
	 * pode receber uma lista de qualquer subtipo de Animal, porém ao utilizar o
	 * caractere coringa, não é possível adicionar elementos a lista!
	 * 
	 * @param lista
	 */
	private void metodo(List<? extends Animal> lista) {
		/*
		 * Não é possível adicionar itens à lista, pois ao utilizar o caractere
		 * coringa, o compilador irá impedir este tipo de operação.
		 */
		// lista.add(new Dog());
		System.out.println(lista);
	}

	/**
	 * Não é possível passar uma lista de algum subtipo de animal, pois o
	 * compilador não ira permitir que isto aconteca. Isso funcionaria para
	 * arrays, porém não funciona para tipos genéricos, pois desta forma, o
	 * compilador evita que seja adicionado o tipo errado de elemento na lista.
	 * Imagine o cenário: É passado um ArrayList<Dog> para um método que recebe
	 * um List<Animal>, dentro deste método, seria possível adicionar qualquer
	 * subtipo de Animal dentro da lista, até mesmo um CAT!!! E isto seria
	 * inválido, pois foi passado um ArrayList de Dogs, e não de Cats, por este
	 * motivo, o tipo parametrizado deve ser o mesmo da assinatura do método.
	 * 
	 * @param lista
	 */
	public void testTipos(List<Animal> lista) {

	}

}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}
