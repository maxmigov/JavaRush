package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        int a = 0;
        int b = 0;
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < list.length; i+=2){
            a += list[i];
        }
        for (int i = 1; i < list.length; i+=2){
            b += list[i];
        }
        if (a > b){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
