package threads;

/**
 * Há duas formas de se criar uma Thread, estendendo a classe Thread ou
 * implementando a interface Runnable. Quando uma nova Thread é criada, ou seja,
 * quando um novo objeto do tipo Thread é criado, o seu estado é considerado
 * NOVO. Quando uma Thread é iniciada, o seu estado é considerado ATIVO, por
 * fim, quando uma Thread é encerrada, o seu estado é DESATIVADO.
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
		 * Com esta abordagem, o método run será chamado automaticamente neste
		 * objeto, pois MyThread estende Thread.
		 */
		MyThread mt = new MyThread("Thread 1");
		mt.start();

		/*
		 * Desta forma, um Runnable (trabalho a ser executado) é passado ao
		 * objeto do tipo Thread (o trabalhador), e o método run de MyRannable
		 * será executado.
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
		System.out.println("Dentro do método run de MyRunnable!!!");
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
		System.out.println("Dentro do método run!!!");
		System.out.println(Thread.currentThread().getName());
	}
}
