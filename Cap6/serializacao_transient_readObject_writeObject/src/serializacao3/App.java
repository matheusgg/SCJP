package serializacao3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		App a = new App();
		a.testeSerializacao1();
	}

	public void testeSerializacao1() throws IOException, ClassNotFoundException {
		String file = "C:\\Users\\Matheus\\Downloads\\obj.ser";

		Endereco e = new Endereco("Rua Teste", "04419-140");
		Secretaria s = new Secretaria(e, "Secretaria", 2000, 40);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
		os.writeObject(s);
		os.flush();
		os.close();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
		Secretaria sec = (Secretaria) is.readObject();
		is.close();

		System.out.println(sec.getNome());
		System.out.println(sec.getSalario());
		System.out.println(sec.getEndereco().getRua());
		System.out.println(sec.getEndereco().getCep());
		System.out.println(sec.getQtdTelefonemasHj());

	}

}
