package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparadores {

	public static void main(String... args) {
		Comparadores c = new Comparadores();
		c.compare();
	}

	public void compare() {
		List<Car> carros = new ArrayList<>();
		for (int i = 10; i >= 0; i--) {
			carros.add(new Car("Carro " + i));
		}
		System.out.println(carros);
		Collections.sort(carros, new CompareFactory());
		System.out.println(carros);
	}

}
