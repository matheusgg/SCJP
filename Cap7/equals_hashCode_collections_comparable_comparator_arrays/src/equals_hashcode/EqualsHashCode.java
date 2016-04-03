package equals_hashcode;

/**
 * O método equals() verifica se dois objetos são significativamente
 * equivalentes. Para se implementar o método equals(), é necessário seguir o
 * contrato descrito na API JAVA. Além disso, o método equals() está intimamente
 * ligado ao método hashCode(), ou seja, se o método equals retornar true, os
 * dois objetos devem possuir o mesmo hash code. Deste modo, sempre que se
 * sobrescrever o método equals(), também deve sobrescrever o método hashCode().
 * 
 * @author Matheus
 */
// O método iquals() deve ser:
// Reflexivo: x.equals(x) deve retornar true;

// Simétrico: se x.equals(y) = true, então y.equals(x) também deve ser true;

// Transitivo: se x.equals(y) = true e y.equals(z) = true, então x.equals(x)
// dever ser true;

// Consistente: Para várias chamadas de x.equals(y) deve retornar
// consistentemente sempre o mesmo valor.

// x.equals(null) deve retornar false.
public class EqualsHashCode {

	public static void main(String... args) {
		EqualsHashCode e = new EqualsHashCode();
		e.contratoEquals();
	}

	public void contratoEquals() {
		Animal a = new Animal("Animal 1");
		Animal a2 = new Animal("Animal 1");
		Animal a3 = new Animal("Animal 1");

		System.out.println("Reflexivo");
		System.out.println(a.equals(a));

		System.out.println("\nSimétrico");
		System.out.println(a.equals(a2));
		System.out.println(a2.equals(a));

		System.out.println("\nTransitivo");
		System.out.println(a.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println(a.equals(a3));

		System.out.println("\nConsistente");
		System.out.println(a.equals(a2));
		System.out.println(a.equals(a2));
		System.out.println(a.equals(a2));
		System.out.println(a.equals(a2));
		System.out.println(a.equals(a2));

		System.out.println("\nHashCode");
		System.out.println(a.equals(a2));
		System.out.println("a = " + a.hashCode());
		System.out.println("a2 = " + a2.hashCode());
		System.out.println("a3 = " + a3.hashCode());

		System.out.println("\nNull");
		System.out.println(a.equals(null));
	}

}

class Animal {
	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int hashCode() {
		int code = 0;
		for (int i = 0; i < this.nome.length(); i++) {
			code += new Character(this.nome.charAt(i));
		}
		return code;
	}

	public boolean equals(Object o) {
		if ((o instanceof Animal) && (((Animal) o).getNome().equals(this.nome))) {
			return true;
		} else {
			return false;
		}

	}
}
