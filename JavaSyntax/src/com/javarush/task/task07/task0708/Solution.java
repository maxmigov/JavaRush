package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int maximumNumber = 0;
        String maximum = null;
        
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine());
        }
        for (int i = 0; i < strings.size(); i++){
            
            if (strings.get(i).length() > maximumNumber){
            maximumNumber += strings.get(i).length();
            maximum = strings.get(i);
            }
        }
        
        for (int j = 0; j < strings.size(); j++){
            if (maximum.length() == (strings.get(j).length()))
                System.out.println(strings.get(j));
        }
        
    }    
}
