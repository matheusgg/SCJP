package regrassuperecoringa;

import java.util.ArrayList;
import java.util.List;

/**
 * Não é possível utilizar o super sem o caractere coringa. E o caractere
 * coringa só pode apenas ser utilizado na declaração de variáveis. Logo, super
 * também só pode ser utilizado na declaração de variáveis.
 * 
 * @author Matheus
 * 
 */
public class Generics<T extends Number> {// <E super Number> { Inválido!
	public static void main(String[] args) {
		Generics.show(10);

	}

	public static void adicaoComCaractereCoringa() {
		List<? super Integer> lista = new ArrayList<Integer>();
		lista.add(10); // Válido
		System.out.println(lista);

		List<? extends Integer> l = new ArrayList<Integer>();
		/*
		 * l.add(10); Inválido! Não é possível determinar o tipo do elemento em
		 * tempo de execução.
		 */
		System.out.println(l);
	}

	/**
	 * Isto é válido, pois o tipo parametrizado foi declarado no método.
	 * 
	 * @param num
	 * @return
	 */
	public static <E extends Number> E show(E num) {
		System.out.println(num);
		return num;
	}

	/*
	 * Não é possível utilizar um tipo parametrizado que foi declarado na classe
	 * em métodos. Isso apenas é possível se o tipo for declarado no método.
	 * 
	 * public static void metodo(T t){
	 * 
	 * }
	 */

	/*
	 * Só é possível utilizar o super com o caractere coringa. E o caractere
	 * coringa só pode ser utilizado na declaração de variáveis.
	 * 
	 * public <T super Number> void metodo(T t) {
	 * 
	 * }
	 */

}
