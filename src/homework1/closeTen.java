package homework1;

import java.util.Scanner;

public class closeTen {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Введите n и m ");
        double n=k.nextDouble();
        double m=k.nextDouble();

        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);

        if (b==c){

            System.out.println("Числа "+n+" и "+m+" равны ");
        }
        else if (b>c){

            System.out.println("Число "+ m+" ближе к "+a);
        }
       else if (b<c){

            System.out.println("Число "+ n+" ближе к "+a);
        }

        System.out.println("URA");
    }
}
