package classe_interna;

import classe_interna.ClassesInternas.Inner;

/**
 * Para criar instâncias de classes internas dentro de métodos estáticos ou em
 * códigos que não fazem parte da classe externa, usa-se o operador new em
 * alguma instância da classe externa. Lembre-se, só pode existir instâncias de
 * uma classe interna se existir também uma instância da classe externa.
 * 
 * @author Matheus
 * 
 */
public class CriarInstanciaClasseInterna {// extends Inner{
	// Não é possível
	// extender uma classe interna fora
	// do código da classe interna,
	// porém é possível implementar
	// interfaces internas.

	/*
	 * Instanciando uma classe externa dentro de um método estático.
	 */
	public static void main(String[] args) {
		CriarInstanciaClasseInterna c = new CriarInstanciaClasseInterna();

		Inner i = new ClassesInternas().new Inner();
		i.metodoClasseInterna();

		c.instanciandoUmaClasseInterna();
		c.utilizandoThis();
	}

	/*
	 * Instanciando uma classe interna fora do código da classe externa.
	 */
	public void instanciandoUmaClasseInterna() {
		Inner i = new ClassesInternas().new Inner();
		i.metodoClasseInterna();
	}

	/*
	 * Por padrão, this referencia o objeto atual. É possível utilizá-lo com uma
	 * sintaxe um pouco diferente, ou seja, colocar o nome da classe antes dele.
	 * O Resultado será o mesmo.
	 */
	public void utilizandoThis() {
		// Sintaxe diferente de this.
		System.out.println(CriarInstanciaClasseInterna.this.hashCode());

		// ClassesInternas.this.metodoClasseExterna(); Sintaxe inválida! this
		// referencia sempre o objeto atual.
	}

}
