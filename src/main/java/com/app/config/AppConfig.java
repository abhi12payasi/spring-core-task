package com.app.config;

import com.app.bean.Department;
import com.app.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "prototype")
    @Autowired
    public List<String> taskList(String []tasks){
        return Arrays.asList(tasks);
    }

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setName("Abhishek Payasi");
        employee.setAge(24);
        employee.setSalary(87443.0);

        String tasks[] = {"Development","Deployment","Maintenance"};
        List<String> dataList = taskList(tasks);
        employee.setTaskList(dataList);

        String deptName = "IT";
        String dateWithFormat = "23-MAR-1995|dd-MMM-yyyy";
        Department department = new Department(deptName,dateWithFormat);
        employee.setDepartment(department);

        return employee;
    }
}
