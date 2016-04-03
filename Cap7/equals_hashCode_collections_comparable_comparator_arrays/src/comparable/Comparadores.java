package comparable;

public class Comparadores {
	public static void main(String... args) {
		Comparadores c = new Comparadores();
		c.comparable();
	}

	public void comparable() {
		Dog d1 = new Dog("Dog 1");
		Dog d2 = new Dog("Dog 1");
		System.out.println(d1.compareTo(d2));
	}

}
