package Java_Feb24th;

import java.sql.*;
import java.util.Scanner;

public class CallableStatementDemo {
    public static void main(String[] args) throws Exception {

        Scanner cin=new Scanner(System.in);

        Connection con;
        CallableStatement cst;
        ResultSet rs;
        Statement st;

        String url="jdbc:mysql://localhost:3306/college";
        String usr="root";
        String pwd="root";

        Class.forName("com.mysql.jdbc.Driver");

        con=DriverManager.getConnection(url,usr,pwd);


        System.out.println("===========Callable without parameters===========");
        cst=con.prepareCall("call ece_details()");
        rs=cst.executeQuery();

        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+
                    rs.getString(4)+"\t"+rs.getInt(5));
        }

        System.out.println("Executed stored procedure!!!");

        System.out.println("========== Callable With Parameters ==============");

        System.out.println("************IN*****************");

        System.out.println("Enter lastname:");
        String s=cin.next();

       cst=con.prepareCall("call ece_in(?)");

        cst.setString(1,s);

        rs=cst.executeQuery();

        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+
                    rs.getString(4)+"\t"+rs.getInt(5));
        }


        System.out.println("********IN-OUT*************");

        cst=con.prepareCall("call ece_inout(?,?)");
        System.out.println("Enter id :");
        int i=cin.nextInt();
        cst.setInt(1,i);
        cst.registerOutParameter(2,Types.VARCHAR);
        cst.executeUpdate();
        String s2=cst.getString(2);
        System.out.println("Printing student details whose id : "+i+" is : "+s2);


        System.out.println("************OUT*****************");

        cst=con.prepareCall("call ece_out(?)");
        cst.registerOutParameter(1,java.sql.Types.VARCHAR);
        cst.executeUpdate();
        String s1=cst.getString(1);
        System.out.println("Printing student details whose address is TamilNadu : "+s1);

    con.close();
    cst.close();
    rs.close();



    }
}
/*
========== Callable Without Parameters ==============
1	Sailakshmi	Kunchanapalli	Andhra Pradesh	93451234
3	Keerthi	Shetty	Andhra Pradesh	865263819
Executed stored procedure!!!
========== Callable With Parameters ==============
************IN*****************
Enter lastname:
Kunchanapalli
1	Sailakshmi	Kunchanapalli	Andhra Pradesh	93451234
4	Lahari	Kunchanapalli	TamilNadu	799583868

************OUT*****************
Printing student details whose address is TamilNadu : null
********IN-OUT*************
Enter id :
3
Printing student details whose id : 3 is : null
 */