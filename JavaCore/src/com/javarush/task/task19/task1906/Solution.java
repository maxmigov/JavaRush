package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bufferedReader.readLine());
        FileWriter writer = new FileWriter(bufferedReader.readLine());
        bufferedReader.close();
        //"C:/Users/maxmi/Documents/text.txt"
        int i = 0;
        int symbol;
            while (reader.ready()) {
                symbol = reader.read();
                if ((i + 1) % 2 == 0) {
                    writer.write(symbol);
                }
                i++;
            }

         reader.close();
         writer.close();

    }
}
