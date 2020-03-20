package com.javarush.task.task07.task0713;

import java.util.ArrayList;
import java.io.*;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        ArrayList<Integer> thirdList = new ArrayList<>();
        ArrayList<Integer> fourthList = new ArrayList<>();
        
        for (int i = 0; i < 20; i++){
            firstList.add(Integer.parseInt(reader.readLine()));
        }
        
        for (int i = 0; i < 20; i++) {
            Integer number = firstList.get(i);
            if (number % 3 == 0 && number % 2 == 0){
                secondList.add(number);
                thirdList.add(number);
            } else if (number % 3 == 0) {
                secondList.add(number);
            } else if (number % 2 == 0) {
                thirdList.add(number);
            } else {
                fourthList.add(number);
            }
        }
            printList(secondList);
            printList(thirdList);
            printList(fourthList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
