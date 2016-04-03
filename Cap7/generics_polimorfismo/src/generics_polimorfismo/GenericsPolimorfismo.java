package generics_polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 * Quando Generics � utilizado, os tipos parametrizados devem ser iguais para
 * atribui��es, passagem por par�metro e tipos de retorno.
 * 
 * @author Matheus
 * 
 */
public class GenericsPolimorfismo {
	public static void main(String... args) {
		GenericsPolimorfismo g = new GenericsPolimorfismo();
		g.polimorfismo();
	}

	/**
	 * A principal regra a se lembrar quando se utilizar generics � que o tipo
	 * parametrizado da vari�vel de refer�ncia DEVE SER O MESMO tipo
	 * parametrizado do objeto.
	 */
	public void polimorfismo() {
		// Os tipos devem ser iguais!!!
		List<Animal> l = new ArrayList<Animal>();
		// List<Animal> l = new ArrayList<Dog>(); Isso n�o funciona!
		l.add(new Dog()); // Mas � poss�vel adicionar um Dog!
		System.out.println(l);
		this.checkAnimal(l);

		List<Dog> dogs = new ArrayList<Dog>();
		/*
		 * Este m�todo pode receber apenas listas de Animais
		 */
		// this.checkAnimal(dogs); ERRO DE COMPILA��O!!!
		this.checkDogs(dogs);
	}

	private void checkAnimal(List<Animal> animals) {
		System.out.println(animals);
	}

	/*
	 * Este m�todo, apesar de receber uma lista de tipo diferente, ainda possui
	 * a mesma assinatura do m�todo acima. Isso gera um erro de compila��o!!!
	 * private void checkAnimal(List<Dog> animals) {
	 * System.out.println(animals); }
	 */

	private void checkDogs(List<Dog> dogs) {
		System.out.println(dogs);
	}

}
