package org.example;


import Dao.BookDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

/**
 * Sailakshmi
 */

public class App
{
    public static void main( String[] args ) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch,i;
        Book b;
        List<Book> booklist,booklist1;
        do{
            System.out.println("1.Insert\t2.Fetch by Price\t3.Fetch by author\t4.exit");
            System.out.println("Enter your choice : ");
            ch=Integer.parseInt(br.readLine());

            switch(ch){
                case 1:
                    System.out.println("Enter book name,author, price :");
                    b=new Book();
                    b.setBname(br.readLine());
                    b.setAuthor(br.readLine());
                    b.setPrice(Float.parseFloat(br.readLine()));

                    i= BookDao.insert(b);
                    if(i>0){
                        System.out.println("Inserted successfully..");
                    }
                    else{
                        System.out.println("Try Again :)");
                    }
                    break;

                case 2:   booklist=BookDao.fetchByPrice(400.00F);
                for(Book b1:booklist){
                    System.out.println(b1);
                }
                break;
                case 3: String name=br.readLine();
                    booklist1=BookDao.fetchByAuthor(name);
                    for(Book b9:booklist1){
                        System.out.println(b9);
                    }
                    break;

                case 4: System.exit(0);
                default:
                    System.out.println("Enter valid options...");
            }

        }while(true);

    }
}
