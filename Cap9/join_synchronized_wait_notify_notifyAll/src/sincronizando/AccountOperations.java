package sincronizando;

/**
 * Quando um m�todo � marcado como synchronized, significa que apenas uma thread
 * de cada vez poder� executar o c�digo deste m�todo. Ou seja, quando �
 * utilizado o bloqueio, o objeto inteiro permanece bloqueado, em outras
 * palavras, quando uma thread executa um m�todo synchronized, o objeto se torna
 * bloqueado, e nenhum outro m�todo synchronized n�o-est�tico deste objeto
 * poder� ser acessado por nenhuma thread enquando este objeto n�o seja liberado
 * pela thread que o bloqueou. O BLOQUEIO OCORRE POR OBJETO, E CADA OBJETO
 * POSSUI APENAS UM BLOQUEIO. M�todos est�ticos tamb�m podem ser sincronizados,
 * desta forma todos os m�todos est�ticos da classe que forem synchronized ser�o
 * bloqueados, por�m os m�todos n�o-est�tios n�o ser�o bloqueados, mesmo que
 * sejam sincronizados. O modificador synchronized, assim como strictfp, n�o
 * entra na assinatura de m�todos e n�o afetam a sobrecarga ou sobrescrita.
 * Synchronized e strictfp n�o podem ser aplicados a m�todos abstratos (classes
 * abstratas e interfaces).
 * 
 * 
 * @author Matheus
 * 
 */
public class AccountOperations implements Runnable {

	/*
	 * O modificador synchronized n�o pode ser aplicado para vari�veis de
	 * inst�ncia, para resolver isso, � utilizado o modificador 'volatile', que
	 * possui a mesma fun��o de synchronized e � aplicado � vari�veis.
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
	 * O modificador synchronized faz com que este m�todo fique bloqueado
	 * enquando � utilizado por alguma thread, desta forma, nenhuma thread
	 * poder� executar este c�digo enquanto este estiver sendo utilizado por
	 * outra thread. Outras threads s� podem executar este c�digo quando ele for
	 * liberado pela thread que o bloqueou. Desta forma, � evitado problemas de
	 * concorr�ncia e inconsist�ncia de dados.
	 * 
	 * @param qtd
	 */
	public synchronized void saque(int qtd) {
		if (this.account.getValor() >= qtd) {
			System.out.println(Thread.currentThread().getName() + " est� sacando...");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			this.account.saque(qtd);
			System.out.println(Thread.currentThread().getName() + " completou o saque.");
		} else {
			System.out.println("O saldo � insuficiente para " + Thread.currentThread().getName() + ": " + this.account.getValor());
		}
	}

	/**
	 * � poss�vel bloquear apenas uma parte do c�digo. Desta forma, deve-se
	 * especificar o objeto que ser� bloqueado. Neste caso, o objeto bloqueado �
	 * o objeto atual (this). Esta sintaxe � chamada de 'bloco sincronizado'.
	 */
	public void testBlock() {
		System.out.println(Thread.currentThread().getName() + " n�o sincronizado!");

		/*
		 * Desta forma, o objeto atual (this) � utilizado para o bloqueio. Este
		 * bloco s� pode apenas ser executado por uma thread de cada vez, isto
		 * �, a thread que estier executando este bloco, possuir� o bloqueio do
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
