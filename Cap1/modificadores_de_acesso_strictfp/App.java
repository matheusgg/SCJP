/* O modificador strictfp diz que uma classe ou um m�todo seguir�
 * o padr�o IEEE 754 para manipula��o de vari�vis de ponto flutuante.
*/
public strictfp class App{
	public static void main(String[] args){
		float teste = 10;
		System.out.println(teste);
	}
	
}

/* � poss�vel combinar os modificadores abstract e strictfp apenas
 * na declara��o da classe abstrata. Isso n�o pode ser feito na 
 * declara��o de um m�todo.
 */
abstract strictfp class Teste{

	public abstract void metodo();
	
}

class Teste2 extends Teste{
	public strictfp void metodo(){
		
	}
}