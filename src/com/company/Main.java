package com.company;

public class Main {
//В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//полям). Затем распечатать всю информацию о боссе.

//Добавить метод в классе Main который называется createHeroes, в теле метода
//необходимо создать 3х героев с помощью класса Hero, используя при этом разные
//варианты конструкторов (либо первый либо второй). Затем поместить созданные
//экземпляры героев в массив и вернуть его с помощью команды return, как
//возвращаемый результат метода createHeroes. Hero[]

//Затем вызвать этот метод в методе main и распечатать информацию о всех героях
//массива через цикл.


    public static void main(String[] args) {
        boss boss = new boss();
        int heart = 200;
        int damage = 50;
        String defenceType = "Магическое";
        System.out.println(heart + " " + damage + " " + defenceType);
        createHeroes();
        }
        public static void createHeroes(){
        Hero mag = new Hero(250, 25, "Magical");
        Hero warrior = new Hero(290, 30, "Physical");
        Hero healer = new Hero(200, 0, "HolyEnergy");
            System.out.println(mag.getHeart() + " " + + mag.getDamage() + " " + mag.getTypeAttack());
            System.out.println(warrior.getHeart() + " " + + warrior.getDamage() + " " + warrior.getTypeAttack());
            System.out.println(healer.getHeart() + " " + + healer.getDamage() + " " + healer.getTypeAttack());
        return;
    }

}
