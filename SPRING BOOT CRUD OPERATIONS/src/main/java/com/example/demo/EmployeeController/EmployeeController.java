package com.example.demo.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.emprepo.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepository repo;
	
	@GetMapping("/get")
	public List<Employee> display(){
		return repo.findAll();
	}
	
	@PostMapping("/upload")
	public void Registration(@RequestBody Employee emp) {
		repo.save(emp);
	
	}
	
	@PatchMapping("/update/{id}")
	public  void update(@PathVariable Integer id,@RequestBody String fname) {
		Employee temp=repo.findById(id).get();
		temp.setFirstName(fname);
		repo.save(temp);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleting(@PathVariable Integer id) {
		repo.deleteById(id);
		return "User Deleted Successfully";
	}
	
	
	
	
	
	
	
	

}
