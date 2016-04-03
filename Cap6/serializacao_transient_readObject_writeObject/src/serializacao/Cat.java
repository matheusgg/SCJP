package serializacao;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * É possível interferir no processo de serialização e deserialização de
 * objetos. Para isso, basta escrever dois métodos com determinadas assinaturas
 * e os mesmos serão chamados automaticamente durante o processo. Desta forma, é
 * possível salvar manualmente o estado de variáveis de instâncias marcadas como
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
	 * serialização, isto é, o seu estado não é salvo automaticamente.
	 */
	private transient int idade;
	private transient int peso;
	private transient String nomeDono;

	/**
	 * Na deserialização, quando a classe é marcada como Serializable, o
	 * contrutor não é executado!!!
	 */
	public Cat() {
		System.out.println();
	}

	/*
	 * Métodos que fazem parte do contrato do mecanismo de serialização. Eles
	 * serão chamados automaticamente durande o processo de serialização e
	 * deserialização respectivamente. Estes métodos têm que possuir exatamente
	 * estas assinaturas e serem privados.
	 */
	private void writeObject(ObjectOutputStream os) {
		try {
			/*
			 * A chamada deste método está restrita a este ponto, ele só pode
			 * ser invocado dentro do método writeObject do objeto que está
			 * sendo serializado. Caso contrário, uma exceção será gerada.
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
			 * A chamada deste método está restrita a este ponto, ele só pode
			 * ser invocado dentro do método readObject do objeto que está sendo
			 * deserializado. Caso contrário, uma exceção será gerada.
			 */
			is.defaultReadObject();// Fala para a JVM realizar o processo normal
									// de leitura.

			/*
			 * É preciso fazer a leitura na mesma ordem de escrita.
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
