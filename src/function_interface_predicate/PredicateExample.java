package function_interface_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
 * <p>
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição
 */

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascripty", "c", "go", "ruby");
        List<String> palavras2 = Arrays.asList("java", "kotlin", "python", "javascripty", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida imprimir
        // cada palavra que passou no filtro
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        System.out.println("Utilizando o lambda");
        palavras2.stream()
                .filter(n -> n.length() > 5)
                .forEach(System.out::println);
    }
}
