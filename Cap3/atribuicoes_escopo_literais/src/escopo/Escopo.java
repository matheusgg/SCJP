package escopo;

public class Escopo {
	private String a;
	private String b;

	public static void main(String[] args) {
		Escopo e = new Escopo();
		e.go();
	}

	public void go() {
		this.b = this.a;
		this.a = "Teste";
		/*
		 * Será impresso null, pois apesar do padrão de bits de a ter sido
		 * alterado, o padrão de bits de b continua sendo o mesmo, ou seja,
		 * null.
		 */
		System.out.println(this.b);
	}
}
