package serializacao2;

public class Animal {
	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}
	
	public Animal(){
		System.out.print("");
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
