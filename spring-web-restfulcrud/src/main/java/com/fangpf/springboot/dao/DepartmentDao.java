package com.fangpf.springboot.dao;

import com.fangpf.springboot.entities.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-21 14:31
 */

@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departments=null;

    static {
        departments = new HashMap<>();
        departments.put(101, new Department(101,"D-401"));
        departments.put(102, new Department(102,"D-402"));
        departments.put(103, new Department(103,"D-403"));
        departments.put(104, new Department(104,"D-404"));
        departments.put(105, new Department(105,"D-405"));
    }

    public Collection<Department> getDepartments(){
        return departments.values();
    }

    public Department getDepartment(Integer id){
        return departments.get(id);
    }
}
