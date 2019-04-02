package hwFile1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HwClass {
    public static void main(String[] args) {
        int k1=6;
        int k2=8;
        try {
            NewFile(k1,k2);
        } catch (IOException e) {
            e.printStackTrace();
        }

      try {
          splitFile(new File(" ")); } catch (IOException e) {
           e.printStackTrace();
       }

    }


    public static void NewFile(int k1,int k2) throws IOException {
        FileWriter fiel=new FileWriter("file1.txt");

        for(int i=k1;i<=k2;i++){

            fiel.write(i +"\n “Curiouser and curiouser !” cried Alice\n" +
                    "(she was so much surprised, that for the\n" +
                    "moment she quite forgot how to speak good\n" +
                    "English) ; “ now I ’m\n" +
                    "opening out like the\n" +
                    "largest telescope that\n" +
                    "ever was! Good-bye,\n" +
                    "feet !” (for when she\n" +
                    "looked down at her\n" +
                    "feet, they seemed to\n" +
                    "be almost out of sight,\n" +
                    "they were getting so\n" +
                    "far off) " );
        }
        fiel.close();
    }


    public static void splitFile(File file) throws IOException{
        int partCounter=1;
        int sizeFiles=1024*1024;
        byte[] buf=new byte[sizeFiles];
        String fileName= file.getName();

        try(FileInputStream flis=new FileInputStream(file);
            BufferedInputStream bs=new BufferedInputStream(flis)){

            int bytesAmount=0;
            while ((bytesAmount=bs.read(buf))>0){

                String filePartName=String.format("%s.",fileName,partCounter++);
                File newFile=new File(file.getParent(),filePartName);

                try(FileOutputStream output=new FileOutputStream(newFile)){
                    output.write(buf,0,bytesAmount);
                }
            }
        }


    }

    public static void mergeFiles(List<File> files,File into)throws IOException{
        try (FileOutputStream fid=new FileOutputStream(into);
             BufferedOutputStream mergingStream=new BufferedOutputStream(fid)
        ){for (File f:files){
            Files.copy(f.toPath(), mergingStream);
        }

        }

    }
}
