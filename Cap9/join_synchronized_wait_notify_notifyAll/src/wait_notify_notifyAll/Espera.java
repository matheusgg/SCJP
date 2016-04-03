package wait_notify_notifyAll;

/**
 * O m�todo wait() faz com que a thread atual espere pela thread que chamou o
 * m�todo at� que a mesma notifique que encerrou as suas atividades, ou seja,
 * at� que a thread que chamou o m�todo wait() chame o m�todo notify() ou
 * notifyAll(). Para chamar o m�todo wait(), notify() ou notifyAll(), a thread
 * atual deve possuir o bloqueio do objeto, sen�o uma
 * IllegalMonitorStateException ser� lan�ada. Quando o m�todo wait() � chamado,
 * o estado da thread atual � alterado para ativo(execut�vel) e ela fica em
 * pausa esperando por uma notifica��o.
 * 
 * @author Matheus
 * 
 */
public class Espera {
	public static void main(String[] args) {
		ThreadB tb = new ThreadB();
		tb.setName("tb");
		tb.start();

		/*
		 * A thread atual deve possuir o bloqueio do objeto. Esta thread
		 * esperar� (e liberar� o bloqueio) at� que a threadB chame pelo m�todo
		 * notify() ou notifyAll(). Quando a threadB enviar a notifica��o, a
		 * thread principal recuperar� o bloqueio do objeto novamente e
		 * continuar� a sua execu��o normalmente.
		 */
		synchronized (tb) {
			System.out.println("Esperando por tb...");
			try {
				tb.wait();
				System.out.println("Fim da espera por tb...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		ThreadC tc = new ThreadC();
		tc.setName("tc");
		tc.start();
		synchronized (tc) {
			System.out.println("Esperando por tc...");
			try {

				/*
				 * Depois de 2 segundos, a thread atual tentar� obter o bloqueio
				 * de tc novamente e continuar� a sua execu��o normalmente mesmo
				 * sem a chamada a notify() por tc.
				 */
				tc.wait(2000);
				System.out.println("Fim da espera por tc...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadB extends Thread {

	public synchronized void run() {

		/*
		 * Para chamar m�todo notify(), a thread atual deve possuir o bloqueio
		 * deste objeto.
		 */
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			this.notify();
		}
	}
}

class ThreadC extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
