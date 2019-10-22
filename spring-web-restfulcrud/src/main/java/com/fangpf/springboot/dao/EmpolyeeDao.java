package com.fangpf.springboot.dao;

import com.fangpf.springboot.entities.Department;
import com.fangpf.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.ref.PhantomReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-21 14:51
 */

@Repository
public class EmpolyeeDao {

    public static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<>();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = null;
        String dateStr;

        dateStr = "1990-10-3";
        try {
            birthdayDate = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employees.put(1001, new Employee(1001,"E-AA","E-AA@163.com", 1, new Department(101,"D-401"), birthdayDate));

        dateStr = "1992-9-2";
        try {
            birthdayDate = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employees.put(1002, new Employee(1002,"E-BB","E-BB@163.com", 0, new Department(102,"D-402"), birthdayDate));

        dateStr = "1991-10-11";
        try {
            birthdayDate = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employees.put(1003, new Employee(1003,"E-CC","E-CC@163.com", 1, new Department(103,"D-403"), birthdayDate));

        dateStr = "1994-2-21";
        try {
            birthdayDate = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employees.put(1004, new Employee(1004,"E-DD","E-DD@163.com", 1, new Department(104,"D-404"), birthdayDate));

        dateStr = "1997-12-29";
        try {
            birthdayDate = df.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        employees.put(1005, new Employee(1005,"E-EE","E-EE@163.com", 0, new Department(105,"D-405"), birthdayDate));
    }

    private static Integer initId = 1006;

    public void save(Employee employee){
        if (employee.getId() == null){
            employee.setId(initId ++);
        }
//        System.out.println(employee);
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getEmployees(){
        return employees.values();
    }

    public Employee getEmpolyee(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }
}
