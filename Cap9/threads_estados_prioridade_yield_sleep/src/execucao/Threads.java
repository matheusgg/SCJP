package execucao;

/**
 * N�o h� garantias de ordem quando se trabalha com Threads, somente uma coisa �
 * certa, a Thread ser� iniciada e conclu�da, por�m quando h� v�rias Threads em
 * execu��o, pode haver oscila��o entre elas de tal forma que a ordem n�o �
 * previs�vel. A �nica coisa previs�vel � que dentro de uma Thread (pilha de
 * chamadas) tudo ocorre de forma normal, ou seja, a execu��o dentro de uma
 * Thread � perfeitamente linear.
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
	 * N�o h� como prever a ordem de execu��o das Threads, � poss�vel saber
	 * apenas que ser�o executadas e conclu�das.
	 */
	public void testeThreads() {
		MyRunnable mr = new MyRunnable();

		Thread t1 = new Thread(mr, "Um"); // Estado - new(novo)
		/*
		 * Uma Thread s� pode apenas ser executada uma vez, ou seja, o m�todo
		 * start() s� pode ser chamado uma vez, caso ele seja invocado novamente
		 * uma exce��o ser� gerada.
		 */
		t1.start(); // Estado - runnable(execut�vel)

		Thread t2 = new Thread(mr, "Dois");
		Thread t3 = new Thread(mr, "Tr�s");

		t2.start();
		t3.start();

		// Isso gerar� uma exce��o!
		t1.start(); // Esta Thread esta com o estado desativada (morta)
	}

}
