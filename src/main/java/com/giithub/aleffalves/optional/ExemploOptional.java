package com.giithub.aleffalves.optional;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> exemploString = Optional.of("Valor qualquer");

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        System.out.println(exemploString.isPresent());
        System.out.println(exemploString.isEmpty());

        System.out.println("-------");

           exemploString.ifPresent(System.out::println);

        System.out.println("---------");

            exemploString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor qualquer não está presente"));

        System.out.println("---------");

        if (exemploString.isPresent()){
            String exemplo = exemploString.get();
            System.out.println(exemplo);
        }

        System.out.println("---------");

        exemploString.map((valor) -> valor.concat(" ----")).ifPresent(System.out::println);

        System.out.println("----------");

        exemploString.orElseThrow(IllegalAccessError::new);


    }
}
