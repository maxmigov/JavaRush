package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
        
    }
    public static class Human {
        // Напишите тут ваши переменные и конструкторы

        private String name;
        private Integer age;
        private Integer year;
        private String sex;
        private String game;
        private Integer score;

        public Human(String name) {
            this.name = name;
            this.age = 10;
            this.year = 2010;
            this.sex = "male";
            this.game = "Liverpool - Man Utd";
            this.score = 100;
        }

        public Human(String name, Integer age) {
            this.name = name;
            this.age = age;
            this.year = 2011;
            this.sex = "male";
            this.game = "Liverpool - Man Utd";
            this.score = 98;
        }

        public Human(String name, Integer age, Integer year) {
            this.name = name;
            this.age = age;
            this.year = year;
            this.sex = "male";
            this.game = "Liverpool - Man Utd";
            this.score = 99;
        }

        public Human(String name, Integer age, Integer year, String sex) {
            this.name = name;
            this.age = age;
            this.year = year;
            this.sex = sex;
            this.game = "Liverpool - Man Utd";
            this.score = 150;
        }

        public Human(String name, Integer age, Integer year, String sex, String game) {
            this.name = name;
            this.age = age;
            this.year = year;
            this.sex = sex;
            this.game = game;
            this.score = 140;
        }

        public Human(String name, Integer age, Integer year, String sex, String game, Integer score) {
            this.name = name;
            this.age = age;
            this.year = year;
            this.sex = sex;
            this.game = game;
            this.score = score;
        }

        public Human() {
        }

        public Human(Human human) {
            this.name = human.name;
            this.age = human.age;
            this.year = human.year;
            this.sex = human.sex;
            this.game = human.game;
            this.score = human.score;
        }

        public Human(Human human, String name) {
            this.name = name;
            this.age = human.age;
            this.year = human.year;
            this.sex = human.sex;
            this.game = human.game;
            this.score = human.score;
        }

        public Human(Human human, String name, Integer age) {
            this.name = name;
            this.age = age;
            this.year = human.year;
            this.sex = human.sex;
            this.game = human.game;
            this.score = human.score;
        }
    }
}
