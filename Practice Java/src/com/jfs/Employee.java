package com.jfs;

import java.util.Objects;

public class Employee {
	
	private int empId;
	private String empName;
	private int departmentId;
	
	public Employee (Employee other) {
		this.empId = other.empId;
		this.empName = other.empName;
		this.departmentId = other.departmentId;
		
	}

	public Employee(int empId, String empName, int departmentId) {
		this.empId = empId;
		this.empName = empName;
		this.departmentId = departmentId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", departmentId=" + departmentId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId);
		//return departmentId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return departmentId == other.departmentId && empId == other.empId && Objects.equals(empName, other.empName);
	}
	
	
}
