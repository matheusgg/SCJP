package classe_interna;

/**
 * Para haver uma instância de uma classe interna, é necessário existir
 * primeiramente uma instância da classe externa. As classes internas
 * compartilham de um relacionamento especial com as classes externas de tal
 * forma que a classe interna pode acessar todos os membros da classe externa,
 * ou seja, a classe que a encapsula. Uma classe interna é um membro de outra
 * classe.
 * 
 * @author Matheus
 * 
 */
public class ClassesInternas {
	public int x = 10;

	public static void main(String[] args) {
		/*
		 * Não é possível criar instâncias de classes internas desta forma
		 * dentro de métodos estáticos, a não ser que a classe seja uma classe
		 * aninhada (estática).
		 */
		// Inner i = new Inner();
		ClassesInternas ci = new ClassesInternas();
		ci.metodoClasseExterna();
	}

	public void metodoClasseExterna() {
		System.out.println("ClassesInternas.metodoClasseExterna()");

		/*
		 * Dentro de métodos da classe externa é possível criar uma instância da
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
		 * Classes internas não podem possuir membros estáticos.
		 */
		// public static int y = 20;
		private int x = 40;

		public void metodoClasseInterna() {
			System.out.println("ClassesInternas.Inner.metodoClasseInterna()");
			// Chamando um método da classe externa.
			show();
			this.acessandoMembros();
		}

		/*
		 * Como tanto a classe interna como a classe externa possuem um membro
		 * com o mesmo nome, é possível referenciar as instâncias das classes
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
