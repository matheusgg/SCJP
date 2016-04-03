package estados.sleep;

/**
 * O método estático sleep() faz a thread entrar em suspensão por um determinado
 * tempo.
 * 
 * @author Matheus
 * 
 */
public class Sleeping {

	public static void main(String[] args) {
		Sleeping s = new Sleeping();
		s.testeThread();
	}

	public void testeThread() {
		Thread t1 = new Thread(new MyRunnable(), "t1");
		Thread t2 = new Thread(new MyRunnable(), "t2");

		t1.start();
		t2.start();
	}

}
