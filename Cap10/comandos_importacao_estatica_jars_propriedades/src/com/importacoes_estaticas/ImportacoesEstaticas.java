package com.importacoes_estaticas;

/**
 * As importa��es est�ticas serverm para utilizar membros est�ticos de classes
 * e economizar digita��o.
 */
import static java.util.Calendar.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.out;

@SuppressWarnings("unused")
public class ImportacoesEstaticas {
	public static void main(String[] args) {
		/*
		 * M�todo est�tico da classe Integer. Isso causar� um erro de
		 * compila��o, pois tanto a classe Long quanto a classe Integer possuem
		 * um m�todo est�tico valueOf().
		 */
		// out.println(valueOf("10"));

		/*
		 * M�todo est�tico da classe Calendar.
		 */
		out.println(getInstance().getTime());
	}
}
