package org.example;

import Com.Dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Sailakshmi
 * Spring Framework JDBC
 * CRUD Operations
 */
public class App {
    public static void main(String[] args) {

        try {
            String bn,an;
            float p;
            List<Book>l;
            int res,bid,ch;
            Book b;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            do {
                System.out.println("Enter the following options ::\n1.Insert\t2.Update\t3.Delete\t4.Fetch All\t5.Fetch by name\t6.Fetch in between\t7.Fetch Like\t8.exit");
                ch=Integer.parseInt(br.readLine());
                ApplicationContext c= new ClassPathXmlApplicationContext("SpringJdbc.xml");
                BookDao bd = (BookDao) c.getBean("dao");
                switch (ch) {
                    case 1:
                        b = new Book();
                        System.out.println("::: INSERT :::");
                        System.out.println("Enter Book name : ");
                        b.setBookName(br.readLine());
                        System.out.println("Enter author name : ");
                        b.setAuthorName(br.readLine());
                        System.out.println("Enter book price : ");
                        b.setPrice(Float.parseFloat(br.readLine()));
                        res = bd.insertBook(b);
                        if (res > 0) {
                            System.out.println("Success.");
                        } else {
                            System.out.println("Try again.");
                        }
                        break;
                    case 2:
                        System.out.println("::: UPDATE :::");
                        System.out.println("Enter book name :");
                        bn = br.readLine();
                        System.out.println("Enter price :");
                        p = Float.parseFloat(br.readLine());

                        res = bd.updateBook(bn, p);
                        if (res > 0) {
                            System.out.println("Value updated successfully.....");
                        } else {
                            System.out.println("Try again");
                        }
                        break;

                    case 3:
                        System.out.println(":::DELETE:::");
                        System.out.println("Enter book name: ");
                        bn=br.readLine();
                        res=bd.deleteBook(bn);
                        if (res > 0) {
                            System.out.println("Record deleted successfully.....");
                        } else {
                            System.out.println("Try again");
                        }
                        break;

                    case 4:
                        System.out.println(":::Fetch All:::");

                            l=bd.fetch();
                            for(Book l1:l){
                                System.out.println(l1);
                            }
                            break;
                    case 5:
                        System.out.println("::: Fetch BY NAME:::");
                        System.out.println("Enter book name :");
                        bn=br.readLine();
                        l=bd.fetchByName(bn);
                        for(Book l1:l){
                            System.out.println(l1);
                        }
                        break;
                    case 6:

                        System.out.println("::: Fetch IN BETWEEN PRICE:::");
                        System.out.println("Enter low price :");
                        int lp= Integer.parseInt(br.readLine());
                        System.out.println("Enter high price :");
                        int hp= Integer.parseInt(br.readLine());
                        l=bd.fetchInBetween(lp,hp);
                        for(Book l1:l){
                            System.out.println(l1);
                        }
                        break;

                    case 7:

                        System.out.println("::: Fetch BY LIKE:::");
                        System.out.println("Enter author format :");
                        bn=br.readLine();
                        l=bd.fetchByLike(bn);
                        for(Book l1:l){
                            System.out.println(l1);
                        }
                        break;

                    case 8:
                        System.out.println("Thank you");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter vaild option");
                }
            }while (true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
