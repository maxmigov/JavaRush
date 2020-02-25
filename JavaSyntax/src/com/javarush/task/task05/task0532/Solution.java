package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int initialSize = Integer.parseInt(reader.readLine());
        
        if (initialSize <= 0){
        
        } else if (initialSize >= 0) {
            List<Integer> numberList = new ArrayList<>();
            for (int i = 0; i < initialSize; i++){
                numberList.add(Integer.parseInt(reader.readLine()));
            }
        int maximum = Collections.max(numberList);    
        System.out.println(maximum);
        }
    }
}
