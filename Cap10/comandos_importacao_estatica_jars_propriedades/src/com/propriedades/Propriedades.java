package com.propriedades;

import java.util.Properties;

/**
 * A classe Properties é utilizada para adquirir informações do sistema ou
 * propriedades informadas na linha de comando.
 * 
 * @author Matheus
 * 
 */
/*
 * Para passar uma propriedade no comando java, basca usar o opção -D
 */
// java -DkeyPropriedade=valorPropriedade Classe
public class Propriedades {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		/*
		 * Adiciona uma nova propriedade.
		 */
		p.setProperty("pro", "Teste");
		p.list(System.out);
	}

}
