package com.giithub.aleffalves.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamApi {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();// criando a coleção

        estudantes.add("Aleff");
        estudantes.add("Pedro");
        estudantes.add("Luana");
        estudantes.add("Marcus");
        estudantes.add("Tereza Alves");
        estudantes.add("Yuri");

        System.out.println("Contagem: " + estudantes.stream().count()); //contando quantos objetos na coleção

        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com letra a no nome: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("a")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna os elementos novamente: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Todos os elementos tem a letra a? " + estudantes.stream().allMatch((elemento) -> elemento.contains("a")));

        System.out.println("Tem algum elemento com a letra a mínuscula no mome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        System.out.println("Não tem algum elemento com a letra a mínuscula no mome? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        System.out.println("Retorna o primeiro elemento da coleção: " + estudantes.stream().findFirst());

        



    }
}
