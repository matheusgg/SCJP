package assertions;

/**
 * Assertivas são instruções que permitem verificar partes do código, ou
 * suposições, durante o desenvolvimento para validação de uma determinada
 * lógica ou regra de negócio. Para ativar as assertions na linha de comando
 * basta informar os parâmetros -ea ou -enableassertions. Para desativar, basta
 * informar os parâmetros -da ou -desableassetions, ou simplesmente não
 * informá-los.
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
	 * Uma instrução assert verifica se uma determinada condição é verdadeira.
	 * Caso a consição seja falsa, é lançada uma AssertionError.
	 * 
	 * @param num
	 */
	public void assertionsMuitoSimples(int num) {
		assert (num >= 0); // Lança uma AssertionError se num for <= 0.
		System.out.println("OK >>>>>>>>>>>>> " + num);
	}

	/**
	 * Esta segunda sintaxe adiciona mais informações ao rastro da pilha de
	 * exceções.
	 * 
	 * @param num
	 */
	public void assertionsSimples(int num) {
		assert (num > 10) : "O número informado não é maior que 10!!!";
		System.out.println("OK >>>>>>>>>>>> " + num);
	}
}
