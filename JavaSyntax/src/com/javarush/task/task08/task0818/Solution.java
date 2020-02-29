package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Rana", 1500);
        map.put("Bugo", 4500);
        map.put("Morandi", 350);
        map.put("Manfredi", 490);
        map.put("Scotti", 800);
        map.put("Pucci", 250);
        map.put("Galimberti", 1000);
        map.put("Puccini", 2200);
        map.put("Murru", 1300);
        map.put("Buffon", 1000000);
        
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            int value = pair.getValue();
            if (value < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
