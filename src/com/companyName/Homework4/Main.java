package com.companyName.Homework4;
/*

Реализовать метод boolean fight(Cat anotherCat):

реализовать механизм драки котов в зависимости от их веса, возраста и силы.

Зависимость придумать самостоятельно.

Метод должен определять, выиграли ли мы (this) бой или нет,

т.е. возвращать true, если выиграли и false - если нет.

Должно выполняться условие:

если cat1.fight(cat2) = true,

то cat2.fight(cat1) = false

Сам метод fight не должен выводить данные на экран.*/
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Валерий",2,2,2);
        Cat cat2 = new Cat("Люцифер",2,6,8);
        Cat cat3 = new Cat("Гор",4,6,10);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);


        System.out.println(cat1.fight(cat2));

        System.out.println(cat2.fight(cat3));

    }


}
