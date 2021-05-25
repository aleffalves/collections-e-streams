package com.giithub.aleffalves.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();


        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        notasAlunos.add(null);


        System.out.println(notasAlunos);//no hashhset e no set não retornam os dados na sequencia recebida

        System.out.println("-------");

        notasAlunos.remove(5.8);//remove notas do set
        System.out.println(notasAlunos);

        System.out.println("------");

        int quantidadeDeNotas = notasAlunos.size();
        System.out.println(quantidadeDeNotas);

        System.out.println("-------");

        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------");

        for (Double nota : notasAlunos) {
            System.out.println(nota);
        }

        System.out.println("-------");

        notasAlunos.clear();

        System.out.println("-------");

        boolean notasVazias = notasAlunos.isEmpty();
        System.out.println(notasVazias);

    }
}
