package arrays;

public class Predio extends Construcao {

	public Predio(String endereco) {
		super(endereco);
	}

	public String toString() {
		return "Pr�dio - " + super.getEndereco();
	}
}
