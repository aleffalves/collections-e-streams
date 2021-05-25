package com.giithub.aleffalves.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMudialFifa = new HashMap<>();

        campeoesMudialFifa.put("Brasil", 5);
        campeoesMudialFifa.put("Alemanha", 4);
        campeoesMudialFifa.put("Itália", 4);
        campeoesMudialFifa.put("Uruguai", 2);
        campeoesMudialFifa.put("Argentina", 2);
        campeoesMudialFifa.put("França", 2);
        campeoesMudialFifa.put("Inglaterra", 1);
        campeoesMudialFifa.put("Espanha", 1);

        System.out.println(campeoesMudialFifa);

        System.out.println("------");

        campeoesMudialFifa.put("Brasil",6);//atualiza a chave
        System.out.println(campeoesMudialFifa);

        System.out.println("------");

        System.out.println(campeoesMudialFifa.get("Argentina"));//retorna o valor da chave

        System.out.println("-------");

        System.out.println(campeoesMudialFifa.containsKey("França"));//retorna um bolean se existe o objeto

        System.out.println("--------");

        campeoesMudialFifa.remove("França");
        System.out.println(campeoesMudialFifa.containsKey("França"));

        System.out.println("--------");

        System.out.println(campeoesMudialFifa.containsValue(6));// retorna um boolean se existe o valor

        System.out.println("-------");
        System.out.println(campeoesMudialFifa.size());

        System.out.println("-------");

        for (String key : campeoesMudialFifa.keySet()){
            System.out.println(key + " : " + campeoesMudialFifa.get(key));
        }

        System.out.println("------");

        for (Map.Entry<String, Integer> entry : campeoesMudialFifa.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }





    }
}
