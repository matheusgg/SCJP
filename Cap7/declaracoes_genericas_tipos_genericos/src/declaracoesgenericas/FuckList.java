package declaracoesgenericas;

import java.util.ArrayList;
import java.util.List;

/**
 * Convenção: E - Elemento (Usado para Listas); T - Tipo; N - Número; K - Chaves
 * 
 * @author Matheus
 * 
 * @param <E>
 */
public class FuckList<E extends Object> {// <? extends Object>{ Erro de
											// compilação
	private List<E> pool;

	public FuckList() {
		this.pool = new ArrayList<E>();
	}

	public boolean add(E e) {
		return this.pool.add(e);
	}

	public boolean remove(E e) {
		return this.pool.remove(e);
	}

	public E get(int index) {
		return this.pool.get(index);
	}

	public String toString() {
		return this.pool.toString();
	}
}