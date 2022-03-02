package Java_Feb25th;

import java.sql.*;

public class CollegeManytoMany {
    public static void main(String[] args) throws Exception{

        Connection con;
        ResultSet rs,rs1;
        PreparedStatement pst;
        Statement st;

        String url = "jdbc:mysql://localhost:3306/relationships";
        String usr = "root";
        String pwd = "root";

        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, usr, pwd);

        st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

       String format = "select * from College_teachers"; // id,name
        String format1="select * from College_students";//S_Id,S_Name,Teacher_id


        rs=st.executeQuery(format);
        System.out.println("Teacher table ::::::::::::");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }


        rs=st.executeQuery(format1);
        System.out.println("Student table ::::::::::::");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
        }

       String format2="select College_Students.s_name,College_Students.id,College_teachers.t_id,College_teachers.t_name,College_teachers.subject " +
               "from College_Students" +
               "Inner Join students_teachers" +
               "on College_Students.id=students_teachers.id" +
               "inner join College_teachers " +
               "on students_teachers.t_id=College_teachers.t_id" +
               "order by College_Students.id" +
               "Limit 10";

        pst=con.prepareStatement(format2);
        rs1=pst.executeQuery();
        System.out.println("Data :::::::::::");
        while(rs1.next()){
            System.out.println(rs1.getString(1)+"\t"+rs1.getInt(1)+"\t"+
                    rs1.getInt(3)+"\t"
            +rs1.getString(4)+"\t"+rs1.getString(5));
        }
        System.out.println("Sucess ..");

    }
}

/*
Teacher table ::::::::::::

+------+---------+---------+
| t_id | t_name  | subject |
+------+---------+---------+
|    1 | Suresh  | Java    |
|    2 | Srinu   | C       |
|    3 | Pavan   | Python  |
|    4 | Radhika | C++     |
|    5 | Sneha   | AWS     |
|    6 | Anil    | .NET    |
+------+---------+---------+

Student table ::::::::::::
+----+------------+------------+--------+
| id | s_name     | s_subjects | gender |
+----+------------+------------+--------+
|  1 | Sailakshmi | Java       | F      |
|  2 | Brunda     | Python     | F      |
|  3 | Supriya    | C          | F      |
|  4 | Ashritha   | C++        | F      |
|  5 | Pavan      | Devops     | M      |
|  6 | Tharun     | Java       | M      |
|  7 | Ravi       | AWS        | M      |
|  8 | Naveen     | .NET       | M      |
|  9 | Mani       | Devops     | M      |
| 10 | Lahari     | C          | F      |
| 11 | Kusuma     | C++        | F      |
+----+------------+------------+--------+
Data:::::::::::::
+------------+----+------+---------+---------+
| s_name     | id | t_id | t_name  | subject |
+------------+----+------+---------+---------+
| Sailakshmi |  1 |    1 | Suresh  | Java    |
| Sailakshmi |  1 |    5 | Sneha   | AWS     |
| Supriya    |  3 |    4 | Radhika | C++     |
| Supriya    |  3 |    6 | Anil    | .NET    |
| Pavan      |  5 |    6 | Anil    | .NET    |
| Pavan      |  5 |    3 | Pavan   | Python  |
| Tharun     |  6 |    2 | Srinu   | C       |
+------------+----+------+---------+---------+
success....


Process finished with exit code 0
 */