package com.company;
//Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
//Добавить в класс геттеры и сеттеры для всех полей.
public class boss {
    private int bossHeart;
    private int bossDamage;
    private int defenceType;

    public int getBossHeart() {
        return bossHeart;
    }

    public void setBossHeart(int bossHeart) {
        this.bossHeart = bossHeart;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getDefenceType() {
        return defenceType;
    }

    public void setDefenceType(int defenceType) {
        this.defenceType = defenceType;
    }
}
