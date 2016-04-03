package excecoes_construtores;

public class App {
	private Classe1 c1;
	private static Classe1 c2;

	// private static Classe1 c2 = new Classe1(); Erro de compila��o!!!

	static {
		/*
		 * Dentro do inicializador est�tico � necess�rio tratar a exce��o, ou
		 * seja, n�o basta apenas declar�-la no contrutor, � necess�rio trat�-la
		 * dentro deste bloco quando o atributo da classe � est�tico est�tico.
		 */
		try {
			c2 = new Classe1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	{
		/*
		 * O construtor padr�o declara uma exce��o. Logo n�o � preciso tratar a
		 * exce��o que o construtor da Classe1 declara.
		 */
		this.c1 = new Classe1();
	}

	/*
	 * Este construtor declara uma exce��o pois uma de suas vari�veis de
	 * inst�ncia pode provocar alguma exce��o na sua inicializa��o.
	 */
	public App() throws Exception {

	}

	/**
	 * @return the c1
	 */
	public Classe1 getC1() {
		return c1;
	}

	/**
	 * @param c1
	 *            the c1 to set
	 */
	public void setC1(Classe1 c1) {
		this.c1 = c1;
	}

	/**
	 * @return the c2
	 */
	public static Classe1 getC2() {
		return c2;
	}

	/**
	 * @param c2
	 *            the c2 to set
	 */
	public static void setC2(Classe1 c2) {
		App.c2 = c2;
	}

}

class Classe1 {

	/*
	 * Declara uma checked exception.
	 */
	public Classe1() throws Exception {
	}

}

class Classe2 extends Classe1 {

	/*
	 * Quando o contrutor da superclasse declarar uma exce��o, a subclasse deve
	 * tratar ou declarar esta exce��o.
	 */
	public Classe2() throws Exception {
		super();
	}

}