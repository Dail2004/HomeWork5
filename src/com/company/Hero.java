package com.company;
//Создать класс Героя (Hero), с приватными полями здоровье, урон и
//суперспособность. Написать 2 разных конструктора для создания объекта. В одном
//конструкторе задаются все поля, в другом только здоровье и урон. Добавить в
//класс Hero геттеры для всех полей.

public class Hero {
    private int heart;
    private int damage;
    private String typeAttack;

    public Hero(int heart, int damage, String typeAttack) {
        this.heart = heart;
        this.damage = damage;
        this.typeAttack = typeAttack;
    }

    public String getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(String typeAttack) {
        this.typeAttack = typeAttack;
    }

    public Hero(int heart, int damage) {
        this.heart = heart;
        this.damage = damage;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
//Добавить метод в классе Main который называется createHeroes, в теле метода
//необходимо создать 3х героев с помощью класса Hero, используя при этом разные
//варианты конструкторов (либо первый либо второй). Затем поместить созданные
//экземпляры героев в массив и вернуть его с помощью команды return, как
//возвращаемый результат метода createHeroes. Hero[]
    }
