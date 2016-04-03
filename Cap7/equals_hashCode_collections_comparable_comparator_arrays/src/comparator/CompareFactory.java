package comparator;

import java.util.Comparator;

public class CompareFactory implements Comparator<Car> {

	public int compare(Car c1, Car c2) {
		return c1.compareTo(c2);
	}

}
