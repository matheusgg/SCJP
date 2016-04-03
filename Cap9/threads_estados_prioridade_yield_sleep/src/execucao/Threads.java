package execucao;

/**
 * Não há garantias de ordem quando se trabalha com Threads, somente uma coisa é
 * certa, a Thread será iniciada e concluída, porém quando há várias Threads em
 * execução, pode haver oscilação entre elas de tal forma que a ordem não é
 * previsível. A única coisa previsível é que dentro de uma Thread (pilha de
 * chamadas) tudo ocorre de forma normal, ou seja, a execução dentro de uma
 * Thread é perfeitamente linear.
 * 
 * @author Matheus
 * 
 */
public class Threads {
	public static void main(String[] args) {
		Threads t = new Threads();
		t.testeThreads();
	}

	/**
	 * Não há como prever a ordem de execução das Threads, é possível saber
	 * apenas que serão executadas e concluídas.
	 */
	public void testeThreads() {
		MyRunnable mr = new MyRunnable();

		Thread t1 = new Thread(mr, "Um"); // Estado - new(novo)
		/*
		 * Uma Thread só pode apenas ser executada uma vez, ou seja, o método
		 * start() só pode ser chamado uma vez, caso ele seja invocado novamente
		 * uma exceção será gerada.
		 */
		t1.start(); // Estado - runnable(executável)

		Thread t2 = new Thread(mr, "Dois");
		Thread t3 = new Thread(mr, "Três");

		t2.start();
		t3.start();

		// Isso gerará uma exceção!
		t1.start(); // Esta Thread esta com o estado desativada (morta)
	}

}
