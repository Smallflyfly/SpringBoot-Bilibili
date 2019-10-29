package com.fangpf.springbootmybatis.controller;

import com.fangpf.springbootmybatis.entity.Employee;
import com.fangpf.springbootmybatis.mapper.EmployeeMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-29 14:48
 */

@Controller
public class EmployeeController {

    @Resource
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    @ResponseBody
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }

    @RequestMapping(value = "/emp")
    @ResponseBody
    public Employee insertEmp(@RequestParam("lastName") String lastName,
                          @RequestParam("email") String email,
                          @RequestParam("gender") Integer gender,
                          @RequestParam("departmentId") Integer departmentId){

        Employee employee = new Employee();
        employee.setLastName(lastName);
        employee.setEmail(email);
        employee.setGender(gender);
        employee.setDepartmentId(departmentId);
        employeeMapper.insertEmp(employee);
        return employee;
    }
}
