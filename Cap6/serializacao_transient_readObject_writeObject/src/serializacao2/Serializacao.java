package serializacao2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Superclasses não serializáveis não terão seus atributos salvos!!!
 * 
 * @author Matheus
 * 
 */
public class Serializacao {
	public static void main(String[] args) throws Exception {
		Serializacao s = new Serializacao();
		s.testeSerializacaoComHeranca();
	}

	public void testeSerializacaoComHeranca() throws Exception {
		String file = "C:\\Users\\Matheus\\Downloads\\obj.ser";
		Dog d = new Dog("Dog Teste", "Brincadeira Teste");

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
		os.writeObject(d);
		os.flush();
		os.close();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
		Dog d2 = (Dog) is.readObject();
		is.close();

		System.out.println("Nome: " + d2.getNome());
		System.out.println("Brincadeira: " + d2.getBrincadeiraFavorita());
	}

}
