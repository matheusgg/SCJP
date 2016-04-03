package join;

/**
 * O m�todo join() faz a Thread atual ser anexada ao final da thread que invocou
 * o m�todo, ou seja, a Thread atual esperar� pelo fim da thread que chamou
 * join() para ser encerrada. Desta forma, a thread atual passa para o estado
 * ativo(execut�vel), enquanto a thread que chamou join() para para o estado em
 * execu��o.
 * 
 * @author Matheus
 * 
 */
public class MetodoJoin {

	public static void main(String... args) {
		System.out.println("In�cio m�todo main");
		new MetodoJoin().testeJoin();
		System.out.println("Fim m�todo main");
	}

	public void testeJoin() {
		System.out.println("In�cio m�todo testeJoin");
		Thread t = new Thread(new MyRunnable(), "Runnable");
		t.start();
		try {
			/*
			 * A chamada ao m�todo join() deve ser depois do m�todo start(),
			 * caso contr�rio n�o ter� efeito algum.
			 */
			t.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim m�todo testeJoin");
	}

}
