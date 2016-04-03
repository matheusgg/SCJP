package com.comandos;

/**
 * O comando -d (destino) permite especificar onde colocar os arquivos .class
 * que ser�o gerados. Por padr�o, estes arquivos s�o armazenados na mesma pasta
 * dos arquivos .java. Com o comando -d, os arquivos .class s�o gerados na mesma
 * �rvore de diret�rios que est�o os arquivos java se estes possuirem um
 * package. O comando -classpath ou -cp faz a JVM ou o compilador procurar por
 * classes que estejam no diret�rio especificado pelo comando e que ignore o
 * diret�rio definido nas propriedades do sistema.
 */

/*
 * Caso o diret�rio classes n�o exista, um erro de compila��o ser� gerado.
 */
// javac -d ../classes project/com/comandos Comandos.java

/*
 * -classpath pode ser abreviado como -cp. Para separar os diret�rio � utilizado
 * o delimitador ':' no Linux e ';' no Windows. O ponto (.) informa ao comando
 * java procurar tamb�m por classes no diret�rio atual. A busca � feita da
 * esquerda para a direita.
 */
// javac -classpath /com:/com/foo App.java
// java -cp /com;/com/foo;. App
class Comandos {
	public static void main(String... args) {
		System.out.println("Teste");
	}

}