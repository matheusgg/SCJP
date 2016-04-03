package serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Com a serialização é possível "empacotar" um objeto salvando o seu estado
 * atual. O processo de "desempacotamento" é chamado de deserialização. Para ser
 * serializado o objeto e todo o seu grafo de objetos devem implementar a
 * interface Serializable. Porém, se a variável de instância que referencia um
 * objeto estiver nula, não é necessário a implementação de Serializable, pois
 * este estado não será salvo. Caso algum atributo esteja marcado como
 * transient, significa que seu estado não será salvo.
 * 
 * @author Matheus
 * 
 */
public class Serializacao {
	public static void main(String... args) {
		Serializacao s = new Serializacao();
		try {
			s.testeObjectOutputInput();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void testeObjectOutputInput() throws IOException, ClassNotFoundException {
		Cat c = new Cat();
		c.setNome("Gato");
		c.setNomeDono("Matheus");
		c.setIdade(10);
		c.setPeso(30);
		c.setToy(new CatToy("Bolinha"));

		/*
		 * Serializa o objeto
		 */
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Matheus\\Downloads\\arquivo.txt"));
		os.writeObject(c);
		os.flush();
		os.close();

		/*
		 * Deserializa o objeto
		 */
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("C:\\Users\\Matheus\\Downloads\\arquivo.txt"));
		Cat c2 = (Cat) oi.readObject();
		oi.close();

		System.out.println("Nome: " + c2.getNome());
		System.out.println("Dono: " + c2.getNomeDono());
		System.out.println("Idadde: " + c2.getIdade());
		System.out.println("Peso: " + c2.getPeso());
		System.out.println("Brinquedo: " + c2.getToy().getToyName());
	}

}