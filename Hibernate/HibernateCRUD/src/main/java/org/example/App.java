package org.example;

import dao.ProfessorDao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int ch,i;
        List<Professor> l;

        do {
            System.out.println("Enter the following options ::\n1.Insert\t2.Update\t3.Delete\t4.Fetch\t5.exit");
            ch=Integer.parseInt(br.readLine());
            switch (ch){
                case 1://insert
                    System.out.println("Enter professor details:: Name,Gender, Dept ..");
                    Professor p=new Professor();
                    p.setPname(br.readLine());
                    p.setPgender(br.readLine());
                    p.setPdpt(br.readLine());
                    i= ProfessorDao.insertRecord(p);
                    if (i > 0) {
                        System.out.println(p);
                        System.out.println("Record added successfully");
                    } else {
                        System.out.println("Oops!!..Try Again");
                    }
                    break;

                case 2://update

                    System.out.println("Upate name with salutation...");
                    p=new Professor();
                    String salutation=br.readLine();
                    String gender=br.readLine();
                    i=ProfessorDao.updateRecord(salutation,gender);
                    if (i > 0) {
                        System.out.println(p);
                        System.out.println("Records updated successfully");
                    } else {
                        System.out.println("Oops!!..Try Again");
                    }
                    break;
                case 3://Delete

                    System.out.println("Delete record ..");

                    p=new Professor();
                    String dept=br.readLine();
                    i=ProfessorDao.deleteRecord(dept);
                    if (i > 0) {
                        System.out.println(p);
                        System.out.println("Records deleted successfully");
                    } else {
                        System.out.println("Oops!!..Try Again");
                    }

                    break;
                case 4://Fetch
                    System.out.println("Fetch records..");
                    l=ProfessorDao.fetchProfessor();
                    for (Professor p1:l) {
                        System.out.println(p1);
                    }
                    break;
                case 5://exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Caution :: Enter valid options");
            }

        }while(true);



    }
}
