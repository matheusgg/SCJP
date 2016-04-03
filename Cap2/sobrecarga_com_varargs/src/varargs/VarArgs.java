package varargs;

public class VarArgs {

	public static void main(String[] args) {
		String[] s = new String[2];
		VarArgs va = new VarArgs();
		va.metodo(s);// 2
		va.metodo(10); // 3

	}

	/*
	 * M�todos sobrecarregados que recebem um var-args como par�metro s�o os
	 * �ltimos a serem escolhidos para a invoca��o.
	 */
	public void metodo(String[]... s) {
		System.out.println("1");
	}

	public void metodo(String[] s) {
		System.out.println("2");
	}

	public void metodo(Object o) {
		System.out.println("3");
	}

}
