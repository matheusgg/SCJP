package estados.sleep;

/**
 * O método sleep() faz a thread atual ser suspensa por um período de tempo.
 * 
 * @author Matheus
 * 
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				/*
				 * Este método lançará uma exceção apenas se a Thread for
				 * interrompida antes da sua hora de acordar.
				 */
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println(Thread.currentThread().getName() + " foi Interrompida!!!");
			}
		}
	}

}
