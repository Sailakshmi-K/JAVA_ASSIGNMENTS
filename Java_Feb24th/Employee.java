package Java_Feb24th;

import java.sql.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Employee {

    public static void main(String[] args) throws Exception {

        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        Statement st;

        String url = "jdbc:mysql://localhost:3306/assignment";
        String usr = "root";
        String pwd = "root";

        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, usr, pwd);

        String query = "insert into Employee values(?,?,?,?,?,?,?)";//id,name,designation,doj,exp,salary,status

        pst = con.prepareStatement(query);
        st = con.createStatement();

        Scanner cin = new Scanner(System.in);

              System.out.println("Enter student Details dynamically by PreparedStatement ::::: ");
               while (true) {
                    System.out.println("Enter id : ");
                    int id = cin.nextInt();

                    System.out.println("Enter name : ");
                    String name = cin.next();

                    System.out.println("Enter designation: ");
                    String desg = cin.next();

                    System.out.println("Enter doj : ");
                    String doj = cin.next();

                    System.out.println("Enter status: ");
                    String status = cin.next();

                    System.out.println("Enter experience : ");
                    int exp = cin.nextInt();

                    System.out.println("Enter salary : ");
                    float sal = cin.nextFloat();

                    pst.setInt(1, id);
                    pst.setString(2, name);
                    pst.setString(3, desg);
                    pst.setString(4, doj);
                    pst.setInt(5, exp);
                    pst.setFloat(6, sal);
                    pst.setString(7, status);

                    pst.executeUpdate();

                    System.out.println(" Records inserted Successfully");

                    System.out.println("Do u want to continue ...");
                    String s = cin.next();
                    if (s.equalsIgnoreCase("no")) {
                        break;
                    }
                    break;
                }
rs=st.executeQuery("select * from Employee");
        System.out.println("Table");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "
                    +rs.getString(4)+"  "+rs.getInt(5)+"  "+rs.getFloat(6)+" "+rs.getString(7));
        }
        System.out.println("**********************************************");
      st.execute("alter table Employee add city varchar(20)");


        st.executeUpdate(" update Employee set city = 'pune' where id = 1");
        st.executeUpdate(" update Employee set city = 'Guntur' where id = 2");
        st.executeUpdate(" update Employee set city = 'pune' where id = 3");
        st.executeUpdate(" update Employee set city = 'Hyderabad' where id = 4");
        st.executeUpdate(" update Employee set city = 'pune' where id = 5");
        st.executeUpdate(" update Employee set city = 'pune' where id = 6");
        st.executeUpdate(" update Employee set city = 'Guntur' where id = 7");
        st.executeUpdate(" update Employee set city = 'Amaravathi' where id = 8");
        st.executeUpdate(" update Employee set city = 'pune' where id = 9");
        st.executeUpdate(" update Employee set city = 'pune' where id = 10");
        System.out.println("Record updated");

        rs=st.executeQuery("select * from Employee where city= 'pune' and salary>20000");//100
        System.out.println("Employee details - salary greater than 20000 and lives in pune");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
                    +rs.getString(4)+" "+rs.getFloat(5)+" "+rs.getFloat(6)+"  "+rs.getString(7)+"  "+rs.getString(8));
        }
        System.out.println("*********************************************");
        st.executeUpdate (" update Employee set salary = salary+1000  where exp = 3");
        System.out.println("Updated salary of employee whose experience greater than 3");
        st.execute("delete from Employee where status ='left'");
        System.out.println("Deleted employee details who left");

                con.close();
                pst.close();
                st.close();


    }
}
