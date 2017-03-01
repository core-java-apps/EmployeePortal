package com.java.service;

import com.java.dao.EmpMgrDaoImpl;
import com.java.dao.IEmpMgrDao;
import com.java.exceptions.DepartmentNotFoundException;
import com.java.exceptions.EmployeeNotFoundException;
import com.java.exceptions.PaySlipNotFoundException;
import com.java.model.Department;
import com.java.model.Employee;
import com.java.model.MonthNumberEmployeeIdKey;
import com.java.model.PaySlip;

public class EmpMgrServiceImpl implements IEmpMgrService {

	public Employee searchEmployee(int empId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		IEmpMgrDao dao = new EmpMgrDaoImpl();
		Employee emp = dao.searchEmployee(empId);
		if (emp == null) {
			throw new EmployeeNotFoundException(111201, "Employee not found for the employee id: " + empId);
		}

		return emp;
	}

	public Department searchDepartment(int deptId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		IEmpMgrDao dao = new EmpMgrDaoImpl();
		Department dept = dao.searchDepartment(deptId);
		if (dept == null) {
			throw new DepartmentNotFoundException(111301, "Dept not found for the dept id: " + deptId);
		}

		return dept;
	}

	public PaySlip searchPaySlip(int month, int empId) throws PaySlipNotFoundException {
		// TODO Auto-generated method stub
		IEmpMgrDao dao = new EmpMgrDaoImpl();

		PaySlip ps = dao.searchPaySlip(new MonthNumberEmployeeIdKey(month, empId));

		if (ps == null) {
			throw new PaySlipNotFoundException(111401, "PaySlip Not Found For Month: " + month + " and EmpId: " + empId);
		}

		return ps;
	}

}
