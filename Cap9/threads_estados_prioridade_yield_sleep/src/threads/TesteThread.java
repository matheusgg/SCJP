package threads;

/**
 * H� duas formas de se criar uma Thread, estendendo a classe Thread ou
 * implementando a interface Runnable. Quando uma nova Thread � criada, ou seja,
 * quando um novo objeto do tipo Thread � criado, o seu estado � considerado
 * NOVO. Quando uma Thread � iniciada, o seu estado � considerado ATIVO, por
 * fim, quando uma Thread � encerrada, o seu estado � DESATIVADO.
 * 
 * @author Matheus
 * 
 */
public class TesteThread {
	public static void main(String... args) {
		TesteThread t = new TesteThread();
		t.testeThread();
	}

	public void testeThread() {
		/*
		 * Com esta abordagem, o m�todo run ser� chamado automaticamente neste
		 * objeto, pois MyThread estende Thread.
		 */
		MyThread mt = new MyThread("Thread 1");
		mt.start();

		/*
		 * Desta forma, um Runnable (trabalho a ser executado) � passado ao
		 * objeto do tipo Thread (o trabalhador), e o m�todo run de MyRannable
		 * ser� executado.
		 */
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr, "Thread 2");
		t.start();
	}

}

/**
 * Implementando Runnable
 * 
 * @author Matheus
 * 
 */
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Dentro do m�todo run de MyRunnable!!!");
		System.out.println(Thread.currentThread().getName());
	}
}

/**
 * Estendendo Thread.
 * 
 * @author Matheus
 * 
 */
class MyThread extends Thread {

	public MyThread(String nome) {
		super(nome);
	}

	@Override
	public void run() {
		System.out.println("Dentro do m�todo run!!!");
		System.out.println(Thread.currentThread().getName());
	}
}
