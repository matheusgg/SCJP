package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Quando se trabalha com cole��es vinculadas, os m�todos subSet(), headSet(),
 * tailSet(), subMap(), headMap() e tailMap() retornam cole��es de cont�m um
 * determinado range, e caso alguma altera��o ocorra dentro da cole��o original
 * e esta altera��o estiver dentro do range das subcole��es, ambas ser�o
 * alteradas, e vice-versa. N�o � poss�vel fazer uma altera��o fora do range na
 * subcole��o.
 * 
 * @author Matheus
 * 
 */
public class Colecoes {
	public static void main(String... args) {
		Colecoes l = new Colecoes();
		// l.testeList();
		// l.testSet();
		// l.testeMap();
		// l.colecoesVinculadas();
		// l.colecoesVinculadas2();
		l.priorityQueue();
	}

	public void priorityQueue() {
		// PriorityQueue<Integer> pq = new PriorityQueue<>();
		// for (int i = 10; i >= 0; i--) {
		// // O m�todo add() chama offer() internamente
		// pq.add(i);
		// }
		//
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());
		// System.out.println(pq.poll());

		PriorityQueue<Integer> pq2 = new PriorityQueue<>(10, new Comparador());
		for (int i = 10; i >= 0; i--) {
			// O m�todo add() chama offer() internamente
			pq2.add(i);
		}

		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());

		System.out.println("\n==============================\nTopo: " + pq2.peek());
		System.out.println("Size: " + pq2.size());
	}

	public void colecoesVinculadas2() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(5);
		ts.add(7);
		ts.add(19);
		ts.add(21);

		SortedSet<Integer> ss = ts.subSet(3, 10);

		System.out.println(ts);
		System.out.println(ss);

		/*
		 * Adicionando valores nos dois set, pois estes valores est�o dentro do
		 * range do subset.
		 */
		ts.add(4);
		ts.add(8);
		System.out.println(ts);
		System.out.println(ss);

		/*
		 * Exce��o em tempo de excecu��o. 40 est� fora do range do subset.
		 */
		// ss.add(40);

		ss.add(9);
		ss.remove(4); // Remo��o dos dois sets
		System.out.println(ts);
		System.out.println(ss);
	}

	public void colecoesVinculadas() {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("a", 1);
		map.put("c", 31);
		map.put("d", 145);
		map.put("h", 122);

		/*
		 * Cria um submap a partir da chave informada at� a segunda chave
		 * informada.
		 */
		SortedMap<String, Integer> sm = map.subMap("b", "g");
		System.out.println(map);
		System.out.println(sm);

		/*
		 * Adiciona mais itens ao map original. Com isso, o submap ganhar� mais
		 * um item. O item de chave 'b' ser� adicionado ao submap, pois est�
		 * dentro do range especificado.
		 */
		map.put("b", 736);
		map.put("i", 736);

		/*
		 * Ser� adicionado mais um item nos dois maps. Quando um item �
		 * adicionado ao submap, sua chave deve estar dentro do range
		 * especificado na cria��o do mesmo.
		 */
		// Exce��o de tempo de excecu��o. 'h' n�o est� dentro do range.
		// sm.put("h", 34);
		sm.put("f", 34);

		System.out.println(map);
		System.out.println(sm);
	}

	/**
	 * Cole��es Map utilizam algoritmos de hashing para determinar onde
	 * armazenar e como localizar elementos. Por isso, � importante que a classe
	 * utilizada como chave sobrescreva os m�todos equals e hashCode.
	 */
	public void testeMap() {
		Dog d1 = new Dog("Dog1");
		Map<Dog, String> mapa = new HashMap<>();
		mapa.put(d1, "1");
		mapa.put(new Dog("Dog2"), "2");
		mapa.put(new Dog("Dog3"), "3");
		mapa.put(new Dog("Dog4"), "4");

		System.out.println(mapa.size());
		System.out.println(mapa);

		System.out.println("\nPesquisa.....");
		/*
		 * Se os m�todos equals() e hashCode() n�o estiverem sobrescritos, isto
		 * retornar� null.
		 */
		System.out.println(mapa.get(new Dog("Dog2")));

		/*
		 * Isto resultar� em null, pois apesar do objeto Dog("Dog1") passado ao
		 * m�todo get() possuir o hashCode correto, o map utilizar� o m�todo
		 * equals() para procurar o elemento, e uma vez que o equals() de Dog
		 * utiliza o nome para determinar se dois objetos s�o equivalentes, o
		 * map n�o conseguir� encontrar o elemento especificado.
		 */
		d1.setNome("Dog11");
		System.out.println(mapa.get(new Dog("Dog1")));
	}

	/**
	 * Sets s�o utilizados quando n�o se deseja duplicatas.
	 */
	public void testSet() {
		boolean[] b = new boolean[5];

		/*
		 * � preciso tomar cuidado com TreeSet. Se esta linha for modificadda:
		 * Set<Object> set = new TreeSet<>(); Uma exce��o ser� gerada em tempo
		 * de execu��o, pois caso n�o seja especificado manualmente, objetos de
		 * tipos diferentes n�o s�o compar�veis. Logo, uma exce��o ser� gerada
		 * ao tentar se comparar uma String com um Integer.
		 */
		Set<Object> set = new HashSet<>();
		b[0] = set.add("a");
		b[1] = set.add("b");
		b[2] = set.add("a");
		b[3] = set.add(new Integer(50));
		b[4] = set.add(new Object());

		for (boolean valor : b) {
			System.out.println(valor);
		}

		System.out.println(set);
	}

	public void testeList() {
		List<Dog> lista = new ArrayList<>();
		Dog d = new Dog("Dog 1");
		lista.add(d);
		lista.add(new Dog("Dog 2"));
		lista.add(new Dog("Dog 3"));
		lista.add(new Dog("Dog 4"));
		this.print(lista);

		lista.remove(d);
		this.print(lista);

	}

	private void print(List<?> lista) {
		Iterator<?> iterator = lista.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("\n");
	}

}
