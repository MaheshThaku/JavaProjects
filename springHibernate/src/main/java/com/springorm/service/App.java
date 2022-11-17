package com.springorm.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.departmentDao.departmentDao;
import com.springorm.departmentImpl.DepartmentDoaImpl;
import com.springorm.entity.Department;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cls = new ClassPathXmlApplicationContext("config.xml");
    	departmentDao depart =  cls.getBean("dept",DepartmentDoaImpl.class);
    	
    	Department nDept = new Department();
    	depart.addDep(nDept);
    	
    	Department dept2 =	depart.getDepartment(212);
    	System.out.println(dept2);
    	
//    	depart.delDept(dept2);
    	cls.close();
    	
    }
}
