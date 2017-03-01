package com.java.model;

public class MonthNumberEmployeeIdKey {

	
	private int monthNum;
	private int empId;
	public int getMonthNum() {
		return monthNum;
	}
	public void setMonthNum(int monthNum) {
		this.monthNum = monthNum;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public MonthNumberEmployeeIdKey(int monthNum, int empId) {
		this.monthNum = monthNum;
		this.empId = empId;
	}
	public MonthNumberEmployeeIdKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MonthNumberEmployeeIdKey [monthNum=" + monthNum + ", empId=" + empId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + monthNum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MonthNumberEmployeeIdKey other = (MonthNumberEmployeeIdKey) obj;
		if (empId != other.empId)
			return false;
		if (monthNum != other.monthNum)
			return false;
		return true;
	}
	
	
	
}
