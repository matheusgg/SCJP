package cast;
public class Cast {

	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a instanceof Dog);
		/*
		 * O compilador verifica se os tipos das vari�veis de refer�ncia fazem
		 * parte da mesma �rvore hier�rquica. Por este motivo, n�o � poss�vel
		 * fazer: Integer d = (Integer) a; Pois Integer e Animal n�o fazem parte
		 * da mesma �rvore hier�rquica.
		 */
		Dog d = (Dog) a;
		System.out.println(d instanceof Animal);

		/*
		 * Existem dois tipos de cast de vari�veis de refer�ncia. Downcast e
		 * Upcast. Quando � feito um downcast, � obrigat�rio fazer o cast
		 * expl�cito, pois estamos convertendo de um tipo mais geral (mais
		 * abrangenste) para um tipo mais espec�fico.
		 */
		Dog dog = (Dog) a;
		System.out.println(dog instanceof Animal);

		/*
		 * J� no upcast, o cast expl�cito n�o � obrigat�rio, pois estamos
		 * limitando os m�todos que podemos chamar, isto �, estamos convertendo
		 * de um tipo mais espec�fico para um tipo menos espec�fico (mais
		 * abrangente). Lembrando que para fazer tanto o downcat quanto o upcat,
		 * � necess�rio que os tipos estejam na mesma �rvore hier�rquica, sen�o
		 * ocorrer� um erro de compila��o.
		 */
		Animal animal = dog;
		System.out.println(animal instanceof Dog);

	}
}

class Animal {

}

class Dog extends Animal {

}
