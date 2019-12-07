package Grudzien7.Kolekcje4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapaTest {
    public static void main(String[] args) {
        Map<String, Integer> mapaStringow = new HashMap<>();


        mapaStringow.put("Karol",15);
        mapaStringow.put("Marysia",115);
        mapaStringow.put("Wiola",85);
        mapaStringow.put("Karolina",15);
        mapaStringow.put("Pioter",34);

        System.out.println(mapaStringow);

        mapaStringow.put("Wiola",33);
        System.out.println(mapaStringow);

        for (String key : mapaStringow.keySet()) {
            System.out.println(mapaStringow.get(key));
        }

        System.out.println("linkeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeed");
        Map<String, Integer> linkedMapaStringow = new LinkedHashMap<>();


        linkedMapaStringow.put("Karol",15);
        linkedMapaStringow.put("Marysia",115);
        linkedMapaStringow.put("Wiola",85);
        linkedMapaStringow.put("Karolina",15);
        linkedMapaStringow.put("Pioter",34);

        System.out.println(linkedMapaStringow);

        mapaStringow.put("Wiola",33);
        System.out.println(linkedMapaStringow);

        for (String key : linkedMapaStringow.keySet()) {
            System.out.println(linkedMapaStringow.get(key));
        }

        System.out.println("treeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        Map<String, Integer> treeMapaStringow = new TreeMap<>();


        treeMapaStringow.put("Karol",15);
        treeMapaStringow.put("Marysia",115);
        treeMapaStringow.put("Wiola",85);
        treeMapaStringow.put("Karolina",15);
        treeMapaStringow.put("Pioter",34);

        System.out.println(treeMapaStringow);

        mapaStringow.put("Wiola",33);
        System.out.println(treeMapaStringow);

        for (String key : treeMapaStringow.keySet()) {
            System.out.println(treeMapaStringow.get(key));
        }



    }}