package homework1;

import java.util.Scanner;

public class ParallelepipedArea {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Введите высоту,ширину и длину прямоугольного параллепипеда ");

        int h=k.nextInt();
        int w=k.nextInt();
        int l=k.nextInt();
        int s=2*(h*l+l*w+w*h);
        System.out.println("Площадь параллелепипеда  равна " + s);




             if(h>w)
             {
                 System.out.println("Высота больше ширины");
             }
             else if(h==w)
             {
                 System.out.println("Высота и ширина равны");
             }
             else
             {
                 System.out.println("Ширина больше высоты");

             }

    }
}
