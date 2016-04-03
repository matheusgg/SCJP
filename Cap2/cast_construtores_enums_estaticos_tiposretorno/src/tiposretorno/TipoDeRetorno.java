package tiposretorno;

import java.util.ArrayList;
import java.util.List;

public class TipoDeRetorno {

	public List<String> metodo() {
		return null;
	}

	public void metodo2(String nome) {

	}

}

class Class2 extends TipoDeRetorno {

	/*
	 * É possível modificar o tipo de retorno de um método sobrescrito, desde
	 * que este tipo seja um subtipo do tipo declarado na superclasse. Isso se
	 * chama "retorno covariante".
	 */
	public ArrayList<String> metodo() {
		return null;
	}

	/*
	 * Sobrecarga
	 */
	public void metodo2(String... nomes) {

	}
}
