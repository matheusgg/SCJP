package estados.prioridade_yield;

/**
 * O método yield() faz com com que a Thread atual seja colocada no estado ativo
 * (executável) e que uma nova thread que tenha a mesma prioridade da thread que
 * chamou yield() seja executada.
 * 
 * @author Matheus
 * 
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 50) {
				/*
				 * Faz com que o estado da thread atual seja modificado para
				 * ativo que informa ao agendador de threads executar uma nova
				 * thread que possua o mesmo nível de prioridade da thread
				 * atual.
				 */
				Thread.yield();
			}
		}
	}

}
