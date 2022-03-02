package Java_Feb24th;

import java.sql.*;//step1

/**
 * import the package -->java.sql
 * load and register the drivers--> com.mysql.jdbc.driver
 * Establish connection--->Connection interface
 * Create a Statement---->Statement
 * execute Query & assign to ResultSet
 * process the results
 * close

 */
public class JdbcDemoClass {
    public static void main(String args[]) throws Exception {

        Connection con;
        Statement st;
        ResultSet rs;
        PreparedStatement pst;
        CallableStatement cst;
        String query="select * from ece";

        String url="jdbc:mysql://localhost:3306/college";

        String usr="root";
        String pwd="root";

        Class.forName("com.mysql.jdbc.Driver");//step2

        con=DriverManager.getConnection(url,usr,pwd);//step3

        st=con.createStatement();//step4
        //pst=con.prepareStatement();
        //cst=con.prepareStatement();

        rs=st.executeQuery(query);//step5

        //step6
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%5s %5s %5s %10s %5s", "Student_id", "Student_firstname", "Student_lastname", "Student_address", "Student_phoneno");
        System.out.println();

        System.out.println("*******DATA IS**********");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "
                    +rs.getString(4)+" "+rs.getInt(5));
        }



        st.close();
        con.close();

    }

}
