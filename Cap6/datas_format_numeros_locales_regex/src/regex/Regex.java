package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex (ou expressões regulares) é uma linguagem que utiliza expressões para
 * identificar determinados padrões dentro de textos.
 * 
 * Quando um caractere é consumido pelo motor Regex para formar um padrão, ele
 * não é utilizado novamente para formar outro padrão.
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

	// ^ - Negação
	// [] - Define um determinado range ou padrão
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
		System.out.println(m.find() ? "Email Válido" : "Email Inválido!!!");
	}

	/**
	 * Os quantificadores relutantes, ao contrário dos quantificadores
	 * gaanciosos, fazem a busca de forma tradicional, ou seja, da esquerda para
	 * a direira, e não avaliam o texto inteiro, eles avaliam pedaços do texto.
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
	 * avaliação. Depois disso, eles começam a pesquisa da direita para a
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
	 * Quantificadores: São operadores aplicados a expressão que os precedem e
	 * que amplificam o padrão encontrado pela última expressão antes deles para
	 * capturar mais caracteres.
	 */
	// + : Captura 1 ou mais letras após a ocorrência
	// * : Captura 0 ou mais letras após a ocorrência
	// ? : Captura 0 ou 1 letra após a ocorrência
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
	 * Metacaracteres: São caracteres coringas utilizados para localização de um
	 * determinado padrão.
	 */
	// Metacaracteres:
	// \d - qualquer número
	// \s - espaço em branco
	// \w - qualquer letra, número ou underline (_)
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
		 * Isso não afetará o código. Este método força a troca do Pattern,
		 * porém mantém a última posição do cursor do Matcher, desta forma, como
		 * ele já chegou ao final, nada mais será impresso.
		 */
		m.usePattern(Pattern.compile("a"));
		while (m.find()) {
			System.out.println(m.start() + " - " + m.group());
		}
	}

}
