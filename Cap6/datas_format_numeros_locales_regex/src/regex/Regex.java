package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex (ou express�es regulares) � uma linguagem que utiliza express�es para
 * identificar determinados padr�es dentro de textos.
 * 
 * Quando um caractere � consumido pelo motor Regex para formar um padr�o, ele
 * n�o � utilizado novamente para formar outro padr�o.
 * 
 * @author Matheus
 * 
 */
public class Regex {

	public static void main(String... args) {
		Regex r = new Regex();
		r.testeRegex1();
		r.testeRegex2();
		r.testeRegex3();
		r.quantificadoresGananciosos();
		r.quantificadoresRelutantes();
		r.operadores();
	}

	// ^ - Nega��o
	// [] - Define um determinado range ou padr�o
	public void operadores() {
		// Pattern p = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE);
		// Matcher m = p.matcher("hjagdabcjahdasABCajhdsabc");
		// while (m.find()) {
		// System.out.print(m.group());
		// }

		// Pattern p = Pattern.compile("[abc]");
		// Matcher m = p.matcher("hjagdabcjahdasABCajhdsabc");
		// while (m.find()) {
		// System.out.print(m.group());
		// }

		// Pattern p = Pattern.compile("[a-cA-C]");
		// Matcher m = p.matcher("hjagdabcjahdasABCajhdsabc");
		// while (m.find()) {
		// System.out.print(m.group());
		// }

		// Pattern p = Pattern.compile("teste1[^,]*");
		// Matcher m =
		// p.matcher("teste1,kjagah,ss,teste1,sjdhfsd,teste1,sajdbdsa,asdasd,teste1,");
		// while (m.find()) {
		// System.out.println(m.group());
		// }

		// Pattern p = Pattern.compile("0[xX][a-fA-F0-9]+");
		// Matcher m = p.matcher("0xxgdhs jd77sh 0XCafe 00xx6hy 0x67c");
		// while (m.find()) {
		// System.out.println(m.group());
		// }

		Pattern p = Pattern.compile(".+@.+\\.com");
		Matcher m = p.matcher("matheus.ggoes@outlook.com");
		System.out.println(m.find() ? "Email V�lido" : "Email Inv�lido!!!");
	}

	/**
	 * Os quantificadores relutantes, ao contr�rio dos quantificadores
	 * gaanciosos, fazem a busca de forma tradicional, ou seja, da esquerda para
	 * a direira, e n�o avaliam o texto inteiro, eles avaliam peda�os do texto.
	 */
	public void quantificadoresRelutantes() {
		// Pattern p = Pattern.compile(".+?xx");
		// Matcher m = p.matcher("xxyyxxxyxx");
		// while (m.find()) {
		// System.out.println(m.group());
		// }

		// Pattern p = Pattern.compile(".*?xx");
		// Matcher m = p.matcher("xxyyxxxyxx");
		// while (m.find()) {
		// System.out.println(m.group());
		// }

		Pattern p = Pattern.compile(".??xx");
		Matcher m = p.matcher("xxyyxxxyxx");
		while (m.find()) {
			System.out.println(m.group());
		}
	}

	/**
	 * Os quantificadores gananciosos consideram o texto inteiro para fazer a
	 * avalia��o. Depois disso, eles come�am a pesquisa da direita para a
	 * esquerda.
	 */
	// +, *, ?
	public void quantificadoresGananciosos() {
		Pattern p = Pattern.compile(".+xx");
		Matcher m = p.matcher("xxyyxxxyxx");
		while (m.find()) {
			System.out.println(m.group());
		}
	}

	/**
	 * Quantificadores: S�o operadores aplicados a express�o que os precedem e
	 * que amplificam o padr�o encontrado pela �ltima express�o antes deles para
	 * capturar mais caracteres.
	 */
	// + : Captura 1 ou mais letras ap�s a ocorr�ncia
	// * : Captura 0 ou mais letras ap�s a ocorr�ncia
	// ? : Captura 0 ou 1 letra ap�s a ocorr�ncia
	public void testeRegex3() {
		// Pattern p = Pattern.compile("\\d+");
		// Matcher m = p.matcher("ksdhfsd39bhbh234224234");
		// while (m.find()) {
		// System.out.println(m.group());
		// }

		// Pattern p = Pattern.compile("\\d*");
		// Matcher m = p.matcher("ksdhfsd324bhbh234224234");
		// while (m.find()) {
		// System.out.println(m.start() + " - " + m.group());
		// }

		Pattern p = Pattern.compile("\\d?");
		Matcher m = p.matcher("ksdhfsd324bhbh234224234");
		while (m.find()) {
			System.out.println(m.start() + " - " + m.group());
		}
	}

	/**
	 * Metacaracteres: S�o caracteres coringas utilizados para localiza��o de um
	 * determinado padr�o.
	 */
	// Metacaracteres:
	// \d - qualquer n�mero
	// \s - espa�o em branco
	// \w - qualquer letra, n�mero ou underline (_)
	// . - qualquer caractere
	public void testeRegex2() {
		// Pattern p = Pattern.compile("\\d");
		// Matcher m = p.matcher("knsdjfn63nk21123313jn2");
		// while (m.find()) {
		// System.out.print(m.group());
		// }

		// Pattern p = Pattern.compile("\\s");
		// Matcher m = p.matcher("knsdj fn63nk21 12331 3jn2");
		// while (m.find()) {
		// System.out.println(m.start());
		// }

		// Pattern p = Pattern.compile("\\w");
		// Matcher m = p.matcher("knsdj fn63nk21 12331 3jn2");
		// while (m.find()) {
		// System.out.println(m.start() + " - " + m.group());
		// }

		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher("knsdj fn63nk21 12331 3jn2");
		while (m.find()) {
			System.out.print(m.group());
		}
	}

	public void testeRegex1() {
		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher("hsydhdg232abcjajhdjasabcjashd6acbkas7abasjdabc");
		while (m.find()) {
			System.out.println(m.start() + " - " + m.group());
		}

		/*
		 * Isso n�o afetar� o c�digo. Este m�todo for�a a troca do Pattern,
		 * por�m mant�m a �ltima posi��o do cursor do Matcher, desta forma, como
		 * ele j� chegou ao final, nada mais ser� impresso.
		 */
		m.usePattern(Pattern.compile("a"));
		while (m.find()) {
			System.out.println(m.start() + " - " + m.group());
		}
	}

}
