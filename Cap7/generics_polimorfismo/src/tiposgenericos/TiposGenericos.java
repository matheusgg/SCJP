package tiposgenericos;

import java.util.ArrayList;
import java.util.List;

public class TiposGenericos {

	public static void main(String[] args) {
		TiposGenericos t = new TiposGenericos();
		t.codigoLegadoEGenerics();
	}

	@SuppressWarnings("unchecked")
	public void codigoLegadoEGenerics() {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}

		/*
		 * Quando o m�todo retornar a lista, ela ainda ser� uma lista de
		 * Integer, por�m, na verdade ela j� se tornou uma lista de Object e
		 * armazena uma String!!! Quando a lista for impressa, uma exce��o em
		 * tempo de execu��o ser� lan�ada.
		 */
		lista = this.codigoAntigo(lista);

		System.out.println(lista);
		// true = Significa que � uma lista de Object (qualquer coisa)
		System.out.println(lista instanceof List<?>);
		/*
		 * A informa��o do tipo parametrizado ser� removida dos bytecodes, por
		 * este motivo, n�o � poss�vel utilizar o instanceof desta forma.
		 */
		// System.out.println(lista instanceof List<Integer>);

		/*
		 * Uma exce��o ser� lan�ada no �ltimo elemento
		 */
		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}

	/**
	 * Para n�o perder a compatibilidade, c�digos antigos como este ser�o
	 * compilados e executados corretamente, mesmo que seja passado um List de
	 * Integer's, ele converter� para um List de Object, desta forma, ser�
	 * poss�vel inserir qualquer coisa dentro da lista!!! Isso acontece porque
	 * os Tipos Parametrizados servem apenas de informa��o para o compilador,
	 * isto �, quando os bytecodes s�o gerados, o compilador retira todos os
	 * tipos parametrizados, desta forma, o c�digo fica exatamente como era
	 * antes dos Generics, por este motivo, n�o ocorrem nem erros de compila��o
	 * e muitos menos de execu��o!!!
	 * 
	 * @param lista
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List codigoAntigo(List lista) {
		for (Object object : lista) {
			System.out.println(object);
		}
		lista.add("Teste"); // Isso � MUITO RUIM!!!
		return lista;
	}

}
