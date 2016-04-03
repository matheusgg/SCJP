package regrassuperecoringa;

import java.util.ArrayList;
import java.util.List;

/**
 * N�o � poss�vel utilizar o super sem o caractere coringa. E o caractere
 * coringa s� pode apenas ser utilizado na declara��o de vari�veis. Logo, super
 * tamb�m s� pode ser utilizado na declara��o de vari�veis.
 * 
 * @author Matheus
 * 
 */
public class Generics<T extends Number> {// <E super Number> { Inv�lido!
	public static void main(String[] args) {
		Generics.show(10);

	}

	public static void adicaoComCaractereCoringa() {
		List<? super Integer> lista = new ArrayList<Integer>();
		lista.add(10); // V�lido
		System.out.println(lista);

		List<? extends Integer> l = new ArrayList<Integer>();
		/*
		 * l.add(10); Inv�lido! N�o � poss�vel determinar o tipo do elemento em
		 * tempo de execu��o.
		 */
		System.out.println(l);
	}

	/**
	 * Isto � v�lido, pois o tipo parametrizado foi declarado no m�todo.
	 * 
	 * @param num
	 * @return
	 */
	public static <E extends Number> E show(E num) {
		System.out.println(num);
		return num;
	}

	/*
	 * N�o � poss�vel utilizar um tipo parametrizado que foi declarado na classe
	 * em m�todos. Isso apenas � poss�vel se o tipo for declarado no m�todo.
	 * 
	 * public static void metodo(T t){
	 * 
	 * }
	 */

	/*
	 * S� � poss�vel utilizar o super com o caractere coringa. E o caractere
	 * coringa s� pode ser utilizado na declara��o de vari�veis.
	 * 
	 * public <T super Number> void metodo(T t) {
	 * 
	 * }
	 */

}
