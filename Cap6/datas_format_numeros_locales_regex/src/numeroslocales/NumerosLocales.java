package numeroslocales;

import java.text.NumberFormat;
import java.util.Locale;

public class NumerosLocales {

	public static void main(String... args) {
		NumerosLocales nl = new NumerosLocales();
		nl.testeNumberFormat();
		nl.testeLocale();
	}

	public void testeLocale() {
		Locale br = new Locale("pt", "BR");
		Locale it = new Locale("it", "IT");
		Locale us = new Locale("en", "US");
		System.out.println(br);
		System.out.println(it);
		System.out.println(us);
		System.out.println(br.getDisplayCountry());

		/*
		 * Exibe o país de acordo com os padrões do Locale informado.
		 */
		System.out.println(br.getDisplayCountry(it)); // Brasile
		System.out.println(br.getDisplayCountry(us)); // Brazil
	}

	/**
	 * A classe NumberFormat não possui construtores públicos, é necessário
	 * utilizar alguns dos métodos estáticos para se obter uma instância desta
	 * classe.
	 */
	public void testeNumberFormat() {
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		NumberFormat nf3 = NumberFormat.getPercentInstance();
		NumberFormat nf4 = NumberFormat.getNumberInstance();

		System.out.println(nf1.format(1500.00));
		System.out.println(nf2.format(1500.0));
		System.out.println(nf3.format(1500.45));
		System.out.println(nf4.format(1500.30));

		/*
		 * Faz apenas a parte inteira ser retornada no método parse().
		 */
		nf1.setParseIntegerOnly(true);
		nf4.setParseIntegerOnly(true);
		try {
			System.out.println(nf1.parse("1500.99")); // 150099
			System.out.println(nf2.parse("R$ 300,70"));
			System.out.println(nf3.parse("43%"));
			System.out.println(nf4.parse("1500,99")); // 1500
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
