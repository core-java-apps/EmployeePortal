package com.java.EmployeePortal;

import java.util.HashMap;
import java.util.Map;
import com.java.db.AppDB;
import com.java.model.*;
import com.java.service.*;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		// Employee
		Map<Integer, Employee> employeeDataMap = new HashMap<Integer, Employee>();
		Employee e1 = new Employee(1, "one1");
		Employee e2 = new Employee(2, "two2");
		Employee e3 = new Employee(3, "third3");

		employeeDataMap.put(e1.getEmpId(), e1);
		employeeDataMap.put(e2.getEmpId(), e2);
		employeeDataMap.put(e3.getEmpId(), e3);

		AppDB.putAllEmployee(employeeDataMap);

		IEmpMgrService service = new EmpMgrServiceImpl();
		Employee emp = null;
		try {
			emp = service.searchEmployee(3);
			System.out.println(emp);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// Department
		Map<Integer, Department> departmentDataMap = new HashMap<Integer, Department>();
		Department d1 = new Department(1, "department1");
		Department d2 = new Department(2, "department2");
		Department d3 = new Department(3, "department3");

		departmentDataMap.put(d1.getDeptId(), d1);
		departmentDataMap.put(d2.getDeptId(), d2);
		departmentDataMap.put(d3.getDeptId(), d3);

		AppDB.putAllDepartment(departmentDataMap);

		IEmpMgrService deptser = new EmpMgrServiceImpl();
		Department dept = null;
		try {
			dept = deptser.searchDepartment(3);
			System.out.println(dept);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// PaySlip
		Map<MonthNumberEmployeeIdKey, PaySlip> paySlipdataMap = new HashMap<MonthNumberEmployeeIdKey, PaySlip>();

		Employee e21 = new Employee(1, "NAME-1");
		PaySlip ps1 = new PaySlip();
		ps1.setEmployee(e1);
		ps1.setMonth(1);
		ps1.setSalary(234.56);

		paySlipdataMap.put(new MonthNumberEmployeeIdKey(ps1.getMonth(), e21.getEmpId()), ps1);
		System.out.println("paySlipdataMap:" + paySlipdataMap);
		AppDB.putAllPaySlip(paySlipdataMap);

		IEmpMgrService payser = new EmpMgrServiceImpl();
		PaySlip pay = null;
		try {
			pay = payser.searchPaySlip(1, 1);
			System.out.println(pay);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
