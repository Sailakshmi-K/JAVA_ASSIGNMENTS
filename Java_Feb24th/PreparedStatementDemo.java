package Java_Feb24th;

import java.sql.*;
import java.util.Scanner;


public class PreparedStatementDemo {

    public static void main(String[] args) throws Exception {

        Connection con ;
        PreparedStatement pst;
        ResultSet rs;
        Statement st;

        String query="insert into ece values(?,?,?,?,?)";

        String url="jdbc:mysql://localhost:3306/college";
        String usr="root";
        String pwd="root";

        Class.forName("com.mysql.jdbc.Driver");

        con=DriverManager.getConnection(url,usr,pwd);

        pst=con.prepareStatement(query);

        String data="select * from ece";
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter student Details dynamically by PreparedStatement ::::: ");

        while(true){
            System.out.println("Enter id : ");
            int id=cin.nextInt();

            System.out.println("Enter firstname : ");
            String fname=cin.next();

            System.out.println("Enter lastname : ");
            String lname=cin.next();

            System.out.println("Enter address : ");
            String address=cin.next();
            cin.next();

            System.out.println("Enter phone num : ");
            int ph=cin.nextInt();

            pst.setInt(1,id);
            pst.setString(2,fname);
            pst.setString(3,lname);
            pst.setString(4,address);
            pst.setInt(5,ph);

            pst.executeUpdate();

            System.out.println("Record inserted Successfully");
            System.out.println("Do u want to continue ...");
            String s=cin.next();
            if(s.equalsIgnoreCase("no")){
                break;
            }
        }
        st=con.createStatement();

        rs=st.executeQuery(data);
        while(rs.next()){
            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "
                    +rs.getString(4)+"   "+rs.getInt(5));
        }

        con.close();
        pst.close();
        st.close();

    }
}

/*
Enter student Details dynamically by PreparedStatement :::::
Enter id :
6
Enter firstname :
Bhargavi
Enter lastname :
Nallamothu
Enter address :
Madhya Pradesh
Enter phone num :
923745668
Record inserted Successfully
Do u want to continue ...
no
1   Sailakshmi   Kunchanapalli   Andhra Pradesh   93451234
2   Pavan Kalyan   Madatala   Madhya Pradesh   938131894
3   Keerthi   Shetty   Andhra Pradesh   865263819
4   Lahari   Kunchanapalli   TamilNadu   799583868
5   Kusuma   Kadiyala   Maharashtra   952471839
6   Bhargavi   Nallamothu   Madhya   923745668

Process finished with exit code 0

 */
