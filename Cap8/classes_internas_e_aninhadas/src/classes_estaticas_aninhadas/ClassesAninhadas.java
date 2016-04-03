package classes_estaticas_aninhadas;

/**
 * Classes estáticas aninhadas são classes marcadas com o modificador static e
 * que, diferentemente das classes internas, não compartilham de um
 * relacionamento com a classe externa. Não existem classes estáticas! O
 * modificador static apenas informa que esta classe é um membro estático da
 * classe interna e pode ser acessado sem a necessidade de uma instância da
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
			 * Erro de compilação! Classes aninhadas não compartilha de
			 * relacionamento com as classes externas. Ou seja, não é possível
			 * acessar membros de instância da classe externa, apenas membros
			 * estáticos.
			 */
			// ClassesAninhadas.this.teste();
			System.out.println(ClassesAninhadas.x);
			System.out.println(x);
		}
	}

	/**
	 * Interfaces internas também podem ser estáticas.
	 * 
	 * @author Matheus
	 * 
	 */
	static interface InnerInterface {

	}
}
