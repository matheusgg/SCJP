package serializacao;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * � poss�vel interferir no processo de serializa��o e deserializa��o de
 * objetos. Para isso, basta escrever dois m�todos com determinadas assinaturas
 * e os mesmos ser�o chamados automaticamente durante o processo. Desta forma, �
 * poss�vel salvar manualmente o estado de vari�veis de inst�ncias marcadas como
 * transient.
 * 
 * @author Matheus
 * 
 */
public class Cat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5629978724868479166L;
	private String nome;
	private CatToy toy;
	/*
	 * Transient faz com que o atributo seja ignorado no momento da
	 * serializa��o, isto �, o seu estado n�o � salvo automaticamente.
	 */
	private transient int idade;
	private transient int peso;
	private transient String nomeDono;

	/**
	 * Na deserializa��o, quando a classe � marcada como Serializable, o
	 * contrutor n�o � executado!!!
	 */
	public Cat() {
		System.out.println();
	}

	/*
	 * M�todos que fazem parte do contrato do mecanismo de serializa��o. Eles
	 * ser�o chamados automaticamente durande o processo de serializa��o e
	 * deserializa��o respectivamente. Estes m�todos t�m que possuir exatamente
	 * estas assinaturas e serem privados.
	 */
	private void writeObject(ObjectOutputStream os) {
		try {
			/*
			 * A chamada deste m�todo est� restrita a este ponto, ele s� pode
			 * ser invocado dentro do m�todo writeObject do objeto que est�
			 * sendo serializado. Caso contr�rio, uma exce��o ser� gerada.
			 */
			os.defaultWriteObject(); // Fala para a JVM realizar o processo
										// normal de escrita.
			os.writeInt(this.idade);
			os.writeInt(this.peso);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		try {
			/*
			 * A chamada deste m�todo est� restrita a este ponto, ele s� pode
			 * ser invocado dentro do m�todo readObject do objeto que est� sendo
			 * deserializado. Caso contr�rio, uma exce��o ser� gerada.
			 */
			is.defaultReadObject();// Fala para a JVM realizar o processo normal
									// de leitura.

			/*
			 * � preciso fazer a leitura na mesma ordem de escrita.
			 */
			this.idade = is.readInt();
			this.peso = is.readInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade
	 *            the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the toy
	 */
	public CatToy getToy() {
		return toy;
	}

	/**
	 * @param toy
	 *            the toy to set
	 */
	public void setToy(CatToy toy) {
		this.toy = toy;
	}

	/**
	 * @return the nomeDono
	 */
	public String getNomeDono() {
		return nomeDono;
	}

	/**
	 * @param nomeDono
	 *            the nomeDono to set
	 */
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
