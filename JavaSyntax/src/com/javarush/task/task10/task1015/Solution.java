package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> array1 = new ArrayList<>(Arrays.asList("ciao", "ciao", "ciao"));
        ArrayList<String> array2 = new ArrayList<>(Arrays.asList("ciao", "ciao", "ciao"));
        ArrayList<String> array3 = new ArrayList<>(Arrays.asList("ciao", "ciao", "ciao"));
        ArrayList<String>[] arrayOfStringList = new ArrayList[0];
        arrayOfStringList = new ArrayList[]{array1, array2, array3};
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
