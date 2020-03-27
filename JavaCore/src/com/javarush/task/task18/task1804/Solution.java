package com.javarush.task.task18.task1804;
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        
        ArrayList<Integer> list = new ArrayList<>();
            while (inputStream.available() > 0) {
                list.add(inputStream.read());
            }
        inputStream.close();
        Collections.sort(list);
        
        Integer[] strArray = list.toArray(new Integer[list.size()]);
        
        Map<Integer, Long> freq = Stream.of(strArray)
                                            .collect(Collectors.groupingBy(
                                             Function.identity(), Collectors.counting()));
                                             
        Long min = Collections.min(freq.values());
        
            for (Map.Entry<Integer, Long> entry : freq.entrySet()) {
                if (entry.getValue().equals(min)) {
                        System.out.print(entry.getKey() + " ");
                }
            }
    }
}
