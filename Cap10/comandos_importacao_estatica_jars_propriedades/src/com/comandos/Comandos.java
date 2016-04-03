package com.comandos;

/**
 * O comando -d (destino) permite especificar onde colocar os arquivos .class
 * que serão gerados. Por padrão, estes arquivos são armazenados na mesma pasta
 * dos arquivos .java. Com o comando -d, os arquivos .class são gerados na mesma
 * árvore de diretórios que estão os arquivos java se estes possuirem um
 * package. O comando -classpath ou -cp faz a JVM ou o compilador procurar por
 * classes que estejam no diretório especificado pelo comando e que ignore o
 * diretório definido nas propriedades do sistema.
 */

/*
 * Caso o diretório classes não exista, um erro de compilação será gerado.
 */
// javac -d ../classes project/com/comandos Comandos.java

/*
 * -classpath pode ser abreviado como -cp. Para separar os diretório é utilizado
 * o delimitador ':' no Linux e ';' no Windows. O ponto (.) informa ao comando
 * java procurar também por classes no diretório atual. A busca é feita da
 * esquerda para a direita.
 */
// javac -classpath /com:/com/foo App.java
// java -cp /com;/com/foo;. App
class Comandos {
	public static void main(String... args) {
		System.out.println("Teste");
	}

}