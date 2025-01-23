package com.springproject.stud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface StudentRepository extends JpaRepository<student,Long> {

	

}
