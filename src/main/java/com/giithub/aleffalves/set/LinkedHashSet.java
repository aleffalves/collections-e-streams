package com.giithub.aleffalves.set;

import java.util.Iterator;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<Integer> sequenciaNumerica = new java.util.LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica); //linkedhashset segue a ordem declarada

        System.out.println("------");

        sequenciaNumerica.remove(2);
        System.out.println(sequenciaNumerica);

        System.out.println("-------");

        int quantidadeNumerica = sequenciaNumerica.size();
        System.out.println(quantidadeNumerica);

        System.out.println("--------");

        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------");

        for (Integer numero : sequenciaNumerica){
            System.out.println(numero);
        }

        System.out.println("---------");
        System.out.println(sequenciaNumerica.isEmpty());

        sequenciaNumerica.clear();
    }
}
