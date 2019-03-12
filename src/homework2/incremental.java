package homework2;

import java.util.Scanner;

public class incremental {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if (a < b && a < c && b< c) {
            System.out.println (a + " " + b + " " + c);
        } else if (b < a && b< c && a <c) {
            System.out.println (b+ " " + a + " " + c);
        } else if (c < a && c < b && a < b) {
            System.out.println (c + " " + a + " " + b);
        }
    }
}
