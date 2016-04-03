package pac1;

public class HerancaPolimorfismo {
	public static void main(String... args) {
		/*
		 * Neste trecho h� apenas um objeto e 4 vari�veis de refer�ncia.
		 */
		VoleyPlayer player = new VoleyPlayer();
		Player p = player;
		Negociavel n = (Negociavel) p;
		Player vp = (VoleyPlayer) n;
		/*
		 * 
		 */

		vp.correr();
		System.out.println(vp.x); // Ser� impresso 10.
	}
}

class Player {
	int x = 10;

	public void correr() {
		System.out.println("Correndo...");
	}
}

class VoleyPlayer extends Player implements Negociavel {
	int x = 9;

	public void negociar() {
		System.out.println("Negociando...");
	}

}

interface Negociavel {
	void negociar();
}
