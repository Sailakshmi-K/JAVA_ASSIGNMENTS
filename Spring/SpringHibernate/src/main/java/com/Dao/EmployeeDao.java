package com.Dao;
import org.example.Employee;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;
public class EmployeeDao {

    HibernateTemplate ht;

    public HibernateTemplate getHt() {
        return ht;
    }

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    @Transactional
    public int insert(Employee e){
        return (int)ht.save(e);
    }

    @Transactional
    public int update(String s, float sal){
        return ht.bulkUpdate("update Employee SET salary="+sal+" where name ='"+s+"'");
    }

    @Transactional
    public int delete(String s)
    {
        return ht.bulkUpdate("delete from Employee where name='"+s+"'");
    }

    @Transactional
    public List<Employee> fetch(){
        return ht.loadAll(Employee.class);
    }
}
