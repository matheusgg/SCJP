package com.importacoes_estaticas;

/**
 * As importações estáticas serverm para utilizar membros estáticos de classes
 * e economizar digitação.
 */
import static java.util.Calendar.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.out;

@SuppressWarnings("unused")
public class ImportacoesEstaticas {
	public static void main(String[] args) {
		/*
		 * Método estático da classe Integer. Isso causará um erro de
		 * compilação, pois tanto a classe Long quanto a classe Integer possuem
		 * um método estático valueOf().
		 */
		// out.println(valueOf("10"));

		/*
		 * Método estático da classe Calendar.
		 */
		out.println(getInstance().getTime());
	}
}
