package com.javarush.task.task18.task1809;
import java.io.*;
import java.util.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        Stack<Byte> stack = new Stack<>();

        while (inputStream.available() > 0) {
            stack.push((byte) inputStream.read());
        }
        while (!stack.isEmpty()){
            outputStream.write(stack.pop());
        }
        inputStream.close();
        outputStream.close();
    }
}
