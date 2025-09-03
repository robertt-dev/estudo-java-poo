package Lambdas.EstudoTeorico.InterfaceFuncional;

import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        // não retorna nada so imprime
        Consumer<Produto> imprimir = p -> System.out.println(p);

        Produto p1 = new Produto("Notebook", 2345.90, 0.15);
        imprimir.accept(p1);
    }
}
