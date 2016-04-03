package underscores_safevarargs_switchcomstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		int x = 674_23_47_6; // 67423476
		System.out.println(x);

		float f = 23_4.5_6f; // 234.56
		System.out.println(f);

		double d = 0x1.ffff_ffff_ffff_fP1_023; // 1.7976931348623157E308
		System.out.println(d);

		int b = 0b1_1; // 3
		System.out.println(b);
		b = 0B10; // 2
		System.out.println(b);

		// A JVM faz a comparacao via hashcode
		switch ("a") {
		case "a":
			System.out.println("Caso a");
			break;

		case "b":
			System.out.println("Caso b");
			break;

		case "c":
			System.out.println("Caso c");
			break;
		}

		// Operador diamante
		List<String> lista = new ArrayList<>();
		System.out.println(lista);

		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);

		List<Set<Integer>> listaSets = null;
		listaSets = App.asList(set); // Com @SafeVarargs
		listaSets = App.asList2(set); // Sem @SafeVarargs
		System.out.println(listaSets);
	}

	/*
	 * Esta annotation informa ao compilador que a operacao com varargs deste
	 * metodo e segura e que nao ocorre problemas com o tipo errado. Deste modo,
	 * nao serao gerados warnings no momento da compilacao.
	 */
	@SafeVarargs
	public static <T> List<T> asList(T... obj) {
		return Arrays.asList(obj);
	}

	public static <T> List<T> asList2(T... obj) {
		return Arrays.asList(obj);
	}
}
