package pac4;

import pac3.Classe3;

/*
 * � poss�vel acessar atributos e m�todos protected a partir de classes
 * de diferentes pacotes desde que estas sejam filhas (subclasses) da classe
 * que declarou o atributo ou m�todo protegido. Esta � a diferen�a entre
 * os n�veis protected e default. Com o n�vel default, n�o � poss�vel acessar
 * os atributos ou m�todos protegidos de classes de outros pacotes, mesmo quando
 * h� uma rela��o de heran�a.
 */
public class Classe4 extends Classe3 {

	public void metodo() {
		System.out.println(super.x);
		// System.out.println(super.y); Esta linha gerar� um erro de compila��o.
	}

	public static void main(String[] args) {
		new Classe4().metodo();
	}

}
