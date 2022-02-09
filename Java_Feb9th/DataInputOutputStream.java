package JavaIO;
//writing and reading data in the file using data output and input streams
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class DataInputOutputStream {
    public static void main(String[] args) throws IOException {
        try {
            //file creation
            File f = new File("src/JavaIO/Xyz.txt");
            // writing int,double
            FileOutputStream fout = new FileOutputStream(f);
            DataOutputStream dout=new DataOutputStream(fout);

            dout.writeInt(5);
            dout.writeDouble(10.05);

            dout.close();
            fout.close();

            //reading content in file
            FileInputStream fin=new FileInputStream(f);
            DataInputStream din=new DataInputStream(fin);

            int x=din.readInt();
            double b=din.readDouble();

            System.out.println("Success.....");
            System.out.println(x+" "+b);

            din.close();
            fin.close();

        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}

