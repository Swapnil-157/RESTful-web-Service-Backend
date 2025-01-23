package com.springproject.stud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StudentService {

	@Autowired
	private StudentRepository studentrepository;
	
	public void saveEntry(student stud) {
		studentrepository.save(stud);
	}
	public List<student>getAll(){
		return studentrepository.findAll();
	}
	public Optional<student> findById(Long id) {
		return studentrepository.findById(id);
	}
	
	public void  deleteById(Long id) {
		 studentrepository.deleteById(id);
	}
	
}
