package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man paul = new Man("Paul", 30, "NY street");
        Man luke = new Man("Luke", 35, "5th avenue");
        Woman marta = new Woman("Marta", 25, "Amsterdam street");
        Woman linda = new Woman("Linda", 30, "Cork street");
        System.out.println(paul.name + " " + paul.age + " " + paul.address);
        System.out.println(luke.name + " " + luke.age + " " + luke.address);
        System.out.println(marta.name + " " + marta.age + " " + marta.address);
        System.out.println(linda.name + " " + linda.age + " " + linda.address);
    }

    public static class Man {
        String name;
        int age;
        String address;
        
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    
    public static class Woman {
        String name;
        int age;
        String address;
        
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
