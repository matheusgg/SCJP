package classes_internas_anonimas;

public class ClassesInternasAnonimas {
	public static void main(String[] args) {
		ClassesInternasAnonimas c = new ClassesInternasAnonimas();
		// c.check();
		// c.implementadorAnonimo();
		c.classeAnonimaEmArgumento();
	}

	public void classeAnonimaEmArgumento() {
		/*
		 * Aqui é criado um implementador anônimo (pode ser uma classe anônima),
		 * e este por sua vez, é passado como argumento para o método que recebe
		 * um objeto do tipo Runnable.
		 */
		this.method(new Runnable() {

			public void run() {
				System.out.println("Running....");
			}

		});
	}

	private void method(Runnable r) {
		r.run();
	}

	/**
	 * Neste método, é criado um implementador anônimo para a interface
	 * Runnable. A única diferença é que aqui não é criada uma subclasse, mas
	 * sim uma classe anônima que implementa Runnable.
	 */
	public void implementadorAnonimo() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Run!!!");
			}
		};

		r.run();
	}

	/*
	 * Uma classe interna anônima é uma subclasse de uma classe, ou interface,
	 * declarada dentro de um método ou na lista de parâmetros do método e que
	 * não possui nome. É possível sobrescrever métodos da superclasse.
	 */
	public void classeAnonima() {
		System.out.println(new SimpleClass().show());
		/*
		 * Cria uma subclasse anônima!
		 */
		SimpleClass sc = new SimpleClass() {

			/*
			 * Sobrescrevendo o método da superclasse SimpleClass
			 */
			public String show() {
				return super.show() + " more!!!";
			}
		}; // É necessário o ponto-e-vírgula no final!!!

		System.out.println(sc.show());
	}
}

class SimpleClass {
	public String show() {
		return "Show";
	}
}
