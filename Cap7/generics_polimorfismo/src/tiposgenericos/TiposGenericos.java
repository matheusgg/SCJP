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
		 * Quando o método retornar a lista, ela ainda será uma lista de
		 * Integer, porém, na verdade ela já se tornou uma lista de Object e
		 * armazena uma String!!! Quando a lista for impressa, uma exceção em
		 * tempo de execução será lançada.
		 */
		lista = this.codigoAntigo(lista);

		System.out.println(lista);
		// true = Significa que é uma lista de Object (qualquer coisa)
		System.out.println(lista instanceof List<?>);
		/*
		 * A informação do tipo parametrizado será removida dos bytecodes, por
		 * este motivo, não é possível utilizar o instanceof desta forma.
		 */
		// System.out.println(lista instanceof List<Integer>);

		/*
		 * Uma exceção será lançada no último elemento
		 */
		for (Integer integer : lista) {
			System.out.println(integer);
		}
	}

	/**
	 * Para não perder a compatibilidade, códigos antigos como este serão
	 * compilados e executados corretamente, mesmo que seja passado um List de
	 * Integer's, ele converterá para um List de Object, desta forma, será
	 * possível inserir qualquer coisa dentro da lista!!! Isso acontece porque
	 * os Tipos Parametrizados servem apenas de informação para o compilador,
	 * isto é, quando os bytecodes são gerados, o compilador retira todos os
	 * tipos parametrizados, desta forma, o código fica exatamente como era
	 * antes dos Generics, por este motivo, não ocorrem nem erros de compilação
	 * e muitos menos de execução!!!
	 * 
	 * @param lista
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List codigoAntigo(List lista) {
		for (Object object : lista) {
			System.out.println(object);
		}
		lista.add("Teste"); // Isso é MUITO RUIM!!!
		return lista;
	}

}
