/* O modificador strictfp diz que uma classe ou um método seguirá
 * o padrão IEEE 754 para manipulação de variávis de ponto flutuante.
*/
public strictfp class App{
	public static void main(String[] args){
		float teste = 10;
		System.out.println(teste);
	}
	
}

/* É possível combinar os modificadores abstract e strictfp apenas
 * na declaração da classe abstrata. Isso não pode ser feito na 
 * declaração de um método.
 */
abstract strictfp class Teste{

	public abstract void metodo();
	
}

class Teste2 extends Teste{
	public strictfp void metodo(){
		
	}
}