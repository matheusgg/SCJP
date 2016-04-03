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
 * Quando se trabalha com coleções vinculadas, os métodos subSet(), headSet(),
 * tailSet(), subMap(), headMap() e tailMap() retornam coleções de contém um
 * determinado range, e caso alguma alteração ocorra dentro da coleção original
 * e esta alteração estiver dentro do range das subcoleções, ambas serão
 * alteradas, e vice-versa. Não é possível fazer uma alteração fora do range na
 * subcoleção.
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
		// // O método add() chama offer() internamente
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
			// O método add() chama offer() internamente
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
		 * Adicionando valores nos dois set, pois estes valores estão dentro do
		 * range do subset.
		 */
		ts.add(4);
		ts.add(8);
		System.out.println(ts);
		System.out.println(ss);

		/*
		 * Exceção em tempo de excecução. 40 está fora do range do subset.
		 */
		// ss.add(40);

		ss.add(9);
		ss.remove(4); // Remoção dos dois sets
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
		 * Cria um submap a partir da chave informada até a segunda chave
		 * informada.
		 */
		SortedMap<String, Integer> sm = map.subMap("b", "g");
		System.out.println(map);
		System.out.println(sm);

		/*
		 * Adiciona mais itens ao map original. Com isso, o submap ganhará mais
		 * um item. O item de chave 'b' será adicionado ao submap, pois está
		 * dentro do range especificado.
		 */
		map.put("b", 736);
		map.put("i", 736);

		/*
		 * Será adicionado mais um item nos dois maps. Quando um item é
		 * adicionado ao submap, sua chave deve estar dentro do range
		 * especificado na criação do mesmo.
		 */
		// Exceção de tempo de excecução. 'h' não está dentro do range.
		// sm.put("h", 34);
		sm.put("f", 34);

		System.out.println(map);
		System.out.println(sm);
	}

	/**
	 * Coleções Map utilizam algoritmos de hashing para determinar onde
	 * armazenar e como localizar elementos. Por isso, é importante que a classe
	 * utilizada como chave sobrescreva os métodos equals e hashCode.
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
		 * Se os métodos equals() e hashCode() não estiverem sobrescritos, isto
		 * retornará null.
		 */
		System.out.println(mapa.get(new Dog("Dog2")));

		/*
		 * Isto resultará em null, pois apesar do objeto Dog("Dog1") passado ao
		 * método get() possuir o hashCode correto, o map utilizará o método
		 * equals() para procurar o elemento, e uma vez que o equals() de Dog
		 * utiliza o nome para determinar se dois objetos são equivalentes, o
		 * map não conseguirá encontrar o elemento especificado.
		 */
		d1.setNome("Dog11");
		System.out.println(mapa.get(new Dog("Dog1")));
	}

	/**
	 * Sets são utilizados quando não se deseja duplicatas.
	 */
	public void testSet() {
		boolean[] b = new boolean[5];

		/*
		 * É preciso tomar cuidado com TreeSet. Se esta linha for modificadda:
		 * Set<Object> set = new TreeSet<>(); Uma exceção será gerada em tempo
		 * de execução, pois caso não seja especificado manualmente, objetos de
		 * tipos diferentes não são comparáveis. Logo, uma exceção será gerada
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
