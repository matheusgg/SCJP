package pac2;

import enums.Enumeration;
import pac1.Classe1;

public class Classe2 extends Classe1 {

	public static void main(String[] args) {
		System.out.println(Enumeration.SMALL.getLetra());
		System.out.println(Enumeration.BIG.getLetra());
		System.out.println(Enumeration.MEGA.getLetra());
	}
}
