package com.fangpf.springbootmybatis.mapper;

import com.fangpf.springbootmybatis.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-29 14:47
 */

public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
