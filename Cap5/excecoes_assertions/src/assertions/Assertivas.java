package assertions;

/**
 * Assertivas s�o instru��es que permitem verificar partes do c�digo, ou
 * suposi��es, durante o desenvolvimento para valida��o de uma determinada
 * l�gica ou regra de neg�cio. Para ativar as assertions na linha de comando
 * basta informar os par�metros -ea ou -enableassertions. Para desativar, basta
 * informar os par�metros -da ou -desableassetions, ou simplesmente n�o
 * inform�-los.
 * 
 * -ea, -enableassertions >>>>>>>> Habilita Assertios.
 * -da, -deaableassertions >>>>>>>> Desabilita Assertios.
 * -ea:assertions... >>>>>>>> Habilita Assetions para o pacote informado e todos os subpacotes.
 * -da:assertions... >>>>>>>> Desabilita Assetions para o pacote informado e todos os subpacotes.
 * -esa >>>>>>>> Habilita Assertios para as classes do sistema.
 * -dsa >>>>>>>> Desabilita Assertios para as classes do sistema.
 * 
 * @author Matheus
 * 
 */
public class Assertivas {
	public static void main(String[] args) {
		Assertivas a = new Assertivas();
		a.assertionsMuitoSimples(-10);
		a.assertionsSimples(5);
	}

	/**
	 * Uma instru��o assert verifica se uma determinada condi��o � verdadeira.
	 * Caso a consi��o seja falsa, � lan�ada uma AssertionError.
	 * 
	 * @param num
	 */
	public void assertionsMuitoSimples(int num) {
		assert (num >= 0); // Lan�a uma AssertionError se num for <= 0.
		System.out.println("OK >>>>>>>>>>>>> " + num);
	}

	/**
	 * Esta segunda sintaxe adiciona mais informa��es ao rastro da pilha de
	 * exce��es.
	 * 
	 * @param num
	 */
	public void assertionsSimples(int num) {
		assert (num > 10) : "O n�mero informado n�o � maior que 10!!!";
		System.out.println("OK >>>>>>>>>>>> " + num);
	}
}
