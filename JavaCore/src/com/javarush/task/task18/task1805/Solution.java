package com.javarush.task.task18.task1805;
import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Сортировка байт
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

        Integer[] strArray = list.toArray(new Integer[list.size()]);

        Map<Integer, Long> freq = Stream.of(strArray)
                                            .collect(Collectors.groupingBy(
                                             Function.identity(), Collectors.counting()));

        SortedSet<Integer> set = new TreeSet<>(freq.keySet());
        
        for (Integer s : set) {
            System.out.print(s + " ");
        }
    }
}
