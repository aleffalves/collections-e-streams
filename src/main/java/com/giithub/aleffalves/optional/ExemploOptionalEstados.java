package com.giithub.aleffalves.optional;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        System.out.println("------");

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional null");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        System.out.println("---------");

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = está presente"));

        System.out.println("-------");


    }
}
