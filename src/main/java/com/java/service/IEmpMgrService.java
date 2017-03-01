package com.java.service;

import com.java.exceptions.DepartmentNotFoundException;
import com.java.exceptions.EmployeeNotFoundException;
import com.java.exceptions.PaySlipNotFoundException;
import com.java.model.Department;
import com.java.model.Employee;
import com.java.model.PaySlip;

/**
 * @author dkeshav
 *
 */
public interface IEmpMgrService {

	public Employee searchEmployee(int empid) throws EmployeeNotFoundException;

	public Department searchDepartment(int deptId) throws DepartmentNotFoundException;

	//public PaySlip searchPaySlip(int month,int empId) throws PaySlipNotFoundException;
	
	public PaySlip searchPaySlip(int month,int empId) throws PaySlipNotFoundException;
	
}
