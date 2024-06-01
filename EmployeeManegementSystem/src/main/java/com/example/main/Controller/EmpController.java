package com.example.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.Entity.Employee;
import com.example.main.Services.EmpServices;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping
public class EmpController {
	
	@Autowired
	EmpServices dataServices;
	
	@PostMapping ("/enterEmp")
	public ResponseEntity<Employee>  enterEmp(@RequestBody Employee employee) {
		 Employee pEmp = this.dataServices.saveEmp(employee);
		 return ResponseEntity.status(HttpStatus.OK).body(pEmp);
	}

	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp() {
		List<Employee> gEmp = this.dataServices.getAllEmp();
		return gEmp;
		
	} 
	
	@PutMapping("/updateEmp/{empId}")
	public ResponseEntity<Employee> updateEmp(@RequestBody Employee upEmp, @PathVariable int empId) {
		Employee uEmp =  this.dataServices.updateEmp(upEmp, empId);
		return ResponseEntity.status(HttpStatus.OK).body(uEmp);
	}
	
	@DeleteMapping("/deleteEmp/{empId}")
	public  ResponseEntity<Employee> deleteEmp (@PathVariable int empId) {
		Employee dEmp = this.dataServices.deleteEmp(empId);
		return ResponseEntity.status(HttpStatus.OK).body(dEmp);
	}
}