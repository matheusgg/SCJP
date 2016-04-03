package wait_notify_notifyAll;

/**
 * O método wait() faz com que a thread atual espere pela thread que chamou o
 * método até que a mesma notifique que encerrou as suas atividades, ou seja,
 * até que a thread que chamou o método wait() chame o método notify() ou
 * notifyAll(). Para chamar o método wait(), notify() ou notifyAll(), a thread
 * atual deve possuir o bloqueio do objeto, senão uma
 * IllegalMonitorStateException será lançada. Quando o método wait() é chamado,
 * o estado da thread atual é alterado para ativo(executável) e ela fica em
 * pausa esperando por uma notificação.
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
		 * esperará (e liberará o bloqueio) até que a threadB chame pelo método
		 * notify() ou notifyAll(). Quando a threadB enviar a notificação, a
		 * thread principal recuperará o bloqueio do objeto novamente e
		 * continuará a sua execução normalmente.
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
				 * Depois de 2 segundos, a thread atual tentará obter o bloqueio
				 * de tc novamente e continuará a sua execução normalmente mesmo
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
		 * Para chamar método notify(), a thread atual deve possuir o bloqueio
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
