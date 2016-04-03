package navegacao;

import java.util.TreeMap;
import java.util.TreeSet;

public class Navegacao {

	public static void main(String[] args) {
		Navegacao n = new Navegacao();
		// n.metodosDeNavegacao();
		// n.metodosNavigableSet();
		// n.metodosNavigableMap();
		// n.pooling();
		n.ordemDecrescente();
	}

	public void ordemDecrescente() {
		TreeSet<Integer> times = new TreeSet<>();
		times.add(1357);
		times.add(1540);
		times.add(1727);
		times.add(1930);
		times.add(2000);
		System.out.println(times.descendingSet() + "\n");

		TreeMap<Integer, Integer> timesMap = new TreeMap<>();
		timesMap.put(1, 1357);
		timesMap.put(2, 1540);
		timesMap.put(3, 1727);
		timesMap.put(4, 1930);
		timesMap.put(5, 2000);
		System.out.println(timesMap.descendingMap());
	}

	/**
	 * Pooling serve para recuperar e remover da coleção o primeiro ou o último
	 * elemento.
	 */
	public void pooling() {
		TreeSet<Integer> times = new TreeSet<>();
		times.add(1357);
		times.add(1540);
		times.add(1727);
		times.add(1930);
		times.add(2000);
		System.out.println(times + "\n");
		System.out.println(times.pollFirst());
		System.out.println(times.pollLast());
		System.out.println(times + "\n===========================================");

		TreeMap<Integer, Integer> timesMap = new TreeMap<>();
		timesMap.put(1, 1357);
		timesMap.put(2, 1540);
		timesMap.put(3, 1727);
		timesMap.put(4, 1930);
		timesMap.put(5, 2000);
		System.out.println(timesMap + "\n");
		System.out.println(timesMap.pollFirstEntry());
		System.out.println(timesMap.pollLastEntry());
		System.out.println(timesMap + "\n");
	}

	public void metodosNavigableMap() {
		TreeMap<Integer, Integer> times = new TreeMap<>();
		times.put(1, 1357);
		times.put(2, 1540);
		times.put(3, 1727);
		times.put(4, 1930);
		times.put(5, 2000);
		System.out.println(times + "\n");

		/*
		 * O método lowerKey() retorna a maior chave que seja menor do que a
		 * especificada. O método floorKey() retorna a maior chave que seja
		 * menor ou igual do que a especificada.
		 */
		System.out.println(times.lowerKey(3)); // <
		System.out.println(times.floorKey(3)); // <=

		/*
		 * O método higherKey() retorna a menor chave que seja maior do que a
		 * especificada. Jáo método ceilingKey() retorna a menor chave que seja
		 * maior ou igual do que a especificada.
		 */
		System.out.println("\n" + times.higherKey(3)); // >
		System.out.println(times.ceilingKey(3)); // >=
	}

	public void metodosNavigableSet() {
		TreeSet<Integer> times = new TreeSet<>();
		times.add(1357);
		times.add(1540);
		times.add(1727);
		times.add(1930);
		times.add(2000);
		System.out.println(times + "\n");

		/*
		 * O método lower() retorna o maior elemento menor do que o
		 * especificado. O método floor() retorna o maior elemento menor ou
		 * igual do que o especificado.
		 */
		System.out.println(times.lower(1727)); // <
		System.out.println(times.floor(1727)); // <=

		/*
		 * O método higher() retorna o menor elemento maior do que o
		 * especificado. Jáo método ceiling() retorna o menor elemento maior ou
		 * igual do que o especificado.
		 */
		System.out.println("\n" + times.higher(1727)); // >
		System.out.println(times.ceiling(1727)); // >=
	}

	public void metodosDeNavegacao() {
		TreeSet<Integer> times = new TreeSet<>();
		times.add(2000);
		times.add(1540);
		times.add(1357);
		times.add(1930);
		times.add(1727);
		System.out.println(times + "\n");

		/*
		 * Recupera os elementos até o valor especificado. (true - inclusive o
		 * valor; false(padrão) - exclusive o valor)
		 */
		TreeSet<Integer> s = (TreeSet<Integer>) times.headSet(1727, true);
		System.out.println(s + "\n");

		/*
		 * Recupera os elementos a partir de uma valor. (true (padrão) -
		 * incluíndo o valor especificado; false - excluíndo o valor
		 * especificado)
		 */
		// O valor informado só será incluído se estiver no Set
		TreeSet<Integer> ss = (TreeSet<Integer>) times.tailSet(1726, true);
		System.out.println(ss + "\n");

		/*
		 * Recupera os elementos a partir de um valor (inclíndo o valor
		 * especificado) até outro valor (exclíndo o valor especificado).
		 */
		TreeSet<Integer> sss = (TreeSet<Integer>) times.subSet(1540, 1930);
		System.out.println(sss + "\n");
	}

}
