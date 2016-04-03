package equals_hashcode;

/**
 * O m�todo equals() verifica se dois objetos s�o significativamente
 * equivalentes. Para se implementar o m�todo equals(), � necess�rio seguir o
 * contrato descrito na API JAVA. Al�m disso, o m�todo equals() est� intimamente
 * ligado ao m�todo hashCode(), ou seja, se o m�todo equals retornar true, os
 * dois objetos devem possuir o mesmo hash code. Deste modo, sempre que se
 * sobrescrever o m�todo equals(), tamb�m deve sobrescrever o m�todo hashCode().
 * 
 * @author Matheus
 */
// O m�todo iquals() deve ser:
// Reflexivo: x.equals(x) deve retornar true;

// Sim�trico: se x.equals(y) = true, ent�o y.equals(x) tamb�m deve ser true;

// Transitivo: se x.equals(y) = true e y.equals(z) = true, ent�o x.equals(x)
// dever ser true;

// Consistente: Para v�rias chamadas de x.equals(y) deve retornar
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

		System.out.println("\nSim�trico");
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
