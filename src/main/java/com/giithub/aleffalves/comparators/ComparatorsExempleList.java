package com.giithub.aleffalves.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExempleList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));
        estudantes.add(new Estudante("Aleff",24));

        System.out.println("--- ordem de inserção ---");
        System.out.println(estudantes);

        System.out.println("----------");

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());//usando lambda compara as idades
        System.out.println(estudantes);

        System.out.println("----------");

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);

        System.out.println("---------");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        System.out.println("--------");
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        System.out.println("--------");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("-----------");
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator() );
        System.out.println(estudantes);

        System.out.println("--------");

    }
}
