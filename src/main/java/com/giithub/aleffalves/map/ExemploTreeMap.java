package com.giithub.aleffalves.map;

import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);
        System.out.println(treeCapitais.get("Belo Horizonte"));

        System.out.println("-----");

        System.out.println(treeCapitais.firstKey());

        System.out.println("------");
        System.out.println(treeCapitais.firstEntry());

        System.out.println("------");

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " : " + treeCapitais.get(key));

        }

        System.out.println("------");
        for (Map.Entry<String, String> capital : treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " : " + capital.getValue());
        }

        System.out.println("------");
        for (String capital : treeCapitais.keySet()){
            System.out.println(capital + " : "+ treeCapitais.get(capital));
        }

    }
}
