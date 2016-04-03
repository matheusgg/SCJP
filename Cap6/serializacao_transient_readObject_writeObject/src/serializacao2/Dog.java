package serializacao2;

import java.io.Serializable;

/**
 * Quando uma classe que ser� serializada for uma subclasse de uma classe que
 * n�o implementa Serializable, toda a parte herdada n�o ser� serializada, ou
 * seja, tudo que for referente a superclasse que n�o implementa Serializable
 * n�o ter� seu estado salvo, pois o construtor padr�o da superclasse �
 * executado, com isso, os valores padr�es das vari�veis de inst�ncia s�o
 * atribu�dos, deste modo, estes atributos perdem o seu estado salvo no momento
 * da serializa��o, pois s�o resetados.
 * 
 * @author Matheus
 * 
 */
public class Dog extends Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9108779415722701867L;
	private String brincadeiraFavorita;

	public Dog(String nome, String brincadeiraFavorita) {
		super(nome);
		this.brincadeiraFavorita = brincadeiraFavorita;
	}

	public Dog() {
		System.out.print("");
	}

	/*
	 * � poss�vel contornar o proble da heran�a utilizando os m�todos do
	 * contrato do mecanismo de serializa��o, pois eles s�o executados ap�s a
	 * construtor da superclasse.
	 */
	// private void writeObject(ObjectOutputStream os) {
	// try {
	// os.defaultWriteObject();
	// os.writeObject(this.getNome());
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	//
	// private void readObject(ObjectInputStream is) {
	// try {
	// is.defaultReadObject();
	// this.setNome(String.valueOf(is.readObject()));
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }

	/**
	 * @return the brincadeiraFavorita
	 */
	public String getBrincadeiraFavorita() {
		return brincadeiraFavorita;
	}

	/**
	 * @param brincadeiraFavorita
	 *            the brincadeiraFavorita to set
	 */
	public void setBrincadeiraFavorita(String brincadeiraFavorita) {
		this.brincadeiraFavorita = brincadeiraFavorita;
	}

}
