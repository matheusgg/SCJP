package serializacao2;

import java.io.Serializable;

/**
 * Quando uma classe que será serializada for uma subclasse de uma classe que
 * não implementa Serializable, toda a parte herdada não será serializada, ou
 * seja, tudo que for referente a superclasse que não implementa Serializable
 * não terá seu estado salvo, pois o construtor padrão da superclasse é
 * executado, com isso, os valores padrões das variáveis de instância são
 * atribuídos, deste modo, estes atributos perdem o seu estado salvo no momento
 * da serialização, pois são resetados.
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
	 * É possível contornar o proble da herança utilizando os métodos do
	 * contrato do mecanismo de serialização, pois eles são executados após a
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
