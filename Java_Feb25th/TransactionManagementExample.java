package Java_Feb25th;

import java.sql.*;
import java.util.Scanner;

public class TransactionManagementExample {

    public static void main(String[] args) throws Exception{

        Connection con;
        ResultSet rs;
        Statement st;

        String url = "jdbc:mysql://localhost:3306/assignment";
        String usr = "root";
        String pwd = "root";

        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, usr, pwd);

        st=con.createStatement();

       Scanner cin=new Scanner(System.in);
        System.out.println("Enter source account no : ");
        int srcno=cin.nextInt();
        System.out.println("Enter Destination Account no : ");
        int destno=cin.nextInt();
        System.out.println("Enter amount to transfer : ");
        float amount=cin.nextFloat();

        //transaction begin
        con.setAutoCommit(false);

        // withdraw
      st.executeUpdate("update Account_Details set balance=balance-"+amount+" where account="+srcno);
        System.out.println("Withdrawn success ...");
        // Deposit
       st.executeUpdate("update Account_Details set balance=balance+"+amount+" where account="+destno);

       con.commit();

        rs=st.executeQuery("select * from Account_Details");
        System.out.println("Deposit success");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t" +
                    rs.getInt(4));
        }

        try {
            if (con != null) {
                con.rollback();
                System.out.println("Rollback....");
                rs = st.executeQuery("select * from Account_Details");
                while(rs.next()){
                    System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t" +
                            rs.getInt(4));
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            rs.close();
            st.close();
            con.close();
            System.out.println("Good bye ");
        }












    }
}
/*

+----+---------+---------+---------+
| id | name    | balance | Account |
+----+---------+---------+---------+
|  1 | Ram     |    3000 |     100 |
|  2 | Ishitha |    4500 |     101 |
|  3 | Nandu   |    1500 |     103 |
|  4 | Lahari  |    3600 |     104 |
+----+---------+---------+---------+

Enter source account no :
101
Enter Destination Account no :
103
Enter amount to transfer :
200
Withdrawn success ...
Deposit success
1	Ram	3000.0	100
2	Ishitha	3900.0	101
3	Nandu	1900.0	103
4	Lahari	3800.0	104
Rollback....
1	Ram	3000.0	100
2	Ishitha	3900.0	101
3	Nandu	1900.0	103
4	Lahari	3800.0	104
Good bye


 */

