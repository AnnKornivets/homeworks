package homework4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Exc1 {
    public static void main(String[] args) throws IOException {
        ClassLoader loader= Collection.class.getClassLoader();
        File file =new File(loader.getResource("wp.txt").getFile());

//Читаем строки из файла
        List<String> lines= Files.readAllLines(file.toPath());
        //слова
        List<String> words =new ArrayList<>();

        for (String line:lines){
            String[] wordSplit = line.toLowerCase()//приведение к нижнему регистру
                    .replaceAll("\\p{Punct}"," ")//знаки препинания на пробел
                    .trim()// убираем пробелы с двух сторон
                    .split("\\s");

            for (String s:wordSplit){
                if(s.length()>0) {
                    words.add(s.trim());
                }
            }
        }

        for(String word:words){
            System.out.println(word);
        }


    }

}
