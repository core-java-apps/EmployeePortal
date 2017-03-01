package com.java.db;

import java.util.HashMap;
import java.util.Map;
import com.java.model.Department;
import com.java.model.Employee;
import com.java.model.MonthNumberEmployeeIdKey;
import com.java.model.PaySlip;

public class AppDB {
	// Employee
	public static Map<Integer, Employee> employeeDataMap = new HashMap<Integer, Employee>();
	// Department
	public static Map<Integer, Department> departmentDataMap = new HashMap<Integer, Department>();
	// PaySlip
	public static Map<MonthNumberEmployeeIdKey, PaySlip> paySlipdataMap = new HashMap<MonthNumberEmployeeIdKey, PaySlip>();

	// Employee
	public static void putAllEmployee(Map<Integer, Employee> dataMap) {
		employeeDataMap.putAll(dataMap);
	}

	public static Employee getEmployee(Integer key) {
		return employeeDataMap.get(key);
	}

	// Department
	public static void putAllDepartment(Map<Integer, Department> dataMap) {
		departmentDataMap.putAll(dataMap);
	}

	public static Department getDepartment(Integer key) {
		return departmentDataMap.get(key);
	}

	// PaySlip
	public static void putAllPaySlip(Map<MonthNumberEmployeeIdKey, PaySlip> dataMap) {
		paySlipdataMap.putAll(dataMap);
	}

	public static PaySlip getPaySlip(MonthNumberEmployeeIdKey key) {
		// TODO Auto-generated method stub
		return paySlipdataMap.get(key);
	}

}
