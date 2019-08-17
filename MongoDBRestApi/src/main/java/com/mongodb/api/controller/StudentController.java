package com.mongodb.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.api.model.Student;
import com.mongodb.api.service.StudentService;

@RestController
@RequestMapping(value = "/api")
public class StudentController {

	@Autowired
	StudentService studentServicev1;

	@GetMapping(value = "/v1/students")
	public Iterable<Student> studentV1() {
		return studentServicev1.findAll();
	}

	@PostMapping(value = "/v1/students")
	public Student create(@RequestBody Student student) {
		return studentServicev1.save(student);
	}
}
