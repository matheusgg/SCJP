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
		 * Aqui � criado um implementador an�nimo (pode ser uma classe an�nima),
		 * e este por sua vez, � passado como argumento para o m�todo que recebe
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
	 * Neste m�todo, � criado um implementador an�nimo para a interface
	 * Runnable. A �nica diferen�a � que aqui n�o � criada uma subclasse, mas
	 * sim uma classe an�nima que implementa Runnable.
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
	 * Uma classe interna an�nima � uma subclasse de uma classe, ou interface,
	 * declarada dentro de um m�todo ou na lista de par�metros do m�todo e que
	 * n�o possui nome. � poss�vel sobrescrever m�todos da superclasse.
	 */
	public void classeAnonima() {
		System.out.println(new SimpleClass().show());
		/*
		 * Cria uma subclasse an�nima!
		 */
		SimpleClass sc = new SimpleClass() {

			/*
			 * Sobrescrevendo o m�todo da superclasse SimpleClass
			 */
			public String show() {
				return super.show() + " more!!!";
			}
		}; // � necess�rio o ponto-e-v�rgula no final!!!

		System.out.println(sc.show());
	}
}

class SimpleClass {
	public String show() {
		return "Show";
	}
}
