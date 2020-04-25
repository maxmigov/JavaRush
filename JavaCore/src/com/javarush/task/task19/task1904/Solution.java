package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {


    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException{
            Person person = null;
            if (fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                String[] splitLine = line.split("\\s", 4);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                String birthday = splitLine[3];
                String surname = splitLine[0];
                String name = splitLine[1];
                String patronymic = splitLine[2];
                Date formattedDate = null;
                try {
                    formattedDate = dateFormat.parse(birthday);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                person = new Person(name, patronymic, surname, formattedDate);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
