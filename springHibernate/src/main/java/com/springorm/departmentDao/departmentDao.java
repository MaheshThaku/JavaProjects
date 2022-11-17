package com.springorm.departmentDao;

import java.util.List;

import com.springorm.entity.Department;

public interface departmentDao {
	public int addDep(Department dept);
	public int updateDept(Department dept);
	public int delDept(Department dept);
	public Department getDepartment(int id);
	public List<Department> getAllDept();
}
