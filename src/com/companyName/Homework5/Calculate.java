package com.companyName.Homework5;

public class Calculate {



        //статический метод
        public static double summ(int a, int b){
            return a+b;
        }
    public static double diff(int a, int b){return a-b; }
    public static double multi(int a, int b){return a*b; }
    public static double div(double a, double b){return a/b; }
        //final методы нельзя переопределить в дочерных классах
        //final аргументы доступны только для чтения в методе
        public final void someVoid(final int a){}
    }

