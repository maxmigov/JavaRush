package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(dogOne);
        System.out.println(dogTwo);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
    
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}
