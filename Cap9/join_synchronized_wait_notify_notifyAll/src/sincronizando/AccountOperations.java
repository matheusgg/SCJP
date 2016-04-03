package sincronizando;

/**
 * Quando um método é marcado como synchronized, significa que apenas uma thread
 * de cada vez poderá executar o código deste método. Ou seja, quando é
 * utilizado o bloqueio, o objeto inteiro permanece bloqueado, em outras
 * palavras, quando uma thread executa um método synchronized, o objeto se torna
 * bloqueado, e nenhum outro método synchronized não-estático deste objeto
 * poderá ser acessado por nenhuma thread enquando este objeto não seja liberado
 * pela thread que o bloqueou. O BLOQUEIO OCORRE POR OBJETO, E CADA OBJETO
 * POSSUI APENAS UM BLOQUEIO. Métodos estáticos também podem ser sincronizados,
 * desta forma todos os métodos estáticos da classe que forem synchronized serão
 * bloqueados, porém os métodos não-estátios não serão bloqueados, mesmo que
 * sejam sincronizados. O modificador synchronized, assim como strictfp, não
 * entra na assinatura de métodos e não afetam a sobrecarga ou sobrescrita.
 * Synchronized e strictfp não podem ser aplicados a métodos abstratos (classes
 * abstratas e interfaces).
 * 
 * 
 * @author Matheus
 * 
 */
public class AccountOperations implements Runnable {

	/*
	 * O modificador synchronized não pode ser aplicado para variáveis de
	 * instância, para resolver isso, é utilizado o modificador 'volatile', que
	 * possui a mesma função de synchronized e é aplicado à variáveis.
	 */
	private Account account = new Account();

	public static void main(String[] args) {
		AccountOperations a = new AccountOperations();
		Thread one = new Thread(a, "Fred");
		Thread two = new Thread(a, "Lucy");

		one.start();
		two.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			this.testBlock();
			// this.saque(10);
			// if (this.account.getValor() < 0) {
			// System.out.println("Saldo insuficiente!");
			// }
		}
	}

	/**
	 * O modificador synchronized faz com que este método fique bloqueado
	 * enquando é utilizado por alguma thread, desta forma, nenhuma thread
	 * poderá executar este código enquanto este estiver sendo utilizado por
	 * outra thread. Outras threads só podem executar este código quando ele for
	 * liberado pela thread que o bloqueou. Desta forma, é evitado problemas de
	 * concorrência e inconsistência de dados.
	 * 
	 * @param qtd
	 */
	public synchronized void saque(int qtd) {
		if (this.account.getValor() >= qtd) {
			System.out.println(Thread.currentThread().getName() + " está sacando...");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			this.account.saque(qtd);
			System.out.println(Thread.currentThread().getName() + " completou o saque.");
		} else {
			System.out.println("O saldo é insuficiente para " + Thread.currentThread().getName() + ": " + this.account.getValor());
		}
	}

	/**
	 * É possível bloquear apenas uma parte do código. Desta forma, deve-se
	 * especificar o objeto que será bloqueado. Neste caso, o objeto bloqueado é
	 * o objeto atual (this). Esta sintaxe é chamada de 'bloco sincronizado'.
	 */
	public void testBlock() {
		System.out.println(Thread.currentThread().getName() + " não sincronizado!");

		/*
		 * Desta forma, o objeto atual (this) é utilizado para o bloqueio. Este
		 * bloco só pode apenas ser executado por uma thread de cada vez, isto
		 * é, a thread que estier executando este bloco, possuirá o bloqueio do
		 * objeto atual.
		 */
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " sincronizado!");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
