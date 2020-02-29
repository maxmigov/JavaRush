package com.javarush.task.task08.task0821;

import java.util.*;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Giovanni", "Rana");
        map.put("Giovanni", "Bugo");
        map.put("Giovanni", "Morandi");
        map.put("Antonio", "Manfredi");
        map.put("Ugo", "Scotti");
        map.put("Jerry", "Scotti");
        map.put("Alessandro", "Galimberti");
        map.put("Giacomo", "Puccini");
        map.put("Adriano", "Murru");
        map.put("Adriano", "Rana");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
