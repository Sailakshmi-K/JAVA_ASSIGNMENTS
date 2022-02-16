package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1>{
	
	int id;
	String name;
	float salary;
	
	Employee1(int e_id,String e_name,float e_salary){
		id=e_id;
		name=e_name;
		salary=e_salary;
	}
	
	public String toString() {
        return ("Employee : id =" + id + " Salary : "+salary+ " Name : "+name);
	}

	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}

class BySalary1 implements Comparable<Employee1>{

	@Override
	public int compareTo(Employee1 o) {
		if(o.salary>15000)
			return 1;
		else
		return 0;
	}
	
}

public class EmployeeComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Employee1> list=new ArrayList<Employee1>();
		 
	        list.add(new Employee1(5,"Lakshmi",23000));
	        list.add(new Employee1(3,"Pavan",45000));
	        list.add(new Employee1(2,"Pinky",12000));
	        list.add(new Employee1(1,"Anil",11000));
	        list.add(new Employee1(4,"Ram",15000 ));
	        
	        
	        System.out.println("********BEFORE SORTING***********\n");
	        for (int i=0;i<list.size();i++){
	            System.out.println(list.get(i));
	        }
	        
	        Collections.sort(list);
	        System.out.println("\n********AFTER SORTING BY NAME***********\n");
	        for (int i=0;i<list.size();i++){
	            System.out.println(list.get(i));
	        }
	        
	        System.out.println("\n********SALARY GREATER THAN 15000***********\n");
	       for(Employee1 e : list) {
	    	   if(e.salary>15000)
	    	   System.out.println(e);
	       }
	        
	}

}
/*

********BEFORE SORTING***********

Employee : id =5 Salary : 23000.0 Name : Lakshmi
Employee : id =3 Salary : 45000.0 Name : Pavan
Employee : id =2 Salary : 12000.0 Name : Pinky
Employee : id =1 Salary : 11000.0 Name : Anil
Employee : id =4 Salary : 15000.0 Name : Ram

********AFTER SORTING BY NAME***********

Employee : id =1 Salary : 11000.0 Name : Anil
Employee : id =5 Salary : 23000.0 Name : Lakshmi
Employee : id =3 Salary : 45000.0 Name : Pavan
Employee : id =2 Salary : 12000.0 Name : Pinky
Employee : id =4 Salary : 15000.0 Name : Ram

********SALARY GREATER THAN 15000***********

Employee : id =5 Salary : 23000.0 Name : Lakshmi
Employee : id =3 Salary : 45000.0 Name : Pavan


*/
