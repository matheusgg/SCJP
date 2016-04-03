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
		 * Ser� impresso null, pois apesar do padr�o de bits de a ter sido
		 * alterado, o padr�o de bits de b continua sendo o mesmo, ou seja,
		 * null.
		 */
		System.out.println(this.b);
	}
}
