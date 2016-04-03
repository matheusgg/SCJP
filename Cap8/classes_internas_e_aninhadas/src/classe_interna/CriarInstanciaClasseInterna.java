package classe_interna;

import classe_interna.ClassesInternas.Inner;

/**
 * Para criar inst�ncias de classes internas dentro de m�todos est�ticos ou em
 * c�digos que n�o fazem parte da classe externa, usa-se o operador new em
 * alguma inst�ncia da classe externa. Lembre-se, s� pode existir inst�ncias de
 * uma classe interna se existir tamb�m uma inst�ncia da classe externa.
 * 
 * @author Matheus
 * 
 */
public class CriarInstanciaClasseInterna {// extends Inner{
	// N�o � poss�vel
	// extender uma classe interna fora
	// do c�digo da classe interna,
	// por�m � poss�vel implementar
	// interfaces internas.

	/*
	 * Instanciando uma classe externa dentro de um m�todo est�tico.
	 */
	public static void main(String[] args) {
		CriarInstanciaClasseInterna c = new CriarInstanciaClasseInterna();

		Inner i = new ClassesInternas().new Inner();
		i.metodoClasseInterna();

		c.instanciandoUmaClasseInterna();
		c.utilizandoThis();
	}

	/*
	 * Instanciando uma classe interna fora do c�digo da classe externa.
	 */
	public void instanciandoUmaClasseInterna() {
		Inner i = new ClassesInternas().new Inner();
		i.metodoClasseInterna();
	}

	/*
	 * Por padr�o, this referencia o objeto atual. � poss�vel utiliz�-lo com uma
	 * sintaxe um pouco diferente, ou seja, colocar o nome da classe antes dele.
	 * O Resultado ser� o mesmo.
	 */
	public void utilizandoThis() {
		// Sintaxe diferente de this.
		System.out.println(CriarInstanciaClasseInterna.this.hashCode());

		// ClassesInternas.this.metodoClasseExterna(); Sintaxe inv�lida! this
		// referencia sempre o objeto atual.
	}

}
