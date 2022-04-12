package org.example;
import com.Dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
/**
 * Sailakshmi
 *Employee Spring Hibernate
 */
public class App 
{
    public static void main( String[] args )
    {
                ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
                EmployeeDao ed= (EmployeeDao) ap.getBean("edao");
                Employee e = new Employee();

                e.setName("Sailakshmi");
                e.setDesignation("java");
                e.setSalary(45700);
                ed.insert(e);
                ed.delete("Pavan");
                ed.update("Lahari",56000);


                List<Employee> emplist = ed.fetch();
                for (Employee emp : emplist) {
                    System.out.println(emp);

                }

            }
        }
