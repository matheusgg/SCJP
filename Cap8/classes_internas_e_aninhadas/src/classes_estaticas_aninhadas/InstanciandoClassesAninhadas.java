package classes_estaticas_aninhadas;

// Importação da classe aninhada.
import classes_estaticas_aninhadas.ClassesAninhadas.InnerStaticClass;

public class InstanciandoClassesAninhadas implements ClassesAninhadas.InnerInterface {
	public static void main(String[] args) {
		ClassesAninhadas.InnerStaticClass i = new ClassesAninhadas.InnerStaticClass();
		i.go();

		/*
		 * Caso esta sntaxe seja usada, é necessário importar a classe Aninhada.
		 */
		InnerStaticClass inner = new InnerStaticClass();
		inner.go();

	}

}
