package tiposGenericos;

import java.util.ArrayList;
import java.util.List;

/**
 * Quando se trabalha com Generics, ocorre uma coisa chamada apagamento dos
 * gen�ricos, isto �, quando os bytecodes s�o gerados, todas a informa��es de
 * tipos parametrizaado s�o removidas, desta forma � mantida a compatibilidade
 * com c�digos antigos e a JVM n�o tem como saber exatamente o tipo da Lista,
 * por este motivo n�o � poss�vel passar uma Lista de um subtipo para um m�todo
 * que recebe uma lista de algum supertipo.
 * 
 * @author Matheus
 * 
 */
public class TiposGenericos {
	public static void main(String... args) {
		TiposGenericos t = new TiposGenericos();
		// INV�LIDO!!!
		// t.testTipos(new ArrayList<Dog>());
		t.caractereCoringa();
	}

	public void caractereCoringa() {
		this.metodo(new ArrayList<Dog>());
		this.metodo(new ArrayList<Animal>());

		/*
		 * Estas tr�s listas s�o de algo que � do tipo, ou supertipo, de Dog.
		 */
		this.metodo2(new ArrayList<Dog>());
		this.metodo2(new ArrayList<Animal>());
		this.metodo2(new ArrayList<Object>());

		this.metodo3(new ArrayList<Cat>());
		this.metodo4(new ArrayList<Object>());
	}

	/*
	 * Estes dois m�todos s�o diferentes! No primeiro, � poss�vel receber uma
	 * lista de qualquer tipo, por�m n�o � poss�vel adicionar nada a esta lista.
	 */
	private void metodo3(List<?> lista) {
		// lista.add(new Object()); N�o � poss�vel adicionar itens
		System.out.println(lista);
	}

	/*
	 * J� neste m�todo, � poss�vel receber apenas uma lista de Object, e �
	 * poss�vel adicionar qualquer coisa nesta lista.
	 */
	private void metodo4(List<Object> lista) {
		lista.add(new Cat());
		System.out.println(lista);
	}

	/**
	 * Este m�todo recebe uma lista de qualquer supertipo de Dog, ou o pr�prio
	 * tipo Dog, por�m nada abaixo de Dog na �rvore hier�rquica pode ser aceito.
	 * Quando se utiliza o coringa ? com super, � poss�vel adicionar itens �
	 * lista. O caractere coringa s� pode ser utilizado na declara��o de
	 * vari�veis, ou seja, n�o � poss�vel utilizar o caractere coringa na
	 * declara��o de classes ou tipos parametrizados na declara��o de m�todos, e
	 * muito menos em tipos de retorno.
	 * 
	 * @param lista
	 */
	private void metodo2(List<? super Dog> lista) {
		lista.add(new Dog()); // Neste caso, � poss�vel adicionar.
		System.out.println(lista);
	}

	/**
	 * O caractere coringa serve para informar ao compilador de que este m�todo
	 * pode receber uma lista de qualquer subtipo de Animal, por�m ao utilizar o
	 * caractere coringa, n�o � poss�vel adicionar elementos a lista!
	 * 
	 * @param lista
	 */
	private void metodo(List<? extends Animal> lista) {
		/*
		 * N�o � poss�vel adicionar itens � lista, pois ao utilizar o caractere
		 * coringa, o compilador ir� impedir este tipo de opera��o.
		 */
		// lista.add(new Dog());
		System.out.println(lista);
	}

	/**
	 * N�o � poss�vel passar uma lista de algum subtipo de animal, pois o
	 * compilador n�o ira permitir que isto aconteca. Isso funcionaria para
	 * arrays, por�m n�o funciona para tipos gen�ricos, pois desta forma, o
	 * compilador evita que seja adicionado o tipo errado de elemento na lista.
	 * Imagine o cen�rio: � passado um ArrayList<Dog> para um m�todo que recebe
	 * um List<Animal>, dentro deste m�todo, seria poss�vel adicionar qualquer
	 * subtipo de Animal dentro da lista, at� mesmo um CAT!!! E isto seria
	 * inv�lido, pois foi passado um ArrayList de Dogs, e n�o de Cats, por este
	 * motivo, o tipo parametrizado deve ser o mesmo da assinatura do m�todo.
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
