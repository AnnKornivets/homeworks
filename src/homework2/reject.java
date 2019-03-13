package homework2;

public class reject {
    public static void main(String[] args) {
        System.out.println(getBrak(50000));
    }

    static int getBrak(int count) {
        int brak = 0;
        boolean hasTwo = false;
        for (int i = 0; i <= count; i++) {
            int j = i;
            hasTwo = false;
            while (j > 0) {
                if (j % 10 == 2) {
                    hasTwo = true;
                    break;
                }
                j = j / 10;
            }
            if (hasTwo)
                brak++;

        }
        return brak;
    }
}
