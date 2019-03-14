package homework3;

import java.util.Scanner;

/*Найти в строке указанную подстроку и заменить ее на новую.
Строку, ее подстроку для замены и новую подстроку вводит пользователь.
*/
public class exercise5 {
    public static void main(String[] args) {


        String str0="“Curiouser and curiouser !” cried Alice\n" +
                "(she was so much surprised, that for the\n" +
                "moment she quite forgot how to speak good\n" +
                "English) ; “";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку,которую надо заменить и на что");

        String str1=scan.next();
        String str2=scan.next();

        System.out.println(str0.replaceAll(str1,str2));

    }
}
