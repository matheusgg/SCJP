package classe_interna;

/**
 * Para haver uma inst�ncia de uma classe interna, � necess�rio existir
 * primeiramente uma inst�ncia da classe externa. As classes internas
 * compartilham de um relacionamento especial com as classes externas de tal
 * forma que a classe interna pode acessar todos os membros da classe externa,
 * ou seja, a classe que a encapsula. Uma classe interna � um membro de outra
 * classe.
 * 
 * @author Matheus
 * 
 */
public class ClassesInternas {
	public int x = 10;

	public static void main(String[] args) {
		/*
		 * N�o � poss�vel criar inst�ncias de classes internas desta forma
		 * dentro de m�todos est�ticos, a n�o ser que a classe seja uma classe
		 * aninhada (est�tica).
		 */
		// Inner i = new Inner();
		ClassesInternas ci = new ClassesInternas();
		ci.metodoClasseExterna();
	}

	public void metodoClasseExterna() {
		System.out.println("ClassesInternas.metodoClasseExterna()");

		/*
		 * Dentro de m�todos da classe externa � poss�vel criar uma inst�ncia da
		 * classe interna.
		 */
		Inner i = new Inner();
		i.metodoClasseInterna();
	}

	public void show() {
		System.out.println("ClassesInternas.show()");
	}

	/**
	 * Uma classe interna pode ter os seguintes modificadores: public, private,
	 * protected, abstract, final e strictfp.
	 * 
	 * @author Matheus
	 * 
	 */
	protected class Inner {
		/*
		 * Classes internas n�o podem possuir membros est�ticos.
		 */
		// public static int y = 20;
		private int x = 40;

		public void metodoClasseInterna() {
			System.out.println("ClassesInternas.Inner.metodoClasseInterna()");
			// Chamando um m�todo da classe externa.
			show();
			this.acessandoMembros();
		}

		/*
		 * Como tanto a classe interna como a classe externa possuem um membro
		 * com o mesmo nome, � poss�vel referenciar as inst�ncias das classes
		 * com o uso da palavra-chave 'this' precedido pelo nome da classe que
		 * possui o membro.
		 */
		public void acessandoMembros() {
			// Acessando 'x' da classe externa
			System.out.println("\n================================\nAcessando membros\n" + "ClassesInternas: " + ClassesInternas.this.x);

			// Acessando 'x' da classe interna
			System.out.println("Inner: " + x);
			System.out.println("Inner: " + this.x);
			System.out.println("Inner: " + Inner.this.x);
		}
	}

	interface test {

	}
}
