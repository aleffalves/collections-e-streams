package com.giithub.aleffalves.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Aleff");
        nomes.add("Maria");
        nomes.add("Luana");
        nomes.add("Yuri");
        nomes.add("Marcus");

        System.out.println(nomes);

        nomes.addAll(nomes);
        System.out.println("--" + nomes);

        Collections.sort(nomes);// .sort lista em ordem alfabetica
        System.out.println(nomes);

        nomes.set(0,"Rebeca");
        System.out.println(nomes);

        nomes.remove(0);// remove index, remove o objeto da posição do array
        System.out.println(nomes);

        nomes.remove("Maria");//remove o objeto do array
        System.out.println(nomes);

        String nome = nomes.get(1);// retorna o nome da posição do array
        System.out.println(nome);

        int tamanho = nomes.size();//retorna o tamanho da lista
        System.out.println(tamanho);

        boolean luanaTemNaLista = nomes.contains("Luana");
        System.out.println(luanaTemNaLista);
        boolean aleffTemNaLista = nomes.contains("Aleff");
        System.out.println(aleffTemNaLista);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        int posicao = nomes.indexOf("Luana");//verifica a posicao do array
        System.out.println(posicao);

        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("---" + iterator.next());
        }

        for (String nomeDoItem : nomes){
            System.out.println(nomeDoItem);
        }
    }
}