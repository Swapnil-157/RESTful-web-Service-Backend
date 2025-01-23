package com.springproject.stud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@GetMapping
	public List<student>getAll(){
		return studentservice.getAll();
	}
	
	@PostMapping
	public boolean createEntry(@RequestBody student mystud) {
		studentservice.saveEntry(mystud);
		return true;
	}
    @GetMapping("/{id}")
    public student getStudentById(@PathVariable Long id) {
    	return  studentservice.findById(id).orElse(null);
    	 
    }
   
    
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id) {
    	
            studentservice.deleteById(id);
            return "Record deleted Successfully";
           
        
        }
    	
    }
     

