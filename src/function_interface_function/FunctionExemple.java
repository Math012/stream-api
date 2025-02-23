package function_interface_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *  Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 *
 *  É utilizada para transformar ou, mapear os elementos do Stream em outros valores ou tipo
 */

public class FunctionExemple {
    public static void main(String[] args) {
        // Cria uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numeroDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        numeroDobrados.forEach(System.out::println);

        System.out.println("Utilizando lambda");

        List<Integer> numeroDobrados2 = numeros.stream()
                .map(n -> n*2)
                .toList();
        numeroDobrados2.forEach(System.out::println);

    }
}
