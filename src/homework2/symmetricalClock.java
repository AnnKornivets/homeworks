package homework2;

public class symmetricalClock {
    public static void main(String[] args) {
        int a =0;
        for(int h=1;h<=24;h++){
            for(int m=0;m<=59;m++){
                if(h/10%10==m%10&h%10==m/10%10){
                    a++;
                }
            }
        }
        System.out.println("Всего "+a+" совпадений");
    }
}
