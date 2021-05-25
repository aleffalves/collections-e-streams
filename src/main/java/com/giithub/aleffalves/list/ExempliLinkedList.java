package com.giithub.aleffalves.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExempliLinkedList {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Patrícia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        String clienteASerAtendido = filaDeBanco.poll();// pool retorna o primerio elemento e tira da fila
        System.out.println(clienteASerAtendido);
        System.out.println(filaDeBanco);

        System.out.println("-----");

        String primeiroCliente = filaDeBanco.peek();// peek retorna o primeiro elemento mais nao tira da fila
        System.out.println(primeiroCliente);
        System.out.println(filaDeBanco);

        System.out.println("------");

        String primeiroClienteOuErro = filaDeBanco.element();// element retornna o primeiro elemento, se nao houver retorna uma excessao
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaDeBanco);

        System.out.println("-----" );

        for (String cliente : filaDeBanco){
            System.out.println(cliente);
        }

        System.out.println("------");

        Iterator<String> iterator = filaDeBanco.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
