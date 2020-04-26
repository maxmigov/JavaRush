package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());
        bufferedReader.close();
        StringBuilder stringBuilder = new StringBuilder();
        while (reader.ready()){
            char ch = (char) reader.read();
            stringBuilder.append(ch);
        }
        int count = 0;
        Pattern pattern = Pattern.compile("\\bworld\\b");
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()) {
            count++;
        }
        reader.close();
        System.out.println(count);
    }
}
