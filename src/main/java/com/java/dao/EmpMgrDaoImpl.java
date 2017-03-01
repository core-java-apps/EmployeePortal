package com.java.dao;

import com.java.db.AppDB;
import com.java.model.Department;
import com.java.model.Employee;
import com.java.model.MonthNumberEmployeeIdKey;
import com.java.model.PaySlip;

/**
 * @author dkeshav
 *
 */

public class EmpMgrDaoImpl implements IEmpMgrDao {

	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return AppDB.getEmployee(empId);
	}

	public Department searchDepartment(int deptid) {
		// TODO Auto-generated method stub
		return AppDB.getDepartment(deptid);
	}

	public PaySlip searchPaySlip(MonthNumberEmployeeIdKey key) {
		// TODO Auto-generated method stub
		return AppDB.getPaySlip(key);
	}

	
}
