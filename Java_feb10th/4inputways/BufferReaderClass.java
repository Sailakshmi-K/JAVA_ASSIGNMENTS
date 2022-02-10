package JavaInputTypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderClass {

    int eid;
    String ename;
    float esal;

    public void acceptDetails() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter employee id :");
        eid = Integer.parseInt(br.readLine());

        System.out.println("Enter employee name:");
        ename = br.readLine();

        System.out.println("Enter employe salary :");
        esal = Float.parseFloat(br.readLine());

    }

    public void displayDetails(){

        System.out.println("Employee id is::" + eid + "Name is::" + ename + " with salary::" + esal);

    }

    public static void main(String[] args) {
        BufferReaderClass obj_brc=new BufferReaderClass();
        try {
            obj_brc.acceptDetails();
        } catch (IOException e) {
            e.printStackTrace();
        }
        obj_brc.displayDetails();
    }
}
/*
OUTPUT::::::::::::

Enter employee id :
1
Enter employee name:
sailakshmi
Enter employe salary :
45000
Employee id is::1Name is::sailakshmi with salary::45000.0

 */
