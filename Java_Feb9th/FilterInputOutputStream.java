package JavaIO;

import java.io.*;
/*
FilterOutputStream implements Output Stream
FilterInputStream implements Input stream

 */
public class FilterInputOutputStream {
    public static void main(String[] args) throws IOException {
        try{
            //file creation
            File f = new File("src/JavaIO/pqr.txt");
            // writing into file
            FileOutputStream fout=new FileOutputStream(f);
            FilterOutputStream fsout=new FilterOutputStream(fout);

            String s="Coditas Java ELTP program";
            byte b[]=s.getBytes();
            fsout.write(b);

            fsout.close();
            fout.close();

            // reading
            FileInputStream fin=new FileInputStream(f);
            FilterInputStream fsin=new BufferedInputStream(fin);

            int i =0;
            while((i= fsin.read())!=-1){
                System.out.print((char)i);
            }

            fsin.close();
            fin.close();
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}
//output
//Coditas Java ELTP program
