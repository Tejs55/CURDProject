package com.example.main.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.Entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
