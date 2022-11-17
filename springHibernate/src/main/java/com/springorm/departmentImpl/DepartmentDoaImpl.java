package com.springorm.departmentImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.departmentDao.departmentDao;
import com.springorm.entity.Department;

public class DepartmentDoaImpl implements departmentDao{
	private HibernateTemplate ht;

	// To insert record of department
	@Override
	@Transactional
	public int addDep(Department dept) {
		this.ht.save(dept);
		return 1;
	}

	// To update record of department
	@Override
	@Transactional
	public int updateDept(Department dept) {
		ht.update(dept);
		return 1;
	}

	// To delete record of department
	@Override
	@Transactional
	public int delDept(Department dept) {
		ht.delete(dept);
		return 1;
	}

	// To get specific record
	@Override
	public Department getDepartment(int id) {
		Department dept = ht.get(Department.class, id);
		return dept;
	}

	// To get all records
	@Override
	public List<Department> getAllDept() {
		List<Department> deptList = ht.loadAll(Department.class);
		return deptList;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
