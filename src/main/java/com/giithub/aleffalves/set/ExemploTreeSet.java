package com.giithub.aleffalves.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Salvador");

        System.out.println(treeCapitais);//cria a arvore em ordem alfabetica

        System.out.println("-----");
        System.out.println(treeCapitais.first());// primeira da arvore

        System.out.println("------");
        System.out.println(treeCapitais.last());// ultima da arvore

        System.out.println("--------");
        System.out.println(treeCapitais.lower("Porto Alegre"));// retorna a primeira capital abaixo da arvore parametrizada

        System.out.println("------");
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println("--------");
        System.out.println(treeCapitais.pollFirst());//retorna o primeiro da arvore e remove

        System.out.println("------");
        System.out.println(treeCapitais);

        System.out.println("-------");

        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------");

        for (String capital : treeCapitais){
            System.out.println(capital);
        }

    }
}
