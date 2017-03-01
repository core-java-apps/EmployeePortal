package com.java.dao;

import com.java.model.Department;
import com.java.model.Employee;
import com.java.model.MonthNumberEmployeeIdKey;
import com.java.model.PaySlip;

/**
 * @author dkeshav
 *
 */
public interface IEmpMgrDao {
	Employee searchEmployee(int empId);

	Department searchDepartment(int deptId);

	PaySlip searchPaySlip(MonthNumberEmployeeIdKey key);

}
