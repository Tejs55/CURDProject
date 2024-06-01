package com.example.main.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.Entity.Department;
import com.example.main.Repo.DepartRepo;

@Service
public class DepartServices {

	@Autowired
	DepartRepo repo;
	
	public Department saveDate(Department depart) {
		Department dep1 = this.repo.save(depart);
		return dep1;
	}

	
	
	
}
