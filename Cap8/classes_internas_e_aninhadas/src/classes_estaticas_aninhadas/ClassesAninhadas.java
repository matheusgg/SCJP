package classes_estaticas_aninhadas;

/**
 * Classes est�ticas aninhadas s�o classes marcadas com o modificador static e
 * que, diferentemente das classes internas, n�o compartilham de um
 * relacionamento com a classe externa. N�o existem classes est�ticas! O
 * modificador static apenas informa que esta classe � um membro est�tico da
 * classe interna e pode ser acessado sem a necessidade de uma inst�ncia da
 * classe externa.
 * 
 * @author Matheus
 * 
 */
public class ClassesAninhadas {

	private static int x = 10;

	public static void main(String[] args) {
		InnerStaticClass i = new InnerStaticClass();
		i.go();
	}

	public void metodoExterno() {

	}

	static class InnerStaticClass implements InnerInterface {
		public static int x = 30;

		public void go() {
			System.out.println("ClassesAninhadas.InnerStaticClass.go()");
			/*
			 * Erro de compila��o! Classes aninhadas n�o compartilha de
			 * relacionamento com as classes externas. Ou seja, n�o � poss�vel
			 * acessar membros de inst�ncia da classe externa, apenas membros
			 * est�ticos.
			 */
			// ClassesAninhadas.this.teste();
			System.out.println(ClassesAninhadas.x);
			System.out.println(x);
		}
	}

	/**
	 * Interfaces internas tamb�m podem ser est�ticas.
	 * 
	 * @author Matheus
	 * 
	 */
	static interface InnerInterface {

	}
}
