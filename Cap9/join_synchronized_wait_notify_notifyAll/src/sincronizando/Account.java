package sincronizando;

public class Account {
	private int valor = 50;

	public int getValor() {
		return this.valor;
	}

	public void saque(int qtd) {
		this.valor -= qtd;
	}

}
