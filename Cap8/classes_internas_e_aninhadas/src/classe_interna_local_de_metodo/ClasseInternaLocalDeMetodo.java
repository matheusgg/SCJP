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
				 * Classes internas de método só podem acessar variáveis locais
				 * que foram marcadas como final.
				 */
				// System.out.println(x); Erro de compilação!
				System.out.println(t); // OK é final
			}
		}

		Inner i = new Inner();
		i.innerMethod();
		System.out.println(x);
	}

	/**
	 * É possível declarar classes internas dentro de métodos, porém não é
	 * possível fazer o mesmo com interfaces. Classes internas dentro de métodos
	 * podem apenas ser abstract ou final. O escopo da classe se restringe ao
	 * escopo do método.
	 */
	public void checkMethod() {
		System.out.println("Início");

		/*
		 * Não é possível declarar internaces internas dentro de métodos
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
		 * É preciso instanciar a classe para poder utilizar seu métodos
		 */
		MyInner my = new MyInner();
		my.methodInner();

		System.out.println("Fim");
	}
}
