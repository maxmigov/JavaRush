package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int numberInt = Integer.parseInt(number);
        int numberLength = number.length();
        
        for (int i = 0; i < numberLength; i++){
            if (number.charAt(i) % 2 == 0){
                even++;
            }else if (number.charAt(i) % 2 != 0){
                odd++;
            }
        }
        
        System.out.println("Even: " + even + " Odd: " + odd);
        
    }
}
