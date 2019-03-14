package homework3;
/*Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
*/
public class exercise3 {
    public static void main(String[] args) {
   int s=0;
   int d=15;
        int[] arr;
        arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =((int)(Math.random() * 9) );
            System.out.println(arr[i]);


            if(arr[i]>0&arr[i]%2==0)s++;
        }
        System.out.println(" ");
        System.out.println("Всего в массиве "+s+" четных");
    }
}
