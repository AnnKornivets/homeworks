package homework3;
/*требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef". */
public class exercise6 {
    public static void main(String[] args) {

        String str0="“Curiouser and curiouser !” cried Alice\n" +
                "(she was so much surprised, that for the\n" +
                "moment she quite forgot how to speak good\n" +
                "English) ; “";

        System.out.println(str0.replaceAll("\\s+","") );


    }
}
