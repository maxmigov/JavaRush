package com.javarush.task.task18.task1801;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Максимальный байт
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
        Collections.reverse(list);
        System.out.println(list.get(0));
    }
}
