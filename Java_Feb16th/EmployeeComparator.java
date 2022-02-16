package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	
	int id;
	String name;
	float salary;
	
	Employee(int e_id,String e_name,float e_salary){
		id=e_id;
		name=e_name;
		salary=e_salary;
	}
	
	public String toString() {
        return ("Employee : id =" + id + " Salary : "+salary+ " Name : "+name);
	}
	
}

class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}


class BySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.salary-o2.salary);
	}
	
}

public class EmployeeComparator {

	public static void main(String[] args) {
		
		 ArrayList<Employee> list=new ArrayList<Employee>();
		 
	        list.add(new Employee(5,"Lakshmi",23000));
	        list.add(new Employee(3,"Pavan",45000));
	        list.add(new Employee(2,"Supriya",12000));
	        list.add(new Employee(1,"Anil",11000));
	        list.add(new Employee(4,"Ram",15000 ));
	        
	        
	        System.out.println("********BEFORE SORTING***********\n");
	        for (int i=0;i<list.size();i++){
	            System.out.println(list.get(i));
	        }

	        System.out.println("\n********AFTER SORTING BY NAME***********\n");
	        Collections.sort(list,new SortByName());
	        for (int i=0;i<list.size();i++){
	            System.out.println(list.get(i));
	        }
	        
	        System.out.println("\n********SORT BY SALARY***********\n");
	        Collections.sort(list, new BySalary());
	        for (int i=0;i<list.size();i++){
	            System.out.println(list.get(i));
	        }
	        
	        System.out.println("\n********SALARY GREATER THAN 15000***********\n");
		       for(Employee e : list) {
		    	   if(e.salary>15000)
		    	   System.out.println(e);
		       }
	        
	       
	}

}
/* 
********BEFORE SORTING***********

Employee : id =5 Salary : 23000.0 Name : Lakshmi
Employee : id =3 Salary : 45000.0 Name : Pavan
Employee : id =2 Salary : 12000.0 Name : Supriya
Employee : id =1 Salary : 11000.0 Name : Anil
Employee : id =4 Salary : 15000.0 Name : Ram

********AFTER SORTING BY NAME***********

Employee : id =1 Salary : 11000.0 Name : Anil
Employee : id =5 Salary : 23000.0 Name : Lakshmi
Employee : id =3 Salary : 45000.0 Name : Pavan
Employee : id =4 Salary : 15000.0 Name : Ram
Employee : id =2 Salary : 12000.0 Name : Supriya

********SORT BY SALARY***********

Employee : id =1 Salary : 11000.0 Name : Anil
Employee : id =2 Salary : 12000.0 Name : Supriya
Employee : id =4 Salary : 15000.0 Name : Ram
Employee : id =5 Salary : 23000.0 Name : Lakshmi
Employee : id =3 Salary : 45000.0 Name : Pavan

********SALARY GREATER THAN 15000***********

Employee : id =5 Salary : 23000.0 Name : Lakshmi
Employee : id =3 Salary : 45000.0 Name : Pavan
*/

