package com.companyName.Homework3;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        System.out.println(dog1);
        Dog dog2=new Dog("Инокентий");
        System.out.println(dog2);
        Dog dog3=new Dog("Инокентий",3,20);
        System.out.println(dog3);
        Dog dog4=new Dog(20,"Палевый","Бухарестская 15 кв 45");
        System.out.println(dog4);
    }
}
