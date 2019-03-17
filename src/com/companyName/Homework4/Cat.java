package com.companyName.Homework4;



/*Создать класс Cat.

У кота должно быть имя (name, String),

возраст (age, int),

вес (weight, int),

сила (strength, int).*/
public class Cat {
    public static int count = 0;
    public static int fightcount = 0;
    private String name="Пушистый боец";
    private int age=2;
    private int weight=5;
    private int strength=5; //по 10 бальной шкале

    public Cat(){};

    public Cat(String name,int age,int weight,int streight){
        count++;
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.strength=streight;
    }


    public boolean fight(Cat anotherCat) {
        fightcount++;

        int agePlus = this.age > anotherCat.age ? 1 : 0;
        int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
        int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

        int score = agePlus + weightPlus + strengthPlus;
        return score > 2; // return score > 2 ? true : false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", streight=" + strength +
                '}';
    }
}

