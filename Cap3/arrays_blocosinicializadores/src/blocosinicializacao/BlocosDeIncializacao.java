package blocosinicializacao;

/*
 * Os blocos de inicializa��o est�ticos rodam apenas uma vez, quando a classe � carregada.
 */
public class BlocosDeIncializacao extends Super {
	Attr a = new Attr(); // 3

	public BlocosDeIncializacao() {
		System.out.println("BlocosDeIncializacao.BlocosDeIncializacao()");// 5
	}

	static {
		System.out.println("BlocosDeIncializacao.static"); // 1
	}

	{
		System.out.println("BlocosDeIncializacao.enclosing_method()");// 4
	}

	public static void main(String[] args) {
		new BlocosDeIncializacao(); // static,Super,Attr,enclosing_method,BlocosDeIncializacao
		new BlocosDeIncializacao(); // Super,Attr,enclosing_method,BlocosDeIncializacao
	}

}

class Super {
	public Super() {
		System.out.println("Super.Super()");// 2
	}

}

class Attr {
	public Attr() {
		System.out.println("Attr.Attr()");// 3
	}

}