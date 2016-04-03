package comparator;

public class Car implements Comparable<Car> {
	private String nome;

	public Car(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Car o) {
		return this.nome.compareTo(o.getNome());
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

	public String toString() {
		return this.nome;
	}

}
