package homework1;

import java.util.Scanner;

public class quadraticEquation {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Введите a,b и c ");
        float a=k.nextFloat();
        float b=k.nextFloat();
        float c=k.nextFloat();

        double d=(b*b)-4*a*c;
        float x1;
        float x2;
        if(d==0)
        {
            x1=-1*(b/(2*a));
            System.out.println("Уровнение имеет один квадратный корень " + x1);
        }

       else if(d>0)
        {
            x1=((-1*b)+(float)Math.sqrt(d))/(2*a);
            x2=((-1*b)-(float)Math.sqrt(d))/(2*a);
            System.out.println("Уравнение имеет 2 квадратных корня: "+x1+" и " +x2);
        }
        else
        {
            System.out.println("Уравнение не имеет квадратных корней");

        }
    }
}
