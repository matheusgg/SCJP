package comparable;

/**
 * A interface Comparable do pacote java.lang serve para se criar uma forma
 * personalizada de se comparar um objeto do tipo em questão.
 * 
 * @author Matheus
 * 
 */
public class Dog implements Comparable<Dog> {

	private String nome;

	public Dog(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Dog o) {
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

}
