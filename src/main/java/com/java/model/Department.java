package com.java.model;
/**
 * @author dkeshav
 *Department Class
 */
public class Department {

	private int deptId;
	private String departmentName;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department(int deptId, String departmentName) {
		this.deptId = deptId;
		this.departmentName = departmentName;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", departmentName=" + departmentName + "]";
	}

}
