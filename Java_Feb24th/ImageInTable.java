package Java_Feb24th;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class ImageInTable {
    public static void main(String[] args) throws Exception {
        Connection con;
        PreparedStatement pst;
        ResultSet rs;

        String url = "jdbc:mysql://localhost:3306/assignment";
        String usr = "root";
        String pwd = "root";

        Class.forName("com.mysql.jdbc.Driver");

        con = DriverManager.getConnection(url, usr, pwd);
        String query="insert into image(image) values(?)";
        pst=con.prepareStatement(query);

        File file=new File("C:\\Users\\Coditas\\IdeaProjects\\JavaProject\\src\\Java_Feb24th\\pic.jpg");

        System.out.println("Add image : ");

        FileInputStream f = new FileInputStream(file);

        pst.setBinaryStream(1,f,f.available());
        pst.executeUpdate();
        System.out.println("Image added....");


    }
}
