package cast;
public class Cast {

	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a instanceof Dog);
		/*
		 * O compilador verifica se os tipos das variáveis de referência fazem
		 * parte da mesma árvore hierárquica. Por este motivo, não é possível
		 * fazer: Integer d = (Integer) a; Pois Integer e Animal não fazem parte
		 * da mesma árvore hierárquica.
		 */
		Dog d = (Dog) a;
		System.out.println(d instanceof Animal);

		/*
		 * Existem dois tipos de cast de variáveis de referência. Downcast e
		 * Upcast. Quando é feito um downcast, é obrigatório fazer o cast
		 * explícito, pois estamos convertendo de um tipo mais geral (mais
		 * abrangenste) para um tipo mais específico.
		 */
		Dog dog = (Dog) a;
		System.out.println(dog instanceof Animal);

		/*
		 * Já no upcast, o cast explícito não é obrigatório, pois estamos
		 * limitando os métodos que podemos chamar, isto é, estamos convertendo
		 * de um tipo mais específico para um tipo menos específico (mais
		 * abrangente). Lembrando que para fazer tanto o downcat quanto o upcat,
		 * é necessário que os tipos estejam na mesma árvore hierárquica, senão
		 * ocorrerá um erro de compilação.
		 */
		Animal animal = dog;
		System.out.println(animal instanceof Dog);

	}
}

class Animal {

}

class Dog extends Animal {

}
