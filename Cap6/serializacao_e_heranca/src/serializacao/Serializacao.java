package serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;

/**
 * Apesar de Animal não implementar Serializable, o mecanismo de serialização
 * verificará se a classe da qual o OBJETO (que é do tipo Dog) foi construído
 * implementa Serializable. A serialização em java trabalha com objetos!
 * 
 * @author Matheus
 * 
 */
public class Serializacao {
	public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
		Animal a = new Dog("Teste");
		String file = "C:\\Users\\Matheus\\Downloads\\teste.txt";
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
		/*
		 * Na verdade, o objeto em questão é um Dog, não um Animal, por isso
		 * funcionará.
		 */
		os.writeObject(a);
		os.close();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
		Animal a2 = (Animal) is.readObject();
		is.close();
		System.out.println(((Dog) a2).getNome());
	}

}

class Animal {

}

class Dog extends Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4952231124459988866L;
	private String nome;

	public Dog(String nome) {
		this.nome = nome;
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

}
