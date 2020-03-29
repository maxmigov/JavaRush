package com.javarush.task.task18.task1808;
import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[1000];
            int count = inputStream.read(buffer);
            if (count % 2 != 0) {
                outputStream1.write(buffer, 0, count / 2+1);
                outputStream2.write(buffer, count / 2+1, count / 2);
            } else {
                outputStream1.write(buffer, 0, count / 2);
                outputStream2.write(buffer, count / 2, count / 2);
            }
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
