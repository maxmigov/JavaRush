package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human granpa1 = new Human("Bob", true, 75);
        Human granpa2 = new Human("Mike", true, 80);
        Human granma1 = new Human("Whitney", false, 72);
        Human granma2 = new Human("Kaley", false, 78);
        Human pa = new Human("Bill", true, 45, granpa1, granma1);
        Human ma = new Human("Gill", false, 40, granpa2, granma2);
        Human child1 = new Human("Jason", true, 20, pa, ma);
        Human child2 = new Human("Mary", false, 17, pa, ma);
        Human child3 = new Human("Sarah", false, 16, pa, ma);
        
        System.out.println(granpa1.toString());
        System.out.println(granpa2.toString());
        System.out.println(granma1.toString());
        System.out.println(granma2.toString());
        System.out.println(pa.toString());
        System.out.println(ma.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
