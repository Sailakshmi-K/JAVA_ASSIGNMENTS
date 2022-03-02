package Java_Feb25th;

import java.sql.*;
import java.util.Scanner;

public class TeacherClass {

    public static void main(String[] args) throws Exception {

        Connection con;
        ResultSet rs;
        Statement st;

        String url = "jdbc:mysql://localhost:3306/assignment";
        String usr = "root";
        String pwd = "root";

        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, usr, pwd);

        st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

        String format = "select * from Teacher"; // name,designation

        rs=st.executeQuery(format);

        Scanner cin = new Scanner(System.in);

       /* System.out.println("Insert new Records :::: ");

        while(true) {

            rs.moveToInsertRow();

            System.out.println("Enter teacher name :");
            String s=cin.next();
            System.out.println("Enter designation :");
            String d=cin.next();

            rs.updateString(2, s);
            rs.updateString(3, d);
            rs.insertRow();
            System.out.println("Record inserted successfully .... ");

            System.out.println("Do u want to continue :");
            String option = cin.next();
            if(option.equalsIgnoreCase("no")){
                break;
            }
        }*/

       /*
       rs.absolute(1);

        System.out.println("Update designation :::");
        String desg=cin.next();
        rs.updateString(3,desg);
        rs.updateRow();
        System.out.println("Successfully updated..");*/

        System.out.println("Delete record");
        rs.absolute(4);
        rs.deleteRow();//deletes 4th record

        System.out.println("successfully deleted 4th record");


        rs.absolute(0);
        System.out.println("Teacher Table :::::");
        while (rs.next()){
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getString(3));
        }
        rs.close();
        con.close();
        st.close();
    }
}

/*
Insert new Records ::::
Enter teacher name :
Jagadesh
Enter designation :
Lecturer
Record inserted successfully ....

Do u want to continue :
yes

Enter teacher name :
Anil
Enter designation :
Asst.Professor
Record inserted successfully ....

Do u want to continue :
no

Teacher Table :::::
1  Suresh   Lecturer
2  Mvsp   Professor
3  Ravindra   Asst.Professor
4  Jagadesh   Lecturer
5  Anil   Asst.Professor

Update designation :::
Asst.Professor
Successfully updated..

Teacher Table :::::
1  Suresh   Asst.Professor
2  Mvsp   Professor
3  Ravindra   Asst.Professor
4  Jagadesh   Lecturer
5  Anil   Asst.Professor


Delete record
successfully deleted 4th record
Teacher Table :::::
1  Suresh   Asst.Professor
2  Mvsp   Professor
3  Ravindra   Asst.Professor
5  Anil   Asst.Professor

 */