package com.java.model;

public class PaySlip {

	Employee employee;
	int month;
	Double salary;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PaySlip [employee=" + employee + ", month=" + month + ", salary=" + salary + "]";
	}

}
