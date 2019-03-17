package com.companyName.Homework3;
/*Создать класс Dog с пятью конструкторами:

- Имя

- Имя, вес, возраст

- Имя, возраст

- Вес, цвет

- вес, цвет, адрес (домашний пес)

Задача конструктора – сделать объект валидным.

Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Какие свойства необходимо задать по умолчанию, а какие нет, определить самостоятельно. */

public class Dog {

   private String Name;
    private int Age=3;
    private int weight=12;
    private String Color="Цвет не указан";
    private String Address="Адрес не указан";


    public Dog(){};

    public Dog(String Name){
        this.Name = Name; };

    public Dog(String Name,int Age,int weight){
        this.Name = Name;
        this.Age=Age;

        this.weight=weight;

    };

    public Dog(String Name,int Age){
        this.Name = Name;
        this.Age=Age;
    };


    public Dog(int weight,String Color){
        this.Color=Color;

        this.weight=weight;

    };


    public Dog(int weight,String Color,String Address){
        this.weight=weight;
        this.Color=Color;
        this.Address=Address;

    };



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        this.weight=weight;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", weight=" + weight +
                ", Color='" + Color + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}




