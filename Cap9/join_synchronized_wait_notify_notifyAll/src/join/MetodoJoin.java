package join;

/**
 * O método join() faz a Thread atual ser anexada ao final da thread que invocou
 * o método, ou seja, a Thread atual esperará pelo fim da thread que chamou
 * join() para ser encerrada. Desta forma, a thread atual passa para o estado
 * ativo(executável), enquanto a thread que chamou join() para para o estado em
 * execução.
 * 
 * @author Matheus
 * 
 */
public class MetodoJoin {

	public static void main(String... args) {
		System.out.println("Início método main");
		new MetodoJoin().testeJoin();
		System.out.println("Fim método main");
	}

	public void testeJoin() {
		System.out.println("Início método testeJoin");
		Thread t = new Thread(new MyRunnable(), "Runnable");
		t.start();
		try {
			/*
			 * A chamada ao método join() deve ser depois do método start(),
			 * caso contrário não terá efeito algum.
			 */
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim método testeJoin");
	}

}
