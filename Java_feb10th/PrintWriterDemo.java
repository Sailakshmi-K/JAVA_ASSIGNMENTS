package JavaInputTypes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args)  {
        PrintWriter obj_pw = null;

        try {
            obj_pw = new PrintWriter(new File("src/JavaInputTypes/p.txt"));
            obj_pw.write("Print writer file");
            System.out.println("Success.....");
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            obj_pw.close();
        }

    }
}
/*
OUTPUT :::::

Success.....
It is mandatory to close the stream beacuse we need to release the resources allocated to system and to prevent accidental deletion of the stream data.

 */
