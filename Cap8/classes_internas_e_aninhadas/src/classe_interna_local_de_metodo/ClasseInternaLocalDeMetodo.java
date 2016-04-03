package classe_interna_local_de_metodo;

public class ClasseInternaLocalDeMetodo {
	private int y = 30;

	public static void main(String[] args) {
		ClasseInternaLocalDeMetodo c = new ClasseInternaLocalDeMetodo();
		c.checkMethod();
		ClasseInternaLocalDeMetodo.checkMethod2(20);
	}

	public static <T> void checkMethod2(final T t) {
		System.out.println("\n=============================================\n");
		int x = 10;
		class Inner {
			public void innerMethod() {
				/*
				 * Classes internas de m�todo s� podem acessar vari�veis locais
				 * que foram marcadas como final.
				 */
				// System.out.println(x); Erro de compila��o!
				System.out.println(t); // OK � final
			}
		}

		Inner i = new Inner();
		i.innerMethod();
		System.out.println(x);
	}

	/**
	 * � poss�vel declarar classes internas dentro de m�todos, por�m n�o �
	 * poss�vel fazer o mesmo com interfaces. Classes internas dentro de m�todos
	 * podem apenas ser abstract ou final. O escopo da classe se restringe ao
	 * escopo do m�todo.
	 */
	public void checkMethod() {
		System.out.println("In�cio");

		/*
		 * N�o � poss�vel declarar internaces internas dentro de m�todos
		 */
		// interface InterInner{
		//
		// }

		class MyInner {
			private int x = 10;

			public void methodInner() {
				System.out.println("ClasseInternaLocalDeMetodo.checkMethod().MyInner.methodInner()");
				System.out.println(this.x);
				System.out.println(ClasseInternaLocalDeMetodo.this.y);
			}
		}

		/*
		 * � preciso instanciar a classe para poder utilizar seu m�todos
		 */
		MyInner my = new MyInner();
		my.methodInner();

		System.out.println("Fim");
	}
}
