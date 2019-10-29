package com.fangpf.springbootmybatis.mapper;

import com.fangpf.springbootmybatis.entity.Department;
import com.fangpf.springbootmybatis.entity.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author fangpf
 * @version 1.0
 * @date 2019-10-24 16:33
 */

//指定这是一个操作数据库的mapper
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delet from department where id = #{id}")
    public int deletDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
