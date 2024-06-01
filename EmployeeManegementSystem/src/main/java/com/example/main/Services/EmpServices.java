package com.example.main.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.Entity.Employee;
import com.example.main.Repo.EmpRepo;

@Service
public class EmpServices {

	@Autowired
	EmpRepo repo;
	
	public Employee saveEmp(Employee emp) {
		Employee emp1 = this.repo.save(emp);
		return emp1;
	}
	
	public List<Employee> getAllEmp(){
		List<Employee> emp2 = this.repo.findAll();
		return emp2;
	}
	
	public Employee updateEmp(Employee emp, int empId) {
		Optional<Employee>opt = this.repo.findById(empId);
		
		if(opt.isPresent()) {
			Employee updateObj = opt.get();
			updateObj.setEmpName(emp.getEmpName());
			updateObj.setEmpCity(emp.getEmpCity());
			updateObj.setEmpSalary(emp.getEmpSalary());
			updateObj.setDepartmentId(emp.getDepartmentId());
			
			this.repo.save(updateObj);
		}
		return emp;
	}
	
	public Employee deleteEmp(int empID) {
		
		Optional <Employee> del = this.repo.findById(empID);
		Employee del1 = del.get();
		if(del.isPresent()) {
			this.repo.deleteById(empID);
		}
		return del1;
		
	}
}