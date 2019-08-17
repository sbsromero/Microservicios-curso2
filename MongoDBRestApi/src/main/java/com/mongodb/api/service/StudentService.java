package com.mongodb.api.service;

import java.util.Optional;

import com.mongodb.api.model.Student;

public interface StudentService {

	public Iterable<Student> findAll();

	public Student save(Student student);

	public Optional<Student> findById(String id);

	public void removeStudent(String id);
}
