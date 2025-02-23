package function_interface_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *  Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 *
 *  É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem
 *  modificar, ou retornar um valor.
 */


public class ConsumerExemplo {
    public static void main(String[] args) {
        // cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        System.out.println("Criando o consumer separadamente");
        Consumer<Integer> imprimirNumeroPar = numero ->{
            if (numero % 2 ==0){
                System.out.println("Par: " + numero);
            }
        };
        numeros.stream().forEach(imprimirNumeroPar);
        System.out.println();
        System.out.println("Criando o consumer dentro do método forEach");
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer numero) {
                if (numero % 2 ==0){
                    System.out.print( numero + "  " );
                }
            }
        });
        System.out.println();
        System.out.println("Outra maneira");
        numeros.forEach(n ->{
            if (n % 2 == 0){
                System.out.print( n + "  " );
            }
        });
    }
}
