public class Tipos {
	public static void main(String[] args) {
		// Existem 8 tipos primitivos em java
		byte b = 1; // -2^7 ~ 2^7-1
		short s = 2; // -2^15 ~ 2^15-1
		int i = 3; // -2^31 ~ 2^31-1
		long l = 4; // -2^63 ~ 2^63-1
		float f = 5.1f;
		double d = 6.1;
		char c = 7;
		boolean booleano = true;

		System.out.println(b); // 8 bits
		System.out.println(s); // 16 bits
		System.out.println(i); // 32 bits
		System.out.println(l); // 64 bits
		System.out.println(f); // 32 bits
		System.out.println(d); // 64 bits
		System.out.println(c); // 16 bits
		System.out.println(booleano); // Depende da JVM

	}

}
