package com.example.main.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Department {

	@Id
	@Column(name = "departmentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;

	@Column(name = "depName", nullable = false)
	private String depName;
	
	@Column(name = "depDescription", nullable = false)
	private String depDescription;
	
	
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepDescription() {
		return depDescription;
	}

	public void setDepDescription(String depDescription) {
		this.depDescription = depDescription;
	}

	public Department(int departmentId, String depName, String depDescription) {
		super();
		this.departmentId = departmentId;
		this.depName = depName;
		this.depDescription = depDescription;
	}

	public Department() {
		
	}

	
	
	
}
