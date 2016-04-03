package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecoes {

	public static void main(String... args) {
		Colecoes c = new Colecoes();
		c.arrayList();
	}

	public void arrayList() {
		List<String> l = new ArrayList<>();
		for (int i = 10; i >= 0; i--) {
			l.add("String " + i);
		}
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
