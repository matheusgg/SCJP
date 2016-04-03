package enums;

/*
 * � pross�vel criar classes an�nimas para sobrescrever m�todos das enums.
 */
public enum Enumeration {
	SMALL(0), BIG(1), MEGA(2) {
		@Override
		public String getLetra() {
			return "B";
		}
	};

	Enumeration(int valor) {
		this.valor = valor;
	}

	private int valor;

	public int getValor() {
		return this.valor;
	}

	public String getLetra() {
		return "A";
	}

}
