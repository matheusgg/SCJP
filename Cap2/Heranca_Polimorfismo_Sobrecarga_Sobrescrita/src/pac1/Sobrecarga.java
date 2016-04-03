package pac1;

import java.io.IOException;

public class Sobrecarga {
	public static void main(String[] args) throws Exception {
		Cachorro c = new Cachorro();
		System.out.println(c.comer("carne"));
		c.comer(10); // Animal.comer()
		c.comer(10.2); // 2 - Cachorro.comer()
	}
}

class Animal {
	public void comer(int quantidade) throws IOException {
		System.out.println("Animal.comer()");
	}
}

class Cachorro extends Animal {
	public String comer(String comida) throws Exception {
		return "Comendo... ".concat(comida);
	}

	public void comer(float x) {
		System.out.println("1 - Cachorro.comer() " + x);
	}

	public void comer(double x) {
		System.out.println("2 - Cachorro.comer() " + x);
	}

	public void comer(float x, double y) {
		System.out.println("3 - Cachorro.comer() " + (x + y));
	}

	public void comer(double x, float y) {
		System.out.println("4 - Cachorro.comer() " + (x + y));
	}
}