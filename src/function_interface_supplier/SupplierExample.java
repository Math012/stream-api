package function_interface_supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 *
 *  É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */


public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo";


        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream
                .generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        listaSaudacoes.stream().forEach(s -> System.out.println(s));

        // Method reference
        System.out.println("============Method reference=========");
        listaSaudacoes.stream().forEach(System.out::println);

        System.out.println("============Passando o Supplier via Lambda=========");
        List<String> lambdaSaudacao = Stream
                .generate(()->"Olá, seja bem vindo lambda")
                .limit(10)
                .toList();
        lambdaSaudacao.stream().forEach(System.out::println);
    }
}
