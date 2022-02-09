package JavaIO;
//read data from multiple files
import java.io.*;

public class SequenceInStream {
    public static void main(String args[]) throws FileNotFoundException , IOException {
        File f = new File("src/JavaIO/Third.txt");
        FileInputStream fin1 = new FileInputStream("src/JavaIO/Abcd.txt");
        FileInputStream fin2 = new FileInputStream("src/JavaIO/Abc.txt");
        FileOutputStream fin3 = new FileOutputStream(f);
        SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
        int i = 0;
        while ((i = sin.read()) != -1) {
            fin3.write(i);
            System.out.print((char) i);
        }

    }
}

