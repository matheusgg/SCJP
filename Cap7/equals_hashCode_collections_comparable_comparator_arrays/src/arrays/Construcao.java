package arrays;

public class Construcao implements Comparable<Construcao> {
	private String endereco;

	public Construcao(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int compareTo(Construcao o) {
		return this.endereco.compareTo(o.getEndereco());
	}

}
