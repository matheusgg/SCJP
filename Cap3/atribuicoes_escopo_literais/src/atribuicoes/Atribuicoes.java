package atribuicoes;

public class Atribuicoes {
	public static void main(String[] args) {
		Atribuicoes a = new Atribuicoes();
		a.operacoesComBytes();
	}

	public void operacoesComBytes() {
		/*
		 * A soma de dois tipos menores que um int sempre resultar� em um int.
		 */
		byte a = 10;
		byte b = 10;
		byte c = (byte) (a + b); // � necess�rio um cast expl�cito.
		System.out.println(c);

	}

}
