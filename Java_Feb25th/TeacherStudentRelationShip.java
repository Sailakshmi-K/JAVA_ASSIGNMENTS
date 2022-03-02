package Java_Feb25th;

import java.sql.*;

public class TeacherStudentRelationShip {
    public static void main(String[] args) throws Exception {

        Connection con;
        ResultSet rs;
        PreparedStatement pst;
        Statement st;

        String url = "jdbc:mysql://localhost:3306/relationships";
        String usr = "root";
        String pwd = "root";

        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, usr, pwd);

        st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

      String format = "select * from Teacher"; // id,name
        String format1="select * from Student";//S_Id,S_Name,Teacher_id


        rs=st.executeQuery(format);
        System.out.println("Teacher table ::::::::::::");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
        }


        rs=st.executeQuery(format1);
        System.out.println("Student table ::::::::::::");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }


        System.out.println("********one-One Relationship***********");
        System.out.println("Student-Teacher Table ::::::::");
        pst=con.prepareStatement("select t.T_Name,s.S_Name from teacher t  inner join Student s on t.T_Id=s.S_Id");
        rs= pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }


        System.out.println("***********One-Many Relationship *************");
        System.out.println("Student-Teacher Table ::::::::");
        pst=con.prepareStatement("select t.T_Name,s.S_Name from teacher t  inner join Student s on t.T_Id=s.Teacher_Id");
        rs= pst.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2));
        }
        con.close();
        st.close();
        rs.close();
        pst.close();
    }
}
/*
Teacher table ::::::::::::
1	Aarti
2	Latha
3	Lathika
Student table ::::::::::::
1	Sailakshmi	1
2	Tannu	1
3	Giteshwari	1
4	Shefali	2
5	Sharon	2
6	Ankush	2
7	Ashraf	2
8	Deepak	3

********one-One Relationship***********
Student-Teacher Table ::::::::
Aarti	Sailakshmi
Latha	Tannu
Lathika	Giteshwari

***********One-Many Relationship *************
Student-Teacher Table ::::::::"
Aarti	Sailakshmi
Aarti	Tannu
Aarti	Giteshwari
Latha	Shefali
Latha	Sharon
Latha	Ankush
Latha	Ashraf
Lathika	Deepak
 */