package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*; 

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }

    public static int max(int[] array) {
        
        int list = array[0];
        for (int i = 0; i < array.length; i++) {
            if (list < array[i])
                list = array[i];
        }
        return list;
    }
}
