package com.example.main.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.Entity.Department;

@Repository
public interface DepartRepo extends JpaRepository<Department, Integer> {

}
