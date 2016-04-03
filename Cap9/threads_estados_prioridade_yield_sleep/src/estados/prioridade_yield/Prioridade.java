package estados.prioridade_yield;

/**
 * Por padrão, uma Thread possui a prioridade da Thread que a criou, porém é
 * possível determinar a prioridade informando um valor entre 1 e 10. A
 * prioridade default é 5.
 * 
 * @author Matheus
 * 
 */
public class Prioridade {
	public static void main(String[] args) {
		Prioridade p = new Prioridade();
		p.testePrioridade();
	}

	public void testePrioridade() {
		// Esta thread tem a mesma prioridade da thread main.
		Thread t1 = new Thread(new MyRunnable(), "t1");
		t1.setPriority(Thread.MAX_PRIORITY); // Alterando a prioridade.
		t1.start();

		Thread t2 = new Thread(new MyRunnable(), "t2");
		t2.setPriority(Thread.MAX_PRIORITY); // Alterando a prioridade.
		t2.start();
	}

}
