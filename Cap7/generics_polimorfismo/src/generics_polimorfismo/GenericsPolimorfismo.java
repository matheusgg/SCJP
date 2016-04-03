package generics_polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 * Quando Generics é utilizado, os tipos parametrizados devem ser iguais para
 * atribuições, passagem por parâmetro e tipos de retorno.
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
	 * A principal regra a se lembrar quando se utilizar generics é que o tipo
	 * parametrizado da variável de referência DEVE SER O MESMO tipo
	 * parametrizado do objeto.
	 */
	public void polimorfismo() {
		// Os tipos devem ser iguais!!!
		List<Animal> l = new ArrayList<Animal>();
		// List<Animal> l = new ArrayList<Dog>(); Isso não funciona!
		l.add(new Dog()); // Mas é possível adicionar um Dog!
		System.out.println(l);
		this.checkAnimal(l);

		List<Dog> dogs = new ArrayList<Dog>();
		/*
		 * Este método pode receber apenas listas de Animais
		 */
		// this.checkAnimal(dogs); ERRO DE COMPILAÇÃO!!!
		this.checkDogs(dogs);
	}

	private void checkAnimal(List<Animal> animals) {
		System.out.println(animals);
	}

	/*
	 * Este método, apesar de receber uma lista de tipo diferente, ainda possui
	 * a mesma assinatura do método acima. Isso gera um erro de compilação!!!
	 * private void checkAnimal(List<Dog> animals) {
	 * System.out.println(animals); }
	 */

	private void checkDogs(List<Dog> dogs) {
		System.out.println(dogs);
	}

}
