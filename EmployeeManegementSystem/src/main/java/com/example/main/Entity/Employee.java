package com.example.main.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empId")
	private int empId;
	
	@Column(name = "empName", nullable = false)
	private String empName;
	
	@Column(name = "empCity", nullable = false)
	private String empCity;
	
	@Column(name = "empSalary", nullable = false)
	private int empSalary;
	
	@Column(name = "departmentId", nullable=false)
	private int departmentId;
	
//	@ManyToOne
//	@JsonIgnore
//	private List<Department> dep;
	
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

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Employee(int empId, String empName, String empCity, int empSalary, int departmentId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empSalary = empSalary;
		this.departmentId = departmentId;
	}
	
	public Employee() {
		
	}
	
	
}
