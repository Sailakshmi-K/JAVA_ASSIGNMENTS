package JavaIO;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class PipedInputOutputStream {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();
        try {
            pis.connect(pos);
            // Write to the PipedOutputStream
            pos.write(97);
            pos.write(64);
            pos.write(117);
            pos.write(56);
            // read the PipedInputStream
            int c;
            while ((c = pis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
