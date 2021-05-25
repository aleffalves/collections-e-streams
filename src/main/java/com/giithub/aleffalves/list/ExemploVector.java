package com.giithub.aleffalves.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        esportes.set(2,"Ping Pong");

        esportes.remove(2);

        esportes.remove("Handebol");

        for(String listaEsportes : esportes){
            System.out.println(listaEsportes);
        }
    }
}
