package Java_Feb24th;

import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) throws Exception {

        Connection con;
        PreparedStatement pst,pst1,pst2,pst3,pst4;
        ResultSet rs,rs1,rs2;
        Statement st;

        String url = "jdbc:mysql://localhost:3306/assignment";
        String usr = "root";
        String pwd = "root";

        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, usr, pwd);

        st=con.createStatement();

        String format = "insert into Student values(?,?,?,?,?)";//id,name,year,percentage,city

        pst = con.prepareStatement(format);
        st = con.createStatement();

        Scanner cin = new Scanner(System.in);

       System.out.println("Enter student Details dynamically by PreparedStatement ::::: ");
      // alter table
     st.execute("alter table Student add Gender ENUM('M','F')");
        while (true) {
            System.out.println("Enter id : ");
            int id = cin.nextInt();

            System.out.println("Enter name : ");
            String name = cin.next();

            System.out.println("Enter year: ");
            int year = cin.nextInt();

            System.out.println("Enter percentage : ");
            float percent = cin.nextFloat();

            System.out.println("Enter city: ");
            String city= cin.next();

            System.out.println("Enter Gender");
            String gender=cin.next();


            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, year);
            pst.setFloat(4, percent);
            pst.setString(5, city);
            pst.setString(6,gender);


            pst.executeUpdate();

            System.out.println("Records inserted Successfully");

            System.out.println("Do u want to continue ...");
            String option = cin.next();

            if (option.equalsIgnoreCase("no")) {
                break;
            }
        }
        String query="select * from Student";
        rs=st.executeQuery(query);
        System.out.println("Student Table");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+
            "  "+rs.getFloat(4)+" "+rs.getString(5)+"  "+rs.getString(6));
        }

        System.out.println("********* CASE 2 **********");
         pst1=con.prepareStatement("select * from student where year=2018 and percentage>70");
         rs2=pst1.executeQuery();
        while(rs2.next()){
            System.out.println(rs2.getInt(1) + " " + rs2.getString(2) + " " +
                    rs2.getInt(3) + " " + rs2.getFloat(4) + " " +
                    rs2.getString(5)+"  "+rs2.getString(6));
        }
        System.out.println("********* CASE 3 **********");
         pst2=con.prepareStatement("select * from student where id between 1 and 10");
         rs1=pst2.executeQuery();
        while(rs1.next()){
            System.out.println(rs1.getInt(1) + " " + rs1.getString(2) +
                    " " + rs1.getInt(3) + " "+ rs1.getFloat(4)+" " +
                    rs1.getString(5)+" "+rs1.getString(6));
        }

        System.out.println("***** CASE 4 *****");
         pst3 = con.prepareStatement("update student set name = concat('Mr. ', name) where gender = 'M'");
        int x = pst3.executeUpdate();
        System.out.println(x+" updated");
         pst4 = con.prepareStatement("update student set name = concat('Ms. ', name) where gender = 'F'");
        int y =pst4.executeUpdate();
        System.out.println(y+" updated");
        System.out.println("Deleting records ");
        //removing those students who are in 2016 year
        pst = con.prepareCall("delete from student where year = 2016");
        pst.executeUpdate();
        System.out.println("Deleted..");

    }
}

/*
Enter student Details dynamically by PreparedStatement :::::
Student Table
1  Sailakshmi  2018  85.56 Hyderabad  F
2  Lahari  2020  82.21 Guntur  F
3  pavan  2018  78.96 pune  M
4  Ravi  2016  75.34 Guntur  M
5  Pooja  2017  72.45 Hyderabad  F
6  Tannu  2018  87.0 pune  F
8  Aarti  2012  85.23 nagpur  F
10  Shefali  2015  75.34 nagpur  F
11  Sneha  2017  85.56 Hyderabad  F
14  Tharun  2018  88.45 Guntur  M
16  supriya  2019  67.23 punr  F
18  Brunda  2018  73.45 Nagpur  F
20  Keerthana  2017  89.01 Guntur  F


********* CASE 2 **********
1 Sailakshmi 2018 85.56 Hyderabad  F
3 pavan 2018 78.96 pune  M
6 Tannu 2018 87.0 pune  F
14 Tharun 2018 88.45 Guntur  M
18 Brunda 2018 73.45 Nagpur  F


********* CASE 3 **********
1 Sailakshmi 2018 85.56 Hyderabad F
2 Lahari 2020 82.21 Guntur F
3 pavan 2018 78.96 pune M
4 Ravi 2016 75.34 Guntur M
5 Pooja 2017 72.45 Hyderabad F
6 Tannu 2018 87.0 pune F
8 Aarti 2012 85.23 nagpur F
10 Shefali 2015 75.34 nagpur F


+----+--------------------+------+------------+-----------+--------+
| id | name           | year | percentage | city      | Gender |
+----+--------------------+------+------------+-----------+--------+
|  1 | Ms. Sailakshmi | 2018 |      85.56 | Hyderabad | F      |
|  2 | Ms. Lahari     | 2020 |      82.21 | Guntur    | F      |
|  3 | Mr. pavan      | 2018 |      78.96 | pune      | M      |
|  5 | Ms. Pooja      | 2017 |      72.45 | Hyderabad | F      |
|  6 | Ms. Tannu      | 2018 |         87 | pune      | F      |
|  8 | Ms. Aarti      | 2012 |      85.23 | nagpur    | F      |
| 10 | Ms. Shefali    | 2015 |      75.34 | nagpur    | F      |
| 11 | Ms. Sneha      | 2017 |      85.56 | Hyderabad | F      |
| 14 | Mr. Tharun     | 2018 |      88.45 | Guntur    | M      |
| 16 | Ms. supriya    | 2019 |      67.23 | punr      | F      |
| 18 | Ms. Brunda     | 2018 |      73.45 | Nagpur    | F      |
| 20 | Ms. Keerthana  | 2017 |      89.01 | Guntur    | F      |
+----+--------------------+------+------------+-----------+--------+
 */