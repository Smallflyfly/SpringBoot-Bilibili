package com.fangpf.springboot.controller;

import com.fangpf.springboot.dao.DepartmentDao;
import com.fangpf.springboot.dao.EmpolyeeDao;
import com.fangpf.springboot.entities.Department;
import com.fangpf.springboot.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Collection;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-21 14:15
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmpolyeeDao empolyeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    /**
     * @description:
     * 查询所有员工返回列表页面
     */
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = empolyeeDao.getEmployees();
//        System.out.println(empolyees);
        model.addAttribute("emps", employees);
        //thymeleaf默认会拼串
        //classpath:/templates/***.html
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
//        System.out.println(departments);
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
//        System.out.println(employee);
        empolyeeDao.save(employee);
        //redirect：重定向到一个地址 /代表当前项目路径
        //forward:表示转发到一个地址
//        return "forward:/emps";
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable Integer id, Model model){

        Employee employee = empolyeeDao.getEmpolyee(id);
        model.addAttribute("emp", employee);

        Collection<Department> departments = departmentDao.getDepartments();
//        System.out.println(departments);
        model.addAttribute("depts", departments);

        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
//        System.out.println(employee);
        empolyeeDao.save(employee);
        return "redirect:emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        empolyeeDao.delete(id);
        return "redirect:/emps";
    }

}
