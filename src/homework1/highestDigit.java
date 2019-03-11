package homework1;

import java.util.Scanner;

public class highestDigit {
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число ");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int a=number%10;
        int b=(number/10)%10;
        int c=(number/100)%10;

        if(a>b&a>=c){

            System.out.println("В числе "+number+" наибольшая цифра "+a);
        }
        else if (b>=a&b>c){
            System.out.println("В числе "+number+" наибольшая цифра "+b);
        }
        else if (c>=b&c>a)
        {
            System.out.println("В числе "+number+" наибольшая цифра "+c);
        }
       else if(c==a&c==b)
            System.out.println("В числе "+number+" все цифры равны "+ c);
    }
}
