package pac4;

import pac3.Classe3;

/*
 * É possível acessar atributos e métodos protected a partir de classes
 * de diferentes pacotes desde que estas sejam filhas (subclasses) da classe
 * que declarou o atributo ou método protegido. Esta é a diferença entre
 * os níveis protected e default. Com o nível default, não é possível acessar
 * os atributos ou métodos protegidos de classes de outros pacotes, mesmo quando
 * há uma relação de herança.
 */
public class Classe4 extends Classe3 {

	public void metodo() {
		System.out.println(super.x);
		// System.out.println(super.y); Esta linha gerará um erro de compilação.
	}

	public static void main(String[] args) {
		new Classe4().metodo();
	}

}
