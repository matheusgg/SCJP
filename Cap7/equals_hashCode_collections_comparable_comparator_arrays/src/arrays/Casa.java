package arrays;

public class Casa extends Construcao {

	public Casa(String endereco) {
		super(endereco);
	}

	public String toString() {
		return "Casa - " + super.getEndereco();
	}

}
