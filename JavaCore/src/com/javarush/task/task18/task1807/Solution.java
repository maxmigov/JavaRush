package com.javarush.task.task18.task1807;
import java.io.*;
import java.util.*;

/* 
Подсчет запятых
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

        Set<Integer> set = new HashSet<>(list);
        for (Integer key : set) {
            if (key.equals(44)){
                System.out.println(Collections.frequency(list, key));
            }
        }
    }
}
