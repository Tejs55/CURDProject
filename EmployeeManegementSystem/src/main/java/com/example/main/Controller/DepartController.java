package com.example.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.Entity.Department;
import com.example.main.Services.DepartServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping
public class DepartController {
	
	@Autowired
	DepartServices detailservices;
	
	@PostMapping("/enterData")
	public  ResponseEntity<Department> enterData(@RequestBody Department depart ){
		Department pDep = this.detailservices.saveDate(depart);
		return ResponseEntity.status(HttpStatus.OK).body(pDep);
		
	}
	
	@GetMapping("/showData")
	public List<Department> showAllDep() {
		List<Department> gDep= this.showAllDep();
		return gDep;
	}
	
	@PutMapping("/updateData/{id}")
	public String putMethodName(@PathVariable String id, @RequestBody String entity) {
		//TODO: process PUT request
		
		return entity;
	}
	
	
}
