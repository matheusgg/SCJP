package colecoes;

public class Dog {
	private String nome;

	public Dog(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return this.nome;
	}

	public boolean equals(Object o) {
		if ((o instanceof Dog) && (((Dog) o).getNome().equals(this.nome))) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int code = 0;
		for (int i = 0; i < this.nome.length(); i++) {
			code += this.nome.charAt(i);
		}
		return code;
	}
}
